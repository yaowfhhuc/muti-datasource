package me.test.database;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class AppTest{

	
	@Autowired
	@Qualifier("esJdbcTemplate")
	private JdbcTemplate esJdbcTemplate;
	
	@Autowired
	@Qualifier("zgJdbcTemplate")
	private JdbcTemplate zgJdbcTemplate;
	
	@Test
	public void test(){
		
		System.out.println(esJdbcTemplate.queryForObject("select count(0) from NET_ELEMENT_DEVICE", Integer.class));
	
	}
	
}
