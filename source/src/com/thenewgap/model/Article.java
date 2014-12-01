/******************************************************************************
 * Copyright (C) Jonathan Zhang -- thenewgap.com
 * All Rights Reserved.
 * 本软件为thenewgap.com开发研制。未经正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.thenewgap.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**  
 * 
 * @author      张文锋
 *  
 * <p> Modification History:</p> 
 * <p> Date         Author     Description </p>  
 * <p>------------------------------------------------------------------</p>  
 * <p>2014-11-28    张文锋      新建</p>
 * <p>....</p>  
 */
@Component("article")
@Entity
@Table(name="article")
public class Article {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="title")
	private String title;
	@Column(name="post_date")
	private Date postDate;
	@Column(name="author")
	private String author;
	@Column(name="image")
	private String image;
	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}
	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}
	@Column(name="category")
	private String category;
	@Column(name="content")
	private String content;
	@Column(name="view_times")
	private int viewTimes;
	@Column(name="share_times")
	private int shareTimes;
	@Column(name="is_show")
	private char isShow;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getViewTimes() {
		return viewTimes;
	}
	public void setViewTimes(int viewTimes) {
		this.viewTimes = viewTimes;
	}
	public int getShareTimes() {
		return shareTimes;
	}
	public void setShareTimes(int shareTimes) {
		this.shareTimes = shareTimes;
	}
	public char getIsShow() {
		return isShow;
	}
	public void setIsShow(char isShow) {
		this.isShow = isShow;
	}
	
}
