package com.cy.pj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.cy.pj.pojo.Goods;

/**
 * 这个接口用来写抽象SQL方法：
 * @author ZhangXiaowei
 *
 */
@Mapper
public interface GoodDao {
	List<Goods> findList();
}
