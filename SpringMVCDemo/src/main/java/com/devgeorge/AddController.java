package com.devgeorge;


import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.devgeorge.service.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletRequest response) {
		int firstNumber =Integer.parseInt(request.getParameter("first")) ;
		int secondNumber = Integer.parseInt(request.getParameter("second"));
		 AddService as = new AddService();
		 
		 int result = as.add(firstNumber, secondNumber);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",result);
		
		return mv;
	}

}
