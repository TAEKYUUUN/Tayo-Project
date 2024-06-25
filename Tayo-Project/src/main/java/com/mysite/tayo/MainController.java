package com.mysite.tayo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@GetMapping("/tayo")
	@ResponseBody
	public String hello() {
		return "for(int i=YG; i<=취업; i++)는 할 수 있다!";
	}
}
