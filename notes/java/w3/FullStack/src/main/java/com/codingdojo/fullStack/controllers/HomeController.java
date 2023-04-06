package com.codingdojo.fullStack.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.fullStack.models.LoginUser;
import com.codingdojo.fullStack.models.Puppy;
import com.codingdojo.fullStack.models.User;
import com.codingdojo.fullStack.services.PuppyServ;
import com.codingdojo.fullStack.services.UserServ;

@Controller
public class HomeController {
    @Autowired
    private UserServ userServ;
    
    @Autowired
    private PuppyServ puppyServ;
    
// =================================
//				MAIN
// =================================    
	@GetMapping("/")
    public String index() {
        return "index.jsp";
    }
	
	@GetMapping("/logReg")
	public String logReg(Model model, HttpSession session){
		// check for session
		if(session.getAttribute("userID") != null) {
			return "redirect:/dashboard";
		}
		// Bind empty User and LoginUser objects to the JSP
        // to capture the form input
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
		return "logReg.jsp";
	}
	
// =================================
// 			LOGIN / REG
// =================================
    
    @PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
        // call a register method in the service 
        // to do some extra validations and create a new user!
        userServ.register(newUser, result);
        if(result.hasErrors()) {
            // Be sure to send in the empty LoginUser before 
            // re-rendering the page.
            model.addAttribute("newLogin", new LoginUser());
            return "logReg.jsp";
        }
        
        // No errors! 
        // Store their ID from the DB in session, i.e. log them in.
        session.setAttribute("userID", newUser.getId());
        return "redirect:/dashboard";
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {    
        // Add once service is implemented:
        User user = userServ.login(newLogin, result);
    
        if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "logReg.jsp";
        }
    
        // No errors! 
        // Store their ID from the DB in session, i.e. log them in.
        session.setAttribute("userID", user.getId());
        return "redirect:/dashboard";
    }
    
    // logout - *** CB ***
    @GetMapping("/logout")
    public String logout(HttpSession session) {
    	session.invalidate();
    	return "redirect:/";
    }
 
// =================================
//			   PUPPY
// =================================
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, @ModelAttribute("puppy") Puppy puppy, Model model) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/loginReg";
    	}
    	model.addAttribute("allPuppies", puppyServ.getAll());
    	model.addAttribute("user", userServ.getOne((Long) session.getAttribute("userID")));
    	return "dashboard.jsp";
    }
    
    // create
    @GetMapping("/addPuppy")
    public String addPuppy(@ModelAttribute("puppyForm") Puppy puppy, Model model) {
    	return "addPuppy.jsp";
    }
    @PostMapping("/createPuppy")
    public String createPuppy(@Valid @ModelAttribute("puppyForm") Puppy puppy, BindingResult result, Model model) {
    	if(result.hasErrors()) {
    		return "addPuppy.jsp";
    	}
    	else {
    		puppyServ.createOne(puppy);
    		return "redirect:/dashboard";
    	}
    }
    
}
