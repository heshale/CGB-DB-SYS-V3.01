package com.cy.pj.dao;
/**
 * 这个类用来测试Mybatis框架整合
 * @author ZhangXiaowei
 *
 */

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.dao.GoodDao;
import com.cy.pj.pojo.Goods;

@SpringBootTest
public class MybatisTests {
	@Autowired
	GoodDao gooddao;
	@Test
	void mybatisTests() {
		List<Goods> list = gooddao.findList();
		System.out.println(list);
	}
}
