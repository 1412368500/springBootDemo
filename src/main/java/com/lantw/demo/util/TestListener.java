package com.lantw.demo.util;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebListener
public class TestListener implements ServletRequestListener {

	private final Logger logger = LoggerFactory.getLogger(TestListener.class);
	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		logger.info("TestListener>>>>>>>>>>>>监听销毁>>>>>>>>>>>>");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		logger.info("TestListener>>>>>>>>>>>>监听初始化>>>>>>>>>>>>");
	}


}
