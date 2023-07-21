package com.adarsh.ShopWebsite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.adarsh.ShopWebsite.dto.MyCartList;
import com.adarsh.ShopWebsite.dto.ShopEntity;
import com.adarsh.ShopWebsite.service.MyCartService;
import com.adarsh.ShopWebsite.service.ShopService;
 
@Controller
public class ShopController {

	@Autowired
	private ShopService service;
	
	@Autowired	
	private MyCartService myCartService; 

	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/shop_register")
	public String ShopRegister() {
		return "Shopregister";
	}
	@GetMapping("/availableitems")
	public ModelAndView getAllItems() {
		List<ShopEntity> list=service.getAllItems();
//		ModelAndView andView=new ModelAndView();
//		andView.setViewName("booklist");
//		andView.addObject("shop",list);
//		////or////
		return new ModelAndView("booklist","shop",list);
		/////
		
		
	}
	
	@PostMapping("/save")
	public String additems(@ModelAttribute ShopEntity b) {
		service.save(b);
		return  "redirect:/availableitems";
	}
	
	@GetMapping("/mycart")
	public String getmyycart(Model model) {
		List<MyCartList> list=myCartService.cartgetAll();
		model.addAttribute("shop",list);
		return "mycart";
	}
	
	@RequestMapping("/mycart/{id}")
	public String Getmycart(@PathVariable("id") int id) {
		ShopEntity b=service.getitembyID(id);
		MyCartList cartList=new MyCartList(b.getId(),b.getName(),b.getQuantity(),b.getPrice());
		myCartService.cartsave(cartList);
		return "redirect:/mycart";
	}
	
	
	@RequestMapping("/edititem/{id}")
	public String edititem(@PathVariable int id,Model model) {
	ShopEntity b=	service.getitembyID(id);
		model.addAttribute("item",b);
		return "edit";
	
	}
	@RequestMapping("/deleteitem/{id}")
	public String deleteitem(@PathVariable int id) {
		service.deletebyID(id);
		return "redirect:/availableitems";
	}
	
	
}
