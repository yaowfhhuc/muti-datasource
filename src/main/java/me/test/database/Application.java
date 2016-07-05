package me.test.database;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class Application {
	
	@Bean(name="esDataSource")
	@Primary
	@Qualifier("esDataSource")
	@ConfigurationProperties(prefix="spring.datasource.easysight")
	public DataSource primaryDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="zgDataSource")
	@Qualifier("zgDataSource")
	@ConfigurationProperties(prefix="spring.datasource.ziguan")
	public DataSource secondDataSource(){
		return DataSourceBuilder.create().build();
	}
	
	@Bean(name="esJdbcTemplate")
	JdbcTemplate esJdbcTemplate(@Qualifier("esDataSource")DataSource dataSource ) {
		JdbcTemplate esJdbcTemplate = new JdbcTemplate(dataSource);
		return esJdbcTemplate;
	}
	
	@Bean(name="zgJdbcTemplate")
	JdbcTemplate zgJdbcTemplate(@Qualifier("zgDataSource")DataSource dataSource ) {
		JdbcTemplate zgJdbcTemplate = new JdbcTemplate(dataSource);
		return zgJdbcTemplate;
	}

	
	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Application.class, args);
		for(String name :context.getBeanDefinitionNames()){
			System.out.println(name);
		}
	}
}
