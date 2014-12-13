package com.thenewgap.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.thenewgap.dao.ArticleDao;
import com.thenewgap.model.Article;
@Component("articleDao")
public class ArticleDaoImpl implements ArticleDao {
	@Resource(name="hibernateTemplate")
	private HibernateTemplate template;
	
	
	public void insertArticle(Article Article){
		 long x=(Long) template.save(Article);
		 System.out.println(x);
	}
 
	public void deleteById(int id){
		Article Article=template.get(Article.class, id);
		template.delete(Article);
	}
	
	public List<Article> findAll(){
		@SuppressWarnings("unchecked")
		List<Article> list=template.find ( "from Article" );
		return list;
	}
	
	public void Update(Article Article){
		template.update(Article);
	}

	public Article findById(int id) {
		return template.get(Article.class, id);
	}

	/**
	 *get target articles by category
	 */
	public List<Article> findByCategory(String category) {
		@SuppressWarnings("unchecked")
		List<Article> list=template.find("from Article a where a.category=?", category);  
		return list;
	}

}
