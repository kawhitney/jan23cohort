package com.codingdojo.loginReg.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.loginReg.models.Book;
import com.codingdojo.loginReg.services.BookServ;
import com.codingdojo.loginReg.services.UserServ;

@Controller
public class BookController {
    @Autowired
    private BookServ bookServ;
    
    @Autowired
	private UserServ userServ;
    
    // READ ALL
    @GetMapping("/books")
    public String books(HttpSession session, Model model) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/logReg";
    	}
    	model.addAttribute("user", userServ.getOne((Long)session.getAttribute("userID")));
    	model.addAttribute("allBooks", bookServ.getAll());
        return "books.jsp";
    }
    
    // CREATE
    @GetMapping("/books/new")
    public String addBook(HttpSession session, Model model, @ModelAttribute("modelForm") Book book) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/logReg";
    	}
        return "addBook.jsp";
    }
    @PostMapping("/books/new")
    public String addBook(@Valid @ModelAttribute("modelForm") Book book, BindingResult result, Model model, HttpSession session) {
        if(result.hasErrors()) {
            return "addBook.jsp";
        } else {
            bookServ.createOne(book);
            return "redirect:/books";
        }
    }
    
    // READ ONE
    @GetMapping("/books/{id}")
    public String viewBook(@PathVariable("id") Long id, HttpSession session, Model model) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/logReg";
    	}
    	model.addAttribute("book", bookServ.getOne(id));
        return "viewBook.jsp";
    }
    
    // EDIT
    @GetMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id") Long id, HttpSession session, Model model, @ModelAttribute("modelForm") Book book) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/logReg";
    	}
    	model.addAttribute("book", bookServ.getOne(id));
        return "editBook.jsp";
    }
    @PutMapping("/books/{id}/edit")
    public String editBook(@PathVariable("id") Long id, @Valid @ModelAttribute("modelForm") Book book, BindingResult result, Model model, HttpSession session) {
        if(result.hasErrors()) {
        	model.addAttribute("book", bookServ.getOne(id));
            return "editBook.jsp";
        } else {
            bookServ.updateOne(book);
            return "redirect:/books/{id}";
        }
    }
    
    // DELETE
    @PostMapping("/books/{id}/delete")
    public String deleteBook(@PathVariable("id") Long id, HttpSession session, Model model, @ModelAttribute("modelForm") Book book) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/logReg";
    	}
    	bookServ.deleteOne(id);
        return "redirect:/books";
    }
}
