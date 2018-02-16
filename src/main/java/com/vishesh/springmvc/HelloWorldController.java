package com.vishesh.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// controller method to show the form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	// controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	// new controller to read the data from form and
	// add the data to model
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		// get the input
		String theName = request.getParameter("studentName");

		// make it uppercase
		theName = theName.toUpperCase();

		// create the message
		String result = "Yo! " + theName;

		// add the data to model
		model.addAttribute("message", result);

		return "helloworld";
	}

	// new controller to read the data from form and
	// add the data to model
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {

		// make it uppercase
		theName = theName.toUpperCase();

		// create the message
		String result = "Hey! " + theName;

		// add the data to model
		model.addAttribute("message", result);

		return "helloworld";
	}
}
