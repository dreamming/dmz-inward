package dmz.service.implement;

import com.dmz.basic.exception.DBException;
import com.dmz.basic.model.Login;
import com.dmz.service.constant.basic.LoginConstant;
import com.dmz.service.iservice.ILoginService;
import com.dmz.service.utils.GenerateUUID;
import dmz.TestSuites;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by dmz on 2016/3/18.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring-basic.xml", "classpath:Spring-utils.xml", "classpath:Spring-service.xml"})
//@FixMethodOrder(MethodSorters.DEFAULT) //不可预测
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ILoginTest {

    @Resource
    private ILoginService loginService;

//    @Resource
//    private IUserService userService;

    @Test
    @Transactional   //标明此方法需使用事务,整个方法执行完才会提交
    @Rollback(false) //默认为true。
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

    @Test(expected = DBException.EmptyData.class)
    public void testGetLoginInfoById() {
        loginService.getLoginInfoById(10L);
    }

    @Test
    public void testShowAllLogin() {
//        List<Login> logins = loginService.showAllLogin();
//        System.out.println(logins);
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
