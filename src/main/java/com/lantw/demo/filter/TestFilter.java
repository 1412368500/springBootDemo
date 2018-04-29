//package com.lantw.demo.filter;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//@WebFilter
//public class TestFilter implements Filter {
//
//	private final Logger logger = LoggerFactory.getLogger(TestFilter.class);
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//		logger.info("TestFilter>>>>>>>>>>>>初始化过滤器>>>>>>>>>>>>");
//	}
//
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
//	        throws IOException, ServletException {
//
//	    long start = System.currentTimeMillis();
//	    HttpServletRequest httpRequest = (HttpServletRequest) request;
//	    logger.info("TestFilter>>>>>>>>>>>>" + httpRequest.getRequestURL() + ">>>>>>>>>>>>进来了>>>>>>>>>>>>");
//	    filterChain.doFilter(request, response);
//	    logger.info("TestFilter>>>>>>>>>>>>" + httpRequest.getRequestURL() + ">>>>>>>>>>>>耗时：" + (System.currentTimeMillis() - start));
//
//	}
//
//	@Override
//	public void destroy() {
//		logger.info("TestFilter>>>>>>>>>>>>销毁过滤器>>>>>>>>>>>>");
//	}
//}
