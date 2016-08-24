package com.pratik;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@RequestMapping("/test")
	public String getMovie()
	{
		return "Sholay!";
	}
}
