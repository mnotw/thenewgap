/******************************************************************************
 * Copyright (C) Jonathan Zhang -- thenewgap.com
 * All Rights Reserved.
 * 本软件为thenewgap.com开发研制。未经正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.thenewgap.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thenewgap.dao.ArticleDao;
import com.thenewgap.model.Article;

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
@Component("articleService")
public class ArticleService {
	@Resource(name = "articleDao")
	private ArticleDao dao;

	@Transactional
	public boolean insertArticle(Article article) {
		dao.insertArticle(article);
		return true;
	}

	@Transactional
	public boolean deleteById(int id) {
		dao.deleteById(id);
		return true;
	}

	@Transactional
	public boolean updateArticle(Article article) {
		dao.Update(article);
		return true;
	}

	@Transactional
	public List<Article> findAll() {
		return dao.findAll();
	}

	/*@Transactional
	public List<Article> findByName(String name) {
		return dao.findByName(name);
	}*/

	@Transactional
	public Article findById(int id) {
		return dao.findById(id);
	}
}
