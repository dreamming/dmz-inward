package dmz.service.implement;

import com.alibaba.fastjson.JSON;
import com.dmz.basic.exception.DBException;
import com.dmz.basic.model.Login;
import com.dmz.service.constant.basic.LoginConstant;
import com.dmz.service.iservice.ILoginService;
import com.dmz.service.utils.GenerateUUID;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by dmz on 2016/3/18.
 */
/*
RunWith注解指定Junit的默认执行类(若不指定RunWith注解 默认Suite)
可以执行自定义的执行类，需要继承BlockJUnit4ClassRunner
Junit集成Spring测试使用 SpringJUnit4ClassRunner 执行类
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring-basic.xml", "classpath:Spring-utils.xml", "classpath:Spring-service.xml"})
//@FixMethodOrder(MethodSorters.DEFAULT) //不可预测
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
/*
* 执行监听,用于执行测试类之前做一些预处理,DependencyInjectionTestExecutionListener TransactionalTestExecutionListener 不指定的话也是默认
*
*/
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class, TransactionalTestExecutionListener.class})
/*此处加上Transactional注解后,测试类针对全部方法，数据库不会落数据．单个方法的此注解优先级高*/
@Transactional //( 或者 ILoginTest 继承 AbstractTransactionalJUnit4SpringContextTests)
public class ILoginTest {

    @Resource
    private ILoginService loginService;

//    @Resource
//    private IUserService userService;

    @Test
    @Transactional
//    @Rollback(false) //若无Rollback注解则数据不会落数据库
    @Rollback(false) //Rollback注解的默认值为true
    public void testAddLoginInfo() throws Exception {
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
    public void testGetLoginInfoById() {
        Login loginInfo = loginService.getLoginInfoById(1L);
        System.out.println(JSON.toJSONString(loginInfo));
    }

    @Test
    public void testGetUserInfoByLogin() {
//        Login login = new Login();
//        login.setLoginName("dmz");
//        login = loginService.getLoginInfoByLogin(login);
//        User user = new User();
//        user.setUserNo(login.getUserNo());
//        user = userService.getUserInfoByUser(user);
//        System.out.println(JSON.toJSONString(user));

    }

    @Test(expected = DBException.MultipleData.class) // 期待的异常类型
    public void testShowUserDetailByLoginName() {
        Login login = new Login();
        login.setLoginName("dmz");
        loginService.showUserDetailByLoginName(login);
    }
}
