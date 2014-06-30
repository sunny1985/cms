package com.xinxinyu.cms.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.xinxinyu.cms.dao.IUserInfoDao;
import com.xinxinyu.cms.pojo.UserInfo;

@Controller
public class TextController {
	
	@Autowired
	private IUserInfoDao dao;
	
	public TextController() {}  
    @RequestMapping(value = "/login/{user}", method = RequestMethod.GET)  
    public ModelAndView myMethod(HttpServletRequest request,HttpServletResponse response,   
            @PathVariable("user") String user, ModelMap modelMap) throws Exception {  
        modelMap.put("loginUser", user);  
        return new ModelAndView("/login/hello", modelMap);  
    }  
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)  
    public String registPost() {
    	
    	UserInfo user = new UserInfo();
		
		user.setId(111);
		user.setAge(21);
		user.setName("aaa");
		
		dao.save(user);
        return "/welcome";  
    }  
}
