package com.poscoict.helloweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//@RequestMapping : 클래스(타입) + 메소드(핸들러)

@Controller
@RequestMapping("/user")
public class UserController {
	

	@RequestMapping(value = "/join", method = RequestMethod.GET)
	public String join() {
		return "/WEB-INF/views/join.jsp";
	}
	
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(UserVo vo) {
		return "redirect:/main";
	}
	
	@ResponseBody
	@RequestMapping("/update")
	public String update(@RequestParam("n") String name) {
		// n이라는 이름의 파라미터가 없은 경우 400 bad request 에러가 발생한다.
		System.out.println(name);
		return "UserController.update(" + name + ")";
	}
	
	@ResponseBody
	@RequestMapping("/update2")
	public String update2(
			@RequestParam(value="n", required=true, defaultValue="") String name,
			@RequestParam(value="a", required=true, defaultValue="0") Integer age) {
		// n이라는 이름의 파라미터가 없은 경우 400 bad request 에러가 발생한다.
		System.out.println("-----"  + name + "-----");
		System.out.println("-----"  + age + "-----");
		return "UserController.update(" + name + ")";
	}

}
