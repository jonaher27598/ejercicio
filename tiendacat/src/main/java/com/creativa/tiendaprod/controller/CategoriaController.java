//package com.creativa.tiendaprod.controller;
//
//
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
//import com.creativa.tiendaprod.model.Categoria;
//import com.creativa.tiendaprod.service.CategoriaService;
//
//
//
//
//@Controller
//public class CategoriaController {
//	
//	private CategoriaService categoriaService;
//	
//	@Autowired(required=true)
//	@Qualifier(value="categoriaService")
//	public void setCategoriaService(CategoriaService cs){
//		this.categoriaService = cs;
//	}
//	
//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public String listCategoria(Model model) {
//		model.addAttribute("categoria", new Categoria());
//		model.addAttribute("list", this.categoriaService.list());
//		return "editCategoria";
//	}
//	
//	@ModelAttribute("categoria")
//    public Categoria formBackingObject() {
//        return new Categoria();
//    }
//
//	@PostMapping("/addCategoria")
//	public String savecategoria(@ModelAttribute("categoria") @Valid Categoria categoria, BindingResult result, Model model) {
//
//		if (result.hasErrors()) {
//			model.addAttribute("categoria", categoriaService.list());
//			return "editUsers";
//		}
//
//		categoriaService.save(categoria);
//		return "redirect:/";
//	}
//}
