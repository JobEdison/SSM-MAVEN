/**
 * 
 * 多多啦啦梦
 * Copyright (c) 2014-2016 ZhongHuaQiang,Inc.All Rights Reserved.
 */
package sy.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import sy.model.Stu;
import sy.service.StuService;

/**
 * 
 * @author Zhong
 * @version $Id: stuController.java, v 0.1 2016-5-25 上午9:34:44 Zhong Exp $
 */
@Controller
@RequestMapping("/stuController")
public class StuController {
   
    
    @Autowired
   
     private StuService stuService;
    
    @RequestMapping("/getName")
    public String getName(int age,HttpServletRequest request) {
       Stu stu= stuService.selectByAge(age);
       request.setAttribute("stu", stu);
        return "index";
        
    }
}
