/**   
* @Title: SessionInterceptor.java 
* @Package me.test.database.intercepter 
* @Description: TODO(用一句话描述该文件做什么) 
* @author yaowf
* @date 2016年7月5日 下午5:22:03 
* @version V1.0   
*/
package me.test.database.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import me.test.database.util.Constant;
import me.test.database.util.ObjectUtil;
import me.test.database.util.SessionUtil;

/** 
* @ClassName: SessionInterceptor 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yaowf
* @date 2016年7月5日 下午5:22:03 
*  
*/
public class SessionInterceptor implements HandlerInterceptor{

	/* (non-Javadoc) 
	* <p>Title: preHandle</p> 
	* <p>Description: </p> 
	* @param request
	* @param response
	* @param handler
	* @return
	* @throws Exception 
	* @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object) 
	*/
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		
		if(ObjectUtil.isEmpty(request.getSession().getAttribute(SessionUtil.USER))){
			if ("XMLHttpRequest".equalsIgnoreCase(request.getHeader("X-Requested-With"))
					|| request.getParameter("ajax") != null) {//异步请求
				response.setHeader(Constant.HTTP_HEADER_SESSIONOUT, "true");
			} else {//同步请求
				response.sendRedirect("/");
			}
			return false;
		}else{
			return true;
		}
	}

	/* (non-Javadoc) 
	* <p>Title: postHandle</p> 
	* <p>Description: </p> 
	* @param request
	* @param response
	* @param modelAndView
	* @throws Exception 
	* @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView) 
	*/
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc) 
	* <p>Title: afterCompletion</p> 
	* <p>Description: </p> 
	* @param request
	* @param response
	* @param handler
	* @param ex
	* @throws Exception 
	* @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception) 
	*/
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}
