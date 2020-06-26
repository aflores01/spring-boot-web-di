package com.learning.springboot.di.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learning.springboot.di.app.models.service.IService;

@Controller
public class IndexController {
	
	//Autowired: Busca un bean que esté registrado por spring y lo inyecta
	@Autowired
	@Qualifier("MyService")
	private IService service;

	@GetMapping({"/index","/",""})
	public String index(Model model) {
		model.addAttribute("objeto",service.operacion());
		return "index";
	}
	
	

}
