package com.cy.pj.service;

import java.util.List;

import org.apache.ibatis.io.ResolverUtil.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.dao.GoodDao;
import com.cy.pj.pojo.Goods;

@Service
public class GoodServiceImpl implements GoodService {
	private static final Logger logger = 
			LoggerFactory.getLogger(GoodServiceImpl.class);
	@Autowired
	private GoodDao goodsDao;
	@Override
	public int saveObject(Goods entity) {
		//1.对参数进行校验
		//2.保存对象
		long start=System.currentTimeMillis();
		int rows=goodsDao.insertObject(entity);
		long end=System.currentTimeMillis();
		logger.info("execute time: {}",(end-start));
		return rows;
	}
	
	@Override
	public int deleteById(Integer id) {
		long start=System.currentTimeMillis();
		int rows=goodsDao.deleteById(id);
		long end=System.currentTimeMillis();
		logger.info("execute time: {}",(end-start));
		return rows;
	}
	
	@Override
	public List<Goods> findObjects() {
		long start=System.currentTimeMillis();
		List<Goods> list=goodsDao.findObjects();
		long end=System.currentTimeMillis();
		//System.out.println("execute time:"+(end-start));
		logger.info("execute time: {}",(end-start));
		return list;
	}
	
	

}