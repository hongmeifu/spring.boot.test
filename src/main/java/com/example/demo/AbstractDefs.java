package com.example.demo;

import com.example.demo.conForTest.TestSpringMongoApplication;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author fuhm
 * @Date: 2019/6/15 15:40
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = TestSpringMongoApplication.class)
//@MapperScan("com.example.demo.*.*")

@SpringBootTest
public class AbstractDefs {
}
