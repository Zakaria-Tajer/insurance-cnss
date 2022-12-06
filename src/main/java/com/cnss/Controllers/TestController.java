package com.cnss.Controllers;

import Models.Employee;
import Models.EmployeeDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    private ApplicationContext conn;
    @RequestMapping("/home")
    public String viewHome(Model model){
        return "home";
    }

    @RequestMapping("/register")
    public String viewRegister(Model model){
        conn =  new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Employee employee = conn.getBean("info", Employee.class);
        model.addAttribute("bean", employee);
        return "register";
    }


    @RequestMapping("/store")
    public String viewStore (@ModelAttribute("bean") Employee employee, Model model){
        conn = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        EmployeeDao obj = conn.getBean("dao", EmployeeDao.class);
        obj.saveData(employee);

        model.addAttribute("msg", "success");


        return "register";
    }
}
