package com.example.newsapplication.news;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class NewsItemController {

	@Autowired
	NewsItemService itemService;
	
	@RequestMapping("/health")
	public String getHealth(){
		
		return "Working...";
	}
	
	@RequestMapping("/news")
	public List<NewsItem> getAllNews(){
		return itemService.getAllNewsItems();
	}
	
	@RequestMapping("/news/{NewsId}")
	public Optional<NewsItem> getNewsItem(@PathVariable("NewsId") int id) {
		return itemService.getNewsItem(id);
	}
}
