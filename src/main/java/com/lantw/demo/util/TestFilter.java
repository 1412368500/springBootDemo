package com.lantw.demo.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter
public class TestFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	    System.out.println("TestFilter>>>>>>>>>>>>初始化过滤器>>>>>>>>>>>>");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
	        throws IOException, ServletException {
	
	    long start = System.currentTimeMillis();
	    HttpServletRequest httpRequest = (HttpServletRequest) request;
	    System.out.println("TestFilter>>>>>>>>>>>>" + httpRequest.getRequestURL() + ">>>>>>>>>>>>进来了>>>>>>>>>>>>");
	    filterChain.doFilter(request, response);
	    System.out.println("TestFilter>>>>>>>>>>>>" + httpRequest.getRequestURL() + ">>>>>>>>>>>>耗时：" + (System.currentTimeMillis() - start));
	
	}
	
	@Override
	public void destroy() {
	    System.out.println("TestFilter>>>>>>>>>>>>销毁过滤器>>>>>>>>>>>>");
	}
}
