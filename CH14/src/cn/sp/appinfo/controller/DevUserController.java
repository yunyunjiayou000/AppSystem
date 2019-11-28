package cn.sp.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sp.appinfo.entity.DevUser;
import cn.sp.appinfo.service.DevUserService;

@Controller
@RequestMapping("/user")
public class DevUserController {

	@Resource
	private DevUserService devUserService;

	@RequestMapping("/login")
	public String Dologin() {
		return "devlogin";
	}
	@RequestMapping("/dologin")
	public String login(String devCode,String devPassword,HttpSession session,Model model){
		 DevUser user  =devUserService.Select_DevUser(devCode, devPassword);
		 if(user!=null){
			 session.setAttribute("devName", user.getDevName());
			 return "developer/main";
		 }else{
			 model.addAttribute("error", "账户或密码不正确！");
			 return "devlogin";
		 }
		
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "devlogin";
	}
}
