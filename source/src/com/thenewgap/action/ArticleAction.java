/******************************************************************************
 * Copyright (C) Jonathan Zhang -- thenewgap.com
 * All Rights Reserved.
 * 本软件为thenewgap.com开发研制。未经正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.thenewgap.action;

import java.util.List;

import javax.annotation.Resource;

import com.opensymphony.xwork2.ActionSupport;
import com.thenewgap.model.Article;
import com.thenewgap.service.ArticleService;

/**
 * 
 * @author 张文锋
 * 
 *         <p>
 *         Modification History:
 *         </p>
 *         <p>
 *         Date Author Description
 *         </p>
 *         <p>
 *         ------------------------------------------------------------------
 *         </p>
 *         <p>
 *         2014-11-29 张文锋 新建
 *         </p>
 *         <p>
 *         ....
 *         </p>
 */
public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7574227471454774126L;
	private Article article;
	private List<Article> list;
	private int id;

	@Resource(name = "articleService")
	ArticleService service;

	public String inseart() {
		service.insertArticle(article);
		return "success";
	}

	public String delete() {
		service.deleteById(article.getId());
		return "success";
	}

	public String findById() {
		this.article = service.findById(this.id);
		return "success";
	}

	/*
	 * public String findByName(){
	 * setList(service.findByName(article.getName())); return "success"; }
	 */

	public String update() {
		service.updateArticle(article);
		return "success";
	}

	public String findAll() {
		setList(service.findAll());
		return "success";
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public List<Article> getList() {
		return list;
	}

	public void setList(List<Article> list) {
		this.list = list;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
