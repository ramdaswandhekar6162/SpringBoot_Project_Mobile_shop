package com.practice.phones.mobiles.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.practice.phones.mobiles.entity.MobileData;
import com.practice.phones.mobiles.services.MobileServices;

@Controller
public class MobileTable {
	
	@Autowired
	private MobileServices ref;
	
	MobileTable(MobileServices ref){
		super();
		this.ref=ref;
	}
	
	@GetMapping("/getall")
	public String getall(Model mod) {
		
		mod.addAttribute("mbtable", ref.getAllData());
		
		
		return "mbtable";
	}
	
	@GetMapping("/getone{id}")
	public String getone(Model mod, @PathVariable(value = "id") Long id) {
		mod.addAttribute("oneMb", ref.getOneData(id));
		
		return "getone";
	}
	
	@GetMapping("/getInsert")
	public String getInsert(Model mod) {
		MobileData obj = new MobileData();
		mod.addAttribute("obj", obj);
		
		return "InsertData";
	}
	
	@PostMapping("/getsave")
	public String getinsert(@ModelAttribute("obj") MobileData mob) {
		
		this.ref.getSave(mob);
		return "redirect:/getall";
	}
	
	@GetMapping("/showFormUpdate/{id}")
	public String getUpdate(@PathVariable(value= "id") Long id, Model mod) {
		
		mod.addAttribute("objcome", ref.getByIdMobi(id));
		
		return "UpdateData";
	}
	@PostMapping("/updateForm")
	public String getUpdatedData(@ModelAttribute("objreturn") MobileData mob) {
		
		ref.getSave(mob);
		
		return "redirect:/getall";
	}
	@GetMapping("/deletdata/{id}")
	public String getDelete(@PathVariable(value="id") Long id, Model mod) {
		ref.getDeletById(id);
		
		return "redirect:/getall";
	}
	
	
}
