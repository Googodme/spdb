package com.ltp.spdb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.ltp.spdb.Repository.Grades;
import com.ltp.spdb.Service.GreadesService;

@Controller
public class homeController {

    @Autowired
    GreadesService gradesService;
    
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("grades",gradesService.getNewGrade());
        return "Form";
    }

    @PostMapping("/handleForm")
    public String handleSubmit(Grades grade){
        gradesService.addGrades(grade);
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String showHome(Model model){
        model.addAttribute("grades",gradesService.getGrades());
        return "home";
    }
}
