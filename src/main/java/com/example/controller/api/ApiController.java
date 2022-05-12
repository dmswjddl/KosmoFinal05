package com.example.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.DogDAO;
import com.example.domain.Room;

@Controller
@RequestMapping("/api")
@ResponseBody
public class ApiController {
	
	@Autowired
	private DogDAO dao;
	
	@RequestMapping(value = "/getRoomNumApi",produces = "application/text; charset=UTF-8")
	public String getRoomNumApi(Room room) {
		
		return dao.getRoomNum(room).getCount();
	}
}
