/******************************************************************************
 * Copyright (C) Jonathan Zhang -- thenewgap.com
 * All Rights Reserved.
 * 本软件为thenewgap.com开发研制。未经正式书面同意，其他任何个人、团体
 * 不得使用、复制、修改或发布本软件.
 *****************************************************************************/
package com.thenewgap.dao;

import java.util.List;

import com.thenewgap.model.Article;

/**  
 * 
 * @author      Jonathan Zhang
 *  
 * <p> Modification History:</p> 
 * <p> Date         Author     Description </p>  
 * <p>------------------------------------------------------------------</p>  
 * <p>2014-11-29    Jonathan Zhang      新建</p>
 * <p>....</p>  
 */
public interface ArticleDao {
	public  void insertArticle(Article user);

	public  void deleteById(int id);

	public  List<Article> findAll();

	public  void Update(Article user);
	
	/*public List<Article> findByName(String name);*/
	
	public Article findById(int id);
	
	public List<Article> findByCategory(String category);
}
