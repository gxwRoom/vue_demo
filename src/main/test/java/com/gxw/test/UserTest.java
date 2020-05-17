package com.gxw.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.gxw.enity.User;
import com.gxw.service.UserService;

import java.util.List;

/**
 * 用户的业务层测试
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private UserService userService;


    @Test
    public void testFindAll(){
        List<User> userList = userService.findAll();
        System.out.println("查询用户列表：" + userList);
    }

    @Test
    public void testFindById(){
        User userList = userService.findById(2);
        System.out.println("根据uid查询：" + userList);
    }

    @Test
    public void testUpdate(){
        User userList = userService.findById(1);
        System.out.println("修改之前的用户"+userList);

        userList.setUsername("张三丰");
        userService.updateUser(userList);

        userList = userService.findById(1);
        System.out.println("修改之后的用户"+userList);
    }
}
