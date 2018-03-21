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
	    System.out.println("初始化过滤器TestFilter>>>>>>>>>>>>");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
	        throws IOException, ServletException {
	
	    long start = System.currentTimeMillis();
	
	    filterChain.doFilter(request, response);
	    HttpServletRequest httpRequest = (HttpServletRequest) request;
	    System.out.println(httpRequest.getRequestURL() + "耗时：" + (System.currentTimeMillis() - start));
	
	}
	
	@Override
	public void destroy() {
	    System.out.println("=======销毁过滤器=========");
	}
}
