package com.github.walterfan.account.domain;

import org.apache.ibatis.type.Alias;

/*
                    id: 1,
                    name: "sina",
                    url: "http://www.sina.com.cn",
                    tags: "portal,news",
                    category: "site"
 * */
@Alias("Link")
public class Link extends BaseObject{
	private int id;
	private String name;
	private String url;
	private String tags;
	private Category category;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
}
