package com.techelevator.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.shopping.dao.IItemDao;
import com.techelevator.shopping.exception.ItemNotFoundException;
import com.techelevator.shopping.model.Item;

@RestController
@CrossOrigin
@RequestMapping("/api/shoppinglist")
public class ItemRestController {

	
	@Autowired
	private IItemDao itemDao;
	
	@GetMapping
	public List<Item> list(){
		return itemDao.list();
	}
	
	@GetMapping("/{id}")
	public Item read(@PathVariable int id) {
		Item item = itemDao.read(id);
		if(item !=null) {
			return item;
		}
		else {
			throw new ItemNotFoundException(id,"Todo Not Found!");
		}
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Item create(@RequestBody Item item) {
		return itemDao.create(item);
	}
	
	@PutMapping("/{id}")
	public Item update(@RequestBody Item item, @PathVariable int id) {
		Item responseItem = itemDao.read(id);
		if(responseItem !=null) {
			return itemDao.update(item);
					
		}
		else {
			throw new ItemNotFoundException(id,"Todo Not Found!");
		}
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		Item responseItem = itemDao.read(id);
		if(responseItem !=null) {
			itemDao.delete(id);
		}
		else {
			throw new ItemNotFoundException(id,"Todo Not Found!");
		}
	}
}
