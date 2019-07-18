package com.cy.pj.sys.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 在controller负责所有页面的呈现
 */
@Controller
@RequestMapping("/")
public class PageController {
	@RequestMapping("IndexUI")
	public String doIndexUI() {
		System.out.println("doIndexUI");
		return "index";
	}

}






