package com.cy.pj.service;

import java.util.List;

import com.cy.pj.pojo.Goods;

public interface GoodService {
	
		   
		
		
	 List<Goods> findObjects();
		 
	 int deleteById(Integer id);
	

	int saveObject(Goods entity);

}
