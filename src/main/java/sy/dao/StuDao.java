/**
 * 
 * 多多啦啦梦
 * Copyright (c) 2014-2016 ZhongHuaQiang,Inc.All Rights Reserved.
 */
package sy.dao;

import sy.model.Stu;

/**
 * 
 * @author Zhong
 * @version $Id: StuDao.java, v 0.1 2016-5-24 下午10:43:53 Zhong Exp $
 */
public interface StuDao {
    Stu selectByAge(int age);
}
