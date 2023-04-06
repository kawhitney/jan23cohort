package com.codingdojo.crudApp.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.crudApp.models.Category;
import com.codingdojo.crudApp.models.Sticker;
import com.codingdojo.crudApp.services.CatServ;
import com.codingdojo.crudApp.services.StickerServ;

@Controller
public class HomeController {
    @Autowired
    private CatServ catServ;
    
    @Autowired
    private StickerServ stickerServ;
    
// =======================================
//				MAIN ROUTES
// =======================================
    
    @GetMapping("/") // reserve route
    public String index(HttpSession session, @ModelAttribute("sticker") Sticker sticker, Model model) {
    	model.addAttribute("allStickers", stickerServ.getAll());
        return "index.jsp"; // map route to jsp
    }
    
    @GetMapping("/dashboard")
    public String dashboard(HttpSession session, Model model) {
    	if(session.getAttribute("catID") == null) {
    		return "redirect:/";
    	}
    	model.addAttribute("cat", catServ.getOne((Long)session.getAttribute("catID")));
    	return "dashboard.jsp";
    }
    
// =======================================
//			  CATEGORY ROUTES
// =======================================
    // create
    @GetMapping("/addCategory")
    public String addCategory(@ModelAttribute("categoryForm") Category category) {
    	return "addCategory.jsp";
    }
    @PostMapping("/createCategory")
    public String createCategory(@Valid @ModelAttribute("categoryForm") Category category, BindingResult result, Model model, HttpSession session) {
    	if(result.hasErrors()) {
    		return "addCategory.jsp";
    	}
    	catServ.createOne(category);
    	session.setAttribute("catID", category.getId()); // NEEDS to be after create if getting id
    	return "redirect:/dashboard";
    }
    
// =======================================
//			  STICKER ROUTES
// =======================================
    // create
    @GetMapping("/addSticker")
    public String addSticker(@ModelAttribute("stickerForm") Sticker sticker, Model model) {
    	model.addAttribute("allCats", catServ.getAll());
    	return "addCategory.jsp";
    }
    @PostMapping("/createSticker")
    public String createCategory(@Valid @ModelAttribute("stickerForm") Sticker sticker, BindingResult result, Model model, HttpSession session) {
    	if(result.hasErrors()) {
    		model.addAttribute("allCats", catServ.getAll());
    		return "addSticker.jsp";
    	}
    	stickerServ.createOne(sticker);
    	return "redirect:/dashboard";
    }
}
