package com.lin.user_client;

import com.lin.user_client.pojo.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@SpringBootTest
@RunWith(SpringRunner.class)
class UserClientApplicationTests {
	@Autowired
	private RedisTemplate redisTemplate;
	@Test
	void test1(){
		User user = new User();
		user.setId(1);
		user.setAge(18);
		user.setName("卓卓");
		user.setSex("女");
		ValueOperations<String,User> valueOperations = redisTemplate.opsForValue();
		valueOperations.set("hh", user);
	}

	@Test
	void test2()  {
		User user = new User();
		ValueOperations<String,User> valueOperations = redisTemplate.opsForValue();
		System.out.println(valueOperations.get("hh"));
	}

	@Test
	void test3()  {
		User user = new User();
		ValueOperations<String,User> valueOperations = redisTemplate.opsForValue();

	}
}
