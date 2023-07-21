package com.adarsh.ShopWebsite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adarsh.ShopWebsite.dto.ShopEntity;
@Repository
public interface ShopRepository extends JpaRepository<ShopEntity, Integer>{

}
