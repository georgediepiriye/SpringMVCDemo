package com.george;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

	@RequestMapping("/add")
		public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
			int firstNumber = Integer.parseInt(request.getParameter("first"));
			int secondNumber = Integer.parseInt(request.getParameter("second"));
			int result = firstNumber + secondNumber;
			
			ModelAndView mv = new ModelAndView();
			mv.setViewName("display.jsp");
			mv.addObject("result",result);
			return mv;
			
			
		}
}
