package br.com.redis.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@Configuration
@EnableRedisRepositories
public class RedisConfiguration {
	
	@Bean
	public JedisConnectionFactory redisConnectionFactory(){
		JedisConnectionFactory redisConnectionFactory = new JedisConnectionFactory();
		
		redisConnectionFactory.setHostName("127.0.0.1");
		redisConnectionFactory.setPort(6379);
		return redisConnectionFactory;
	}
	
	@Bean
	public RedisTemplate<String, Object> redisTemplate(){
		RedisTemplate<String , Object> template = new RedisTemplate<>();
		
		template.setConnectionFactory(redisConnectionFactory());
		
		return template;
	}
	

}
