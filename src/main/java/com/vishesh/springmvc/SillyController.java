package com.vishesh.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SillyController {

	// controller method to show the form
	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly";
	}

}
