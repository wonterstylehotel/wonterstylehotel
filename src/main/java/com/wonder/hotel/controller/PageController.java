package com.wonder.hotel.controller;

import javax.websocket.server.PathParam;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	@RequestMapping("greenn/{page}")
	public  String page(@PathVariable("page") String page) {
		return "greennroom/"+page;
	}
}
