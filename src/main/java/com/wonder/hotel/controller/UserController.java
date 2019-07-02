package com.wonder.hotel.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.druid.util.StringUtils;
import com.wonder.hotel.entity.User;
import com.wonder.hotel.service.UserService;


@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping("login")
	public String login(String userName,String password
					,HttpSession session,HttpServletRequest request) {
		boolean flag=false;
		if (StringUtils.isEmpty(userName)) {
			request.setAttribute("msg", "用户名不能为空！！");
			flag=true;
		}else if (StringUtils.isEmpty(password)) {
			request.setAttribute("msg", "密码不能为空！！");
			flag=true;
		}else {
			User user = userService.getUserByName(userName);
			if (null!=user) {
				if (user.getPassword().equals(password)) {
					session.setAttribute("loginUser", user);
				}else {
					request.setAttribute("msg", "用户名密码不匹配！！");
					flag=true;
				}
			}else {
				request.setAttribute("msg", "用户名不存在！！");
				flag=true;
			}
		}
		if (!flag) {
			return "redirect:sys/main";
		}
		return "greennroom/login";
	}
	@RequestMapping("sys/main")
	public String main() {
		return "greennroom/main";
	}
}
