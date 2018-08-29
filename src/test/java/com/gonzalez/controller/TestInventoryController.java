package com.gonzalez.controller;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.List;

import javax.persistence.EntityManager;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders.*;
import org.springframework.ui.ExtendedModelMap;
import org.springframework.ui.Model;

import com.gonzalez.entities.Item;
import com.gonzalez.repository.ItemRepository;

import org.springframework.test.web.servlet.RequestBuilder.*;

public class TestInventoryController {
	@Mock
	private EntityManager entity;
	
	private ItemRepository itemRepository;
	Item item = new Item( "RA-15465496878", "TOP SHELF 01", "rubber", "11/11/2016", "11/11/2035");
	
	@Before
	public void initialSetUp()
	{
		itemRepository = mock(ItemRepository.class);
		
	}
	
	@Test
	public void testInventoryController()  throws Exception
	{
		InventoryController controller = new InventoryController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
		
		    final Model model = new ExtendedModelMap();
		   assertThat(controller.itemMaster(model, 1), is("index"));
		    
		    
		    
		mockMvc.perform(get("/")).andExpect(view().name("index"));
		
	}

}
