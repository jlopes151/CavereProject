package org.project.simple;

import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.project.simple.domain.Customer_List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;

@Configuration
@ComponentScan({"org.project.simple"})
public class SngPageConfig {

	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3307/sakila?profileSQL=true");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUsername("jlopes");
		dataSource.setPassword("green1");		
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(DataSource dataSource){
		LocalSessionFactoryBean sfb = new LocalSessionFactoryBean();
		sfb.setDataSource(dataSource);
		sfb.setPackagesToScan(new String[] {"org.project.simple"});
		Properties props = new Properties();
		props.setProperty("dialect", "org.hibernate.dialect.MySQLDialect");
		sfb.setHibernateProperties(props);
		sfb.setAnnotatedClasses(new Class<?>[] {Customer_List.class});
		return sfb;
	}
}
