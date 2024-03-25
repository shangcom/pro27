package com.myspring.pro27.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	

	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String  hi() throws Exception{
		
		return "hi1";
	}

}
