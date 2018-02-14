package br.com.redis.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.redis.example.service.RedisExampleService;
import br.com.redis.example.vo.Message;
import br.com.redis.example.vo.Person;

@RestController
@RequestMapping("/persons")
public class RedisExampleRest {
	
	@Autowired
	RedisExampleService service;
	
	@RequestMapping(method = RequestMethod.POST )
	public ResponseEntity<Message> setPerson(@RequestBody Person person){
		return new ResponseEntity<Message>(service.setPerson(person), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET )
	public ResponseEntity<Iterable<Person>> findAll(){
		return new ResponseEntity<Iterable<Person>>(service.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Person> getById(@PathVariable("id")Integer id){
		return new ResponseEntity<Person>(service.getById(id), HttpStatus.OK);
		
	}

}
