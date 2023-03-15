package com.tech.spring.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.Json;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.google.gson.Gson;
import com.tech.spring.dto.BoardDto;
import com.tech.spring.dto.UserDto;
import com.tech.spring.service.CustomUserService;


@Controller
public class CustomJQGridController {

	@Autowired CustomUserService service;
	@Autowired ServletContext context;

	//1월17일 jqgrid 페이지
	@RequestMapping("/jqgrid") 
	public String jqgrid() {
		return "jqgrid";
	}
	
	//1월17일 jqgrid 유저목록
	@RequestMapping("/user")
	@ResponseBody
	public List<UserDto> user() {
		List<UserDto> user=service.user();
		System.out.println(user.toString());
		return user;
	}
	
}