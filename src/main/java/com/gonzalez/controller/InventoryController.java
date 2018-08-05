package com.gonzalez.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gonzalez.entities.Item;
import com.gonzalez.repository.ItemRepository;

@Controller
public class InventoryController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	@GetMapping("/")
	public String itemMaster(Model model, @RequestParam(defaultValue= "0") int page)
	{
		
		//model.addAttribute("data", itemRepository.find   );
		return "index";
	}
	
	
	@PostMapping("/save")
	public String itemSave(Item item)
	{
		itemRepository.save(item);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/delete")
	public String itemDelete(Item item)
	{
		itemRepository.delete(item);
		
		return "redirect:/";
	}
	
	


}
