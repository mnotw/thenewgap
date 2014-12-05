/******************************************************************************
 * Author Jonathan Zhang -- thenewgap.com
 * Under the Mit License。
 *****************************************************************************/
package com.thenewgap.dao;

import java.util.List;

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
public interface MenuDao {
	public  List<Menu> findAll();
}
