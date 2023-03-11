package com.example.demo.controller;

import com.example.demo.form.Form;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class RequestParamController {

    @GetMapping("show")
    public String showView() {
        return "entry";
    }

//    @PostMapping("confirm") //post 메서드로 온 URL(/confirm)에 대응한다.
//    //요청 파라미터
//    public String confirmView(Model model, @RequestParam String name, @RequestParam Integer age,
//                              @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) @RequestParam LocalDate birth123) {
//        model.addAttribute("name",name);
//        model.addAttribute("age",age);
//        model.addAttribute("birth1",birth123);
//
//        return "confirm";
//    }

    @PostMapping("confirm")
    public String confirmView(Form f) {
        return "confirm2";
    }
}
