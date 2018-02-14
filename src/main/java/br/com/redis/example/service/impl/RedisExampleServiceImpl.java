package br.com.redis.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.redis.example.repository.RedisExampleRepository;
import br.com.redis.example.service.RedisExampleService;
import br.com.redis.example.vo.Message;
import br.com.redis.example.vo.Person;

@Service
public class RedisExampleServiceImpl implements RedisExampleService {
	
	@Autowired
	private RedisExampleRepository repository;

	@Override
	public Message setPerson(Person person) {
		repository.save(person);
		
		return new Message("Pessoa incluida com sucesso");
	}

	@Override
	public Person getById(Integer id) {
		return repository.findById(id);
	}

	@Override
	public Iterable<Person> findAll() {
		return repository.findAll();
	}

	

}
