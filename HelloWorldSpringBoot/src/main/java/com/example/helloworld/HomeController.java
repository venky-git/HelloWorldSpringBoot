package com.example.helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("Hello World from Spring Boot Controller");
		return "Home";
	}
	
	/*
	 * Receive the variable from the html (VIEW) and send them back html using Model
	 * and View
	 */
	
	@RequestMapping("/Welcome")
	public ModelAndView welcome(HttpServletRequest request, HttpServletResponse response) {
		
		String FirstName = request.getParameter("fname");
		String LastName = request.getParameter("lname");
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println("welcome from Spring Boot Controller");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		mv.addObject("lname",LastName);
		mv.addObject("fname",FirstName);
		return mv;
	}
	
	/*
	 * Receive the variable from the html (VIEW) and send them back html using RequestParam
	 */
	
	@RequestMapping("add")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j) {
		
		int k = i + j;
        

		System.out.println("Inside the add Function");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Result");
		mv.addObject("result_value",k);
		
		return mv;
	}

	
}
