package cn.sp.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sp.appinfo.entity.BackendUser;
import cn.sp.appinfo.service.BackendUserService;

@Controller
@RequestMapping("/backenduser")
public class BackendUserController {

	@Resource
	private BackendUserService backendUserService;
	
	@RequestMapping("/dologin")
	public String dologin(){
		return "backendlogin";
	}
	@RequestMapping("login")
	public String login(String userCode,String userPassword,HttpSession session,Model model){
		BackendUser backendUser =backendUserService.Select_BackendUser(userCode, userPassword);
		if(backendUser!=null){
			session.setAttribute("userName",backendUser.getUserName() );
			return "backend/main";
		}else{
			model.addAttribute("error", "’ÀªßªÚ√‹¬Î¥ÌŒÛ£°");
			return "backendlogin";
		}
	}
	@RequestMapping("/logout")
	public String logout(HttpSession session){
		session.invalidate();
		return "backendlogin";
	}
}
