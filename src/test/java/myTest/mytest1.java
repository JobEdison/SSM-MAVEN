/**
 * 
 * 多多啦啦梦
 * Copyright (c) 2014-2016 ZhongHuaQiang,Inc.All Rights Reserved.
 */
package myTest;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import sy.model.Stu;
import sy.service.StuService;

/**
 * 
 * @author Zhong
 * @version $Id: mytest1.java, v 0.1 2016-5-24 下午10:51:20 Zhong Exp $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class mytest1 {
    private static final Logger logger = Logger.getLogger(mytest1.class);

 private StuService stuService;
 public StuService getStuService() {
     return stuService;
 }

 @Autowired
 public void setStuService(StuService stuService) {
     this.stuService = stuService;
 }
    @Test
 public void test()  {
    Stu stu=stuService.selectByAge(6);
    logger.info(stu);
    System.out.println(stu.getName());
}
}
