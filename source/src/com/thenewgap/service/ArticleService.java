/******************************************************************************
 * Author Jonathan Zhang -- thenewgap.com
 * Under the Mit License。
 *****************************************************************************/
package com.thenewgap.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.thenewgap.dao.ArticleDao;
import com.thenewgap.model.Article;

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

	@Transactional
	public Article findById(int id) {
		return dao.findById(id);
	}
}
