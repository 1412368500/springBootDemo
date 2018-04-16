package com.lantw.demo.util;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TestListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("TestListener>>>>>>>>>>>>监听销毁>>>>>>>>>>>>");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("TestListener>>>>>>>>>>>>监听初始化>>>>>>>>>>>>");
	}


}
