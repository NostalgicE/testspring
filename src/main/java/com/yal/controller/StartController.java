package com.yal.controller;

import com.yal.pojo.Pharmaceutical;
import com.yal.service.PharmaceuticalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class StartController {

    @Autowired
    PharmaceuticalService ps;


    @RequestMapping("/test/hello")
    public String toHello(Model model) {
        System.out.println("进来方法了");
        int id =5;
        Pharmaceutical pm = ps.selectByPrimaryKey(id);
        System.out.println(pm.getName());
        System.out.println(pm.getBrand());
        System.out.println(pm.getPrice());
        System.out.println("我的天呐!!!");
        model.addAttribute("yaop",pm);
        return "shouye";
    }


}
