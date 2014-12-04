/******************************************************************************
 * Author Jonathan Zhang -- thenewgap.com
 * Under the MIT License
 *****************************************************************************/
package com.thenewgap.action;

import java.util.Date;
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

	public String insert() {
		this.article.setPostDate(new Date());
		this.article.setCategory("1");
		this.article.setIsShow('1');
		this.article.setShareTimes(0);
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
