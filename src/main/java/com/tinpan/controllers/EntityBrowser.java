package com.tinpan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tinpan.model.Artist;

@Controller
public class EntityBrowser {

	@RequestMapping(path = "/artists/{artistId}", method = RequestMethod.GET)
	public @ResponseBody Artist getArtist(@PathVariable String artistId){
		
		return null;
		
	}
}
