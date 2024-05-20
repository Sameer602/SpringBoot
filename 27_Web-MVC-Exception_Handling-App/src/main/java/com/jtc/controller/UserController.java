package com.jtc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	           @GetMapping("/user")
	          public String getWishMsg(Model model) {
			  String msgTxt="Good Morning";
			  String s=null;
			  s.length();
			  model.addAttribute("msg",msgTxt);
			   return "index";
		  }
		  
}
