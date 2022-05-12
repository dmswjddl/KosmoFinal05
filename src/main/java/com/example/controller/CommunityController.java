package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/include/community")
public class CommunityController {

	@RequestMapping("/daily")
	public void daily() {
	}
	
	@RequestMapping("/dailyDetail")
	public void dailyDetail() {
	}
	
	
	
}
