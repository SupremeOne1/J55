package com.example.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/u")
	public String index(Model model) {
		model.addAttribute("message", "Welcome Spring");
		return "index";
	}
	
//	@RequestMapping("/")
//	public String index(Model model) {
//
//	Student st = new Student();
//	st.setName("Nguyen Van A");
//	model.addAttribute("student", st);
//	return "index";
//	}
//	
//	@Autowired
//    private HttpServletRequest request;
//    @Autowired
//    private HttpServletResponse response;
//    @Autowired
//    private HttpSession session;
//
//    @RequestMapping("/1")
//        public String page1(Model model) {
//        String name = request.getParameter("name");
//        request.setAttribute("name", name);
//        response.addCookie(new Cookie("username", name.replace(" ", "_")));
//        session.setAttribute("name", name);
//        return "page1";
//    }
//    
//    @RequestMapping("/2")
//    public String page2(Model model) {
//        String username = "";
//        for(Cookie c : request.getCookies()){
//            if(c.getName().equals("username")) {
//                username = c.getValue();
//            }
//        }
//        request.setAttribute("username", username);
//        return "page2";
//    }


}
