/**   
* @Title: IndexController.java 
* @Package me.test.database.controller 
* @Description: TODO(用一句话描述该文件做什么) 
* @author yaowf
* @date 2016年7月5日 下午3:22:18 
* @version V1.0   
*/
package me.test.database.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import me.test.database.mapper.NetElementDeviceMapper;

/** 
* @ClassName: IndexController 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author yaowf
* @date 2016年7月5日 下午3:22:18 
*  
*/
@Controller
public class IndexController {

	@Autowired
	@Qualifier("esJdbcTemplate")
	private JdbcTemplate esJdbcTemplate;
	
	@Autowired
	private NetElementDeviceMapper netElementDeviceMapper;
	
	@RequestMapping("/web")
	public String getcount(Map<String, Object> model){
		int rs = esJdbcTemplate.queryForObject("select count(0) from NET_ELEMENT_DEVICE", Integer.class);
		model.put("num", rs);
		return "/index";
	}
	
	@RequestMapping("/web/mybatis")
	public String getCount(Map<String, Object> model){
		
		int rs = netElementDeviceMapper.selectCount();
		model.put("num", rs);
		return "/index";
	}
}
