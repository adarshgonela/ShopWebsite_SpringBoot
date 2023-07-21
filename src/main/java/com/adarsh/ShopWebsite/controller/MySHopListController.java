package com.adarsh.ShopWebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adarsh.ShopWebsite.dto.ShopEntity;
import com.adarsh.ShopWebsite.service.MyCartService;
import com.adarsh.ShopWebsite.service.ShopService;

@Controller
public class MySHopListController {

	@Autowired
	private MyCartService cartService;
	
	@Autowired
	private ShopService service;
	
	@RequestMapping("/deleteMyCart/{id}")
	public String deleteMyShopList(@PathVariable int id) {
		cartService.deleteByIcon(id);
		return "redirect:/mycart";
	}
	@RequestMapping("/edititem/(id)")
	public String editItem(@PathVariable int id,Model model ) {
		ShopEntity s=service.getitembyID(id);
		model.addAttribute("item",s);
		return "edit";
	}
}
