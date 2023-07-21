package com.adarsh.ShopWebsite.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adarsh.ShopWebsite.Repository.MycartRepository;
import com.adarsh.ShopWebsite.dto.MyCartList;

@Service
public class MyCartService {

	@Autowired
	private MycartRepository mycartRepository;
	
	public void cartsave(MyCartList cartList) {
		mycartRepository.save(cartList);
	} 
	public List<MyCartList> cartgetAll() {
		return mycartRepository.findAll();
		
	}
	
	public void deleteByIcon(int id) {
		mycartRepository.deleteById(id);
	}
	
}
