package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/EmpObject")
    public String loadFormPage(Model model){
        model.addAttribute("EmpObject", new EmpObject());
        return "EmpObject";

    }
    @PostMapping("/EmpObject")
    public String loadFromPage(@ModelAttribute EmpObject empObject,
                                        Model model){
        model.addAttribute("EmpObject", empObject);
                return "confirmempObject";

    }
}
