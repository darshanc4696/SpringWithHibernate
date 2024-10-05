package com.springmvc.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.daoimpl.CustomerDaoImpl;
import com.springmvc.entities.Customer;

@Controller
public class HomeController 
{
	
	@RequestMapping("/enter")
	public String enter()
	{
		return "enterData";
	}
	
	@RequestMapping("/displayData")
	public String displayPage(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("address") String address, Model model)
	{
		model.addAttribute("name", name);
		ClassPathXmlApplicationContext cx = new ClassPathXmlApplicationContext("beans.xml");
		Customer c = (Customer)cx.getBean("customer");
		CustomerDaoImpl cdaoi = (CustomerDaoImpl)cx.getBean("customerDaoImpl");
		
		c.setId(id);
		c.setName(name);
		c.setEmail(email);
		c.setAddress(address);
		
		cdaoi.insertCustomer(c);
		cx.close();
		
		return "display";
	}
	

}
