package com.creativa.tiendaprod.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.creativa.tiendaprod.model.Categoria;
import com.creativa.tiendaprod.service.CategoriaService;





@Controller
public class HomeController {

	private CategoriaService userService;

	

//
//	@GetMapping("/")
//	public String userForm(Locale locale, Model model) {
//		CategoriaDaoImp x = new CategoriaDaoImp();
//		model.addAttribute("lista", x.list());
//		return "editCategoria";
//	}

	
}