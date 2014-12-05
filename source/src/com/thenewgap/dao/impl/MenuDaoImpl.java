/******************************************************************************
 * Author Jonathan Zhang -- thenewgap.com
 * Under the Mit License。
 *****************************************************************************/
package com.thenewgap.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.thenewgap.dao.MenuDao;
import com.thenewgap.model.Menu;

/**  
 * 
 * @author      Jonathan Zhang
 *  
 * <p> Modification History:</p> 
 * <p> Date         Author     Description </p>  
 * <p>------------------------------------------------------------------</p>  
 * <p>2014-12-5    Jonathan Zhang      Created</p>
 * <p>....</p>  
 */
@Component("menuDao")
public class MenuDaoImpl implements MenuDao {
	@Resource(name="hibernateTemplate")
	private HibernateTemplate template;
	
	public List<Menu> findAll() {
		@SuppressWarnings("unchecked")
		List<Menu> list=template.find ( "from User" );
		return list;
	}

}
