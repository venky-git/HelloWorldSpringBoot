package com.example.helloworld;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.helloworld.model.Input;
import com.example.helloworld.model.Output;

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

	/*
	 * GetMapping we can apply only on method level and RequestMapping annotation we
	 * can apply on class level and as well as on method level
	 */
	
	/*
	 * to use @ModelAttribute the Input ID from html should be same as the variables
	 * in the Model
	 */
	
	@GetMapping("/concatenate")
	public String subtract (@ModelAttribute Input input ,Model model) {
		
		System.out.println("Inside the Sub");
		System.out.println(input.getStringa());
		System.out.println(input.getStringb());
		
		String a = input.getStringa();
		String b = input.getStringb();
		String out_put = a + b;
		
		model.addAttribute("result_value", out_put);
		return "Result";
		
	}
	
	
	/* The values in the html are assigned though the output object */
	
	@GetMapping("/print")
	public String printvalue (@ModelAttribute Output output ,Model model) {
		
       String fname = output.getSfirst_name();
       String lname = output.getSlast_name();
       
       output.setSfirst_name(lname);
       output.setSlast_name(fname);

		model.addAttribute("output", output);
		return "Outview";
		
	}
	
}

