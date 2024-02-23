package com.example.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.workshop.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Ramos", "maria@gmail.com");
		User guilherme = new User("2", "Guilherme Barbieri", "gbgui@gmail.com");
		List<User>list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,guilherme)); //add na lista
		return ResponseEntity.ok().body(list); //retornar a lista
		
	}
	

}
