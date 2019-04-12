package com.arun.test.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.arun.test.beans.Entry;
import com.arun.test.dao.EntryDao;

@Controller
public class EntryController {
	@Autowired
	EntryDao dao;

	@RequestMapping("/viewentries")
	public String viewentries(Model m) {
		List<Entry> list = dao.getEntries();
		List<Entry> arlist = dao.getAREntries();
		System.out.println("viewentries=" + list.size());
		m.addAttribute("list", list);
		m.addAttribute("approvedrejectedlist", arlist);
		return "viewentries";
	}

	@RequestMapping(value = "/reject/{id}", method = RequestMethod.GET)
	public String reject(@PathVariable int id) {
		dao.reject(id);
		return "redirect:/viewentries";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String save(HttpServletRequest request) {

		Entry entry = new Entry();
		entry.setTextentry(request.getParameter("textentry"));
		entry.setImagepath(request.getParameter("imagepath"));
		System.out.println(entry.getImagepath());
		dao.save(entry);
		return "redirect:/viewentries";
	}

	@RequestMapping(value = "/approve/{id}", method = RequestMethod.GET)
	public String approve(@PathVariable int id) {
		dao.approve(id);
		return "redirect:/viewentries";
	}
}