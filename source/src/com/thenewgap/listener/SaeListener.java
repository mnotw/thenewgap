package com.thenewgap.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import ognl.OgnlRuntime;

/*
 * 在sae上使用struts，需要添加的Listener
 */
public class SaeListener implements ServletContextListener,
		HttpSessionListener, HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent arg0) {
		OgnlRuntime.setSecurityManager(null);

	}

}
