package com.dkit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dkit.domain.Student;

@Controller
public class StudentController {
	@GetMapping(value= {"/","/register"})
	public String loadForm(Model model) {
		//Sending from binding Object to UI
		Student s=new Student();
		model.addAttribute("student",s);
		
		//Returning logical view to UI
		return "studentReg";
	}
	@PostMapping(value="/register")
	public String handleSubmitBtn(@ModelAttribute("student")Student s,Model model) {
		System.out.println(s);
		
		//Sending response to UI
		model.addAttribute("succMsg", "Registeration Successfull");
		
		//Returning logical view name
		return "studentReg";
	}
}
