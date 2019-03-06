package com.lantw.demo.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//@Component
public class TestInterceptor implements HandlerInterceptor {

	private final Logger logger = LoggerFactory.getLogger(TestInterceptor.class);

	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		logger.info("TestInterceptor>>>>>>>>>>>>preHandle>>>>>>>>>>>>" + ((HandlerMethod)handler).getBean().getClass().getName() + ">>>>>>>>>>>>" + ((HandlerMethod)handler).getMethod().getName());
        request.setAttribute("startTime", System.currentTimeMillis());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

        Long start = (Long) request.getAttribute("startTime");
        logger.info("TestInterceptor>>>>>>>>>>>>postHandle>>>>>>>>>>>>请求耗时:"+(System.currentTimeMillis() - start));
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception)
            throws Exception {

        Long start = (Long) request.getAttribute("startTime");
        logger.info("TestInterceptor>>>>>>>>>>>>afterCompletion>>>>>>>>>>>>耗时:"+(System.currentTimeMillis() - start) + ">>>>>>>>>>>>" + exception);
    }
}
