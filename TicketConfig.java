package com.jsp.jdbc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages = "com.jsp.jdbc")

public class TicketConfig {
	@Bean("datasource")
public DataSource getdaDataSource()
{
	DriverManagerDataSource ds=new DriverManagerDataSource();
	ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
	ds.setUrl("jdbc:mysql://localhost:3306/springteca58");
	ds.setUsername("root");
	ds.setPassword("12345");
	return ds;
}
	
	@Bean("template")
	public JdbcTemplate getJdbcTemplate(DataSource ds)
	{
		JdbcTemplate template=new JdbcTemplate();
		template.setDataSource(ds);
		return template;
	}
	
	
}
