package com.asj;

import com.chuange.DemoApplication;
import com.chuange.aishijing.pojo.classessys.ClassComments;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureJdbc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Connection;
import java.sql.SQLException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {


	@Test
	public void contextLoads() {
		SpringApplication.run(ClassComments.class);

	}

}
