package com.gonzalez.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.gonzalez.entities.Item;
import com.gonzalez.repository.ItemRepository;

@Controller
public class InventoryController {
	
	@Autowired
	private ItemRepository itemRepository;
	
	
	@GetMapping("/")
	public String itemMaster(Model model, @RequestParam(defaultValue= "0") int page)
	{
		
	model.addAttribute("data", itemRepository.findAll( PageRequest.of(page, 20))   );
	model.addAttribute("currentPage", page);
		return "index";
	}
	
	
	@PostMapping("/save")
	public String itemSave(@RequestParam("part") String part, @RequestParam("description") String description,
			@RequestParam("Location") String location, @RequestParam("date1") String DOM, 
			@RequestParam("date2") String DOE )
	{
		
		Item item = new Item(part, location, description, DOM, DOE);


	
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
