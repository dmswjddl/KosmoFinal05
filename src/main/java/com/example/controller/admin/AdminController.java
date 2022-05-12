package com.example.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	
	@RequestMapping("/indexAdmin")
	public void adminPage() {
	}
	
	@RequestMapping("/pages/charts/chartsjs")
	public void charts() {
		
	}	
	
	@RequestMapping("/adminMember")
	public void memberPage() {
		
	}

}
