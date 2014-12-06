/******************************************************************************
 * Author Jonathan Zhang -- thenewgap.com
 * Under the Mit License。
 *****************************************************************************/
package com.thenewgap.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.thenewgap.dao.MenuDao;
import com.thenewgap.model.Menu;

/**
 * @author Jonathan Zhang Modification History: Date Author Description
 *         ------------------------------------------------------------------
 *         2014-12-5 Jonathan Zhang Created
 */
@Component("menuService")
public class MenuService {
	@Resource(name = "menuDao")
	private MenuDao dao;

	public List<Menu> findAll() {
		return dao.findAll();
	}

	/**
	 * @Title: getMenuHtml
	 * @Description: generate menu html (two levels)
	 * @Date 2014-12-5
	 * @Author Jonathan Zhang
	 * @return String
	 */
	public String getMenuHtml() {
		List<Menu> list = this.findAll();
		StringBuffer sb = new StringBuffer();
		StringBuffer sub = new StringBuffer();
		Menu menu = null;
		Menu subMenu = null;
		sb.append("<ul class='nav_ul'>");
		for (int i = 0; i < list.size(); i++) {
			menu = list.get(i);
			if ("0".equals(menu.getParentCode())) {
				sb.append("<li>");
				sb.append(menu.getName());
				sub = new StringBuffer();
				for (int j = 0; j < list.size(); j++) {
					subMenu = list.get(j);
					if (subMenu.getParentCode().equals(menu.getCode())) {
						// generate sub-menu content
						sub.append("<li><a target='_self' href='"
								+ subMenu.getUrl() + "'>");
						sub.append(subMenu.getName() + "</a></li>");
					}
				}
				if (sub.length() > 0) {
					// add sub-menu wrapper
					sb.append("<ul class='nav_ul_sub'>");
					sb.append(sub.toString());
					sb.append("</ul>");
				}
				sb.append("</li>");
			}
		}
		sb.append("</ul>");
		return sb.toString();
	}
}
