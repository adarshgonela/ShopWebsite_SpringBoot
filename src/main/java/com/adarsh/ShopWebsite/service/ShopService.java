package com.adarsh.ShopWebsite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adarsh.ShopWebsite.Repository.ShopRepository;
import com.adarsh.ShopWebsite.dto.ShopEntity;
@Service
public class ShopService {

	@Autowired
	private ShopRepository repository;
	
	public void save(ShopEntity shopEntity) {
		repository.save(shopEntity);
	}
	
	public List<ShopEntity> getAllItems() {
		return repository.findAll() ;
	}
	
	public ShopEntity getitembyID(int id) {
		return repository.findById(id).get();
	}
	
	
	public void deletebyID(int id) {
		repository.deleteById(id);
	}
}
