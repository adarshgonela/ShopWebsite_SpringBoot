package com.adarsh.ShopWebsite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adarsh.ShopWebsite.dto.MyCartList;
@Repository
public interface MycartRepository extends JpaRepository<MyCartList, Integer>{

}
