package com.recordcollection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recordcollection.domains.Record;
import com.recordcollection.services.RecordService;

/**
 * Created by Ioannis Matzakos on 22/03/2019.
 */

@Controller
public class RecordController{
	
	private RecordService recordservice;
	
	@Autowired
	public void setRecordService(RecordService recordservice) {
		this.recordservice=recordservice;
	}
	
	@RequestMapping("/record/list")
	public String listRecords(Model model) {
		model.addAttribute("records", recordservice.listAll());
		return "record/list";
	}
	
	 @RequestMapping("/record/show/{id}")
	 public String getRecord(@PathVariable Integer id, Model model){
	    model.addAttribute("record", recordservice.getById(id));
	    return "record/show";
	 }
	 
	 @RequestMapping("/record/edit/{id}")
	 public String edit(@PathVariable Integer id, Model model){
	    model.addAttribute("record", recordservice.getById(id));
	    return "record/recordform";
	 }
	 
	 @RequestMapping("/record/new")
	 public String newRecord(Model model){
	    model.addAttribute("record", new Record());
	    return "record/recordform";
	 }
	 
	 @RequestMapping(value = "/record", method = RequestMethod.POST)
	 public String saveOrUpdateProduct(Record record){
	    Record savedRecord = recordservice.saveOrUpdate(record);
	    return "redirect:/record/show/" + savedRecord.getId();
	 }

	 @RequestMapping("/record/delete/{id}")
	 public String delete(@PathVariable Integer id){
	    recordservice.delete(id);
	    return "redirect:/record/list";
	 }
}