package com.wangkaiteng.test;

import java.util.Set;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.BoundZSetOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wangkaiteng.beans.Goods;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-context.xml")
@SuppressWarnings("all")
public class Demo {

	@Resource
	private RedisTemplate redisTemplate;
	
	@Test
	public void test() {
		BoundZSetOperations bvo = redisTemplate.boundZSetOps("us");
		bvo.add(new Goods(1,"¶Å¾°ÐÂ","ÄÐ",52,52.36), 52.36);
		Set<Goods> g = (Set<Goods>)bvo.range(1,1);
		
		for (Goods goods : g) {
			System.out.println(goods);
		}
	}
}
