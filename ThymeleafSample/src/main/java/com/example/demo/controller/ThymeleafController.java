package com.example.demo.controller;

import com.example.demo.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("show")
    public String showView(Model model){
        List<Member> members = new ArrayList<>();
        members.add(new Member(1,"파즈"));
        members.add(new Member(2,"시타"));
        members.add(new Member(3,"로라"));

        model.addAttribute("members", members);


        return "useThymeleaf";
    }
}
