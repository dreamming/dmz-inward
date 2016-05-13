package com.dmz.service.serviceimpl;

import com.dmz.basic.model.Login;
import com.dmz.basic.model.User;
import com.dmz.service.constant.basic.LoginConstant;
import com.dmz.service.iservice.ILoginService;
import com.dmz.service.iservice.IUserService;
import com.dmz.service.utils.GenerateUUID;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by dmz on 2016/3/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring-basic.xml","classpath:Spring-utils.xml","classpath:Spring-service.xml"})
public class ILoginTest {

    @Resource
    private ILoginService loginService;

    @Resource
    private IUserService userService;

    @Test
    public void testaddLoginInfo() throws Exception {
        Login login = new Login();
        login.setHasPasswd(LoginConstant.HAS_HPASSWORD.get(LoginConstant.YES));
        login.setIsDelete(false);
        login.setLoginName("程萌");
        login.setPasswd("527386108");
        login.setUserNo(GenerateUUID.getUUID());
        login.setPlatform(LoginConstant.PLATFORM.get(LoginConstant.WEB));
        login.setPwdStrength(LoginConstant.PASS_STRENGTH.get(LoginConstant.WEAK));
        login.setStatus(LoginConstant.STATUS.get(LoginConstant.UNLOCKED));
        login.setCreateTime(new Date());
        login.setUpdateTime(new Date());
        loginService.addLoginInfo(login);
    }

    @Test
    public void testGetLoginInfoById(){
        loginService.getLoginInfoById(1L);
    }

    @Test
    public void testGetUserInfoByLogin(){
        Login login=new Login();
        login.setLoginName("dmz");
        login = loginService.getLoginInfoByLogin(login);
        User user = new User();
        user.setUserNo(login.getUserNo());
        user=userService.getUserInfoByUser(user);
        System.out.println(user.getAvatar());
    }

    @Test
    public void testShowUserDetailByLoginName(){
        Login login=new Login();
        login.setLoginName("dmz");
        User user = loginService.showUserDetailByLoginName(login);
        System.out.println(user);
    }
}
