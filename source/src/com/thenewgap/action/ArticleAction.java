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
import com.thenewgap.service.MenuService;

/**
 * 
 * @author Jonathan Zhang Modification History: Date Author Description
 *         ------------------------------------------------------------------
 *         2014-11-29 Jonathan Zhang Created
 */
public class ArticleAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7574227471454774126L;
	private Article article;
	private List<Article> list;
	private String menuHtml;
	private int id;

	@Resource(name = "articleService")
	ArticleService service;
	@Resource(name = "menuService")
	MenuService ms;

	/**
	 * @Title: insert
	 * @Description: 文章插入
	 * @Date 2014-12-6
	 * @Author Jonathan Zhang
	 * @return String
	 */
	public String insert() {
		this.article.setPostDate(new Date());
		this.article.setCategory("1");
		this.article.setIsShow('1');
		this.article.setShareTimes(0);
		service.insertArticle(article);
		return "success";
	}

	/**
	 * @Title: delete
	 * @Description: delete an article by id
	 * @Date 2014-12-6
	 * @Author Jonathan Zhang
	 * @return String
	 */
	public String delete() {
		service.deleteById(article.getId());
		return "success";
	}

	/**
	 * @Title: findById
	 * @Description: find an article by id
	 * @Date 2014-12-6
	 * @Author Jonathan Zhang
	 * @return String
	 */
	public String findById() {
		this.menuHtml = ms.getMenuHtml();
		this.article = service.findById(this.id);
		return "success";
	}

	public String update() {
		service.updateArticle(article);
		return "success";
	}

	/**
	 * @Title: findAll
	 * @Description: find all articles
	 * @Date 2014-12-6
	 * @Author Jonathan Zhang
	 * @return String
	 */
	public String findAll() {
		this.menuHtml = ms.getMenuHtml();
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

	public String getMenuHtml() {
		return menuHtml;
	}

	public void setMenuHtml(String menuHtml) {
		this.menuHtml = menuHtml;
	}
}
