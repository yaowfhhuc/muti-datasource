/**   
* @Title: IndexController.java 
* @Package me.test.database.rest.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author yaowf
* @date 2016年7月5日 下午3:13:07 
* @version V1.0   
*/
package me.test.database.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
* @ClassName: IndexController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yaowf
* @date 2016年7月5日 下午3:13:07 
*  
*/
@RestController
public class RestfulController {

	@Autowired
	@Qualifier("esJdbcTemplate")
	private JdbcTemplate esJdbcTemplate;
	
	@RequestMapping("/")
	public int getcount(){
		return esJdbcTemplate.queryForObject("select count(0) from NET_ELEMENT_DEVICE", Integer.class);
	}
}
