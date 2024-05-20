package com.jtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jtc.entity.Product;

@Controller
public class ProductController {
	
	@GetMapping("/")
	public String loadForm(Model model) {
		
		model.addAttribute("p", new Product());
		return "index";
	}

}

