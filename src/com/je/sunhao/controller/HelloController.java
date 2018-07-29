package com.je.sunhao.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller{
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse resp) throws Exception {
		System.out.println("-----hello controller-------"); 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hell");
		mv.addObject("msg", "first spring1 mvc app");
		return mv;
	}
}
