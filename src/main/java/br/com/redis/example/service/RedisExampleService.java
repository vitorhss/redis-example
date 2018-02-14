package br.com.redis.example.service;

import br.com.redis.example.vo.Message;
import br.com.redis.example.vo.Person;

public interface RedisExampleService {
	
	Message setPerson(Person person);
	Person getById(Integer id);
	Iterable<Person> findAll();

}
