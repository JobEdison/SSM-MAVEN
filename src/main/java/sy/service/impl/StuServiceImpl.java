/**
 * 
 * 多多啦啦梦
 * Copyright (c) 2014-2016 ZhongHuaQiang,Inc.All Rights Reserved.
 */
package sy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.StuDao;
import sy.model.Stu;
import sy.service.StuService;

/**
 * 
 * @author Zhong
 * @version $Id: StuServiceImpl.java, v 0.1 2016-5-24 下午10:47:57 Zhong Exp $
 */
@Service("stuService")
public class StuServiceImpl implements StuService{

    /** 
     * @see sy.service.StuService#selectByAge(int)
     */
   @Autowired
    private StuDao stuDao;
   
    
    
    @Override
    public Stu selectByAge(int age) {
        // TODO Auto-generated method stub
        return stuDao.selectByAge(age);
    }

}
