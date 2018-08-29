package com.example.newsapplication.news;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewsItem {

	@Id
	private int newsId;
	
	private String headline;
	private String hyperlink;
	private String newsPaper;
	private String category;
	private String sourceUrl;
	private String dateCreated;
	
	public NewsItem() {
		
	}
	
	/**
	 * @param newsId
	 * @param headline
	 * @param hyperlink
	 * @param newsPaper
	 * @param category
	 * @param sourceUrl
	 * @param dateCreated
	 */
	public NewsItem(int newsId, String headline, String hyperlink, String newsPaper, String category, String sourceUrl,
			String dateCreated) {
		super();
		this.newsId = newsId;
		this.headline = headline;
		this.hyperlink = hyperlink;
		this.newsPaper = newsPaper;
		this.category = category;
		this.sourceUrl = sourceUrl;
		this.dateCreated = dateCreated;
	}

	/**
	 * @return the newsId
	 */
	@Column(name= "NewsId1")
	public int getNewsId() {
		return newsId;
	}

	/**
	 * @param newsId the newsId to set
	 */
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}

	/**
	 * @return the headline
	 */
	public String getHeadline() {
		return headline;
	}

	/**
	 * @param headline the headline to set
	 */
	public void setHeadline(String headline) {
		this.headline = headline;
	}

	/**
	 * @return the hyperlink
	 */
	public String getHyperlink() {
		return hyperlink;
	}

	/**
	 * @param hyperlink the hyperlink to set
	 */
	public void setHyperlink(String hyperlink) {
		this.hyperlink = hyperlink;
	}

	/**
	 * @return the newsPaper
	 */
	public String getNewsPaper() {
		return newsPaper;
	}

	/**
	 * @param newsPaper the newsPaper to set
	 */
	public void setNewsPaper(String newsPaper) {
		this.newsPaper = newsPaper;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the sourceUrl
	 */
	public String getSourceUrl() {
		return sourceUrl;
	}

	/**
	 * @param sourceUrl the sourceUrl to set
	 */
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	/**
	 * @return the dateCreated
	 */
	public String getDateCreated() {
		return dateCreated;
	}

	/**
	 * @param dateCreated the dateCreated to set
	 */
	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}
	
}
