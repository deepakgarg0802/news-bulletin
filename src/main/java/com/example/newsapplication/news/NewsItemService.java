package com.example.newsapplication.news;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NewsItemService {

	@Autowired
	private NewsItemRepository newsItemRepository;
			
	public List<NewsItem> getAllNewsItems() {
		ArrayList<NewsItem> arrayList= new ArrayList<>();
		
		newsItemRepository.findAll().forEach(arrayList::add);
		return arrayList;
	}
	
	public Optional<NewsItem> getNewsItem(int id) {
		//return mylist.stream().filter(t->t.getEmpId()==id).findFirst().get();
		return newsItemRepository.findById(id);
	}
	
	public int addNewsItem(NewsItem newsItem) {
		long count=newsItemRepository.count();
		
		newsItemRepository.save(newsItem);
		if(newsItemRepository.count()== count+1) {
			return 1;
		}
		else {
			return 0;
		}
	}
}
