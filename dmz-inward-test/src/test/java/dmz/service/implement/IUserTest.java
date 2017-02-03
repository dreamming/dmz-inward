package dmz.service.implement;

import com.dmz.basic.model.User;
import com.dmz.service.iservice.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @author dmz
 * @date 2017/1/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:Spring-basic.xml","classpath:Spring-service.xml","classpath:Spring-utils.xml"})
public class IUserTest {

    @Resource
    private IUserService userService;

    @Test
    public void addUserInfoTest() {
        User user = new User();
        user.setUserNo("123321123123321");
        user.setUpdateTime(new Date());
        user.setCreateTime(new Date());
        userService.addUserInfo(user);
    }

}
