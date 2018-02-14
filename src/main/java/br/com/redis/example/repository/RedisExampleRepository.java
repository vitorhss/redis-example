package br.com.redis.example.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.redis.example.vo.Person;

public interface RedisExampleRepository extends CrudRepository<Person, String> {
	
	Person findById(Integer Id);

}
