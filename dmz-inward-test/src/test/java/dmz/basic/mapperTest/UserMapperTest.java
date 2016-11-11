package dmz.basic.mapperTest;

import com.dmz.basic.mapper.UserMapper;
import com.dmz.basic.model.User;
import com.dmz.service.constant.basic.UserConstant;
import dmz.TestSuites;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by dmz on 2016/4/19.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:Spring-basic.xml","classpath:Spring-utils.xml"})
public class UserMapperTest extends TestSuites {

    @Autowired
    public UserMapper userMapper;

    @Test
    public void testUserMapper(){
        User user = new User();
        user.setAvatar("../../assets/Chrysanthemum.jpg");
        user.setCreateTime(new Date());
        user.setUpdateTime(new Date());
        user.setGender(UserConstant.GENDER.get(UserConstant.MAN));
        user.setHobbys("");
        user.setIsDelete(false);
        user.setIsStraight(UserConstant.IS_STRAIGHT.get(UserConstant.SECRET));
        user.setIsSingle(UserConstant.IS_SINGLE.get(UserConstant.YES));
        user.setPhotoNo("");
        user.setUserNo("b78ebdf04c5443cba45411cbc936cf99");
        user.setVideoNo("");
        userMapper.insert(user);
    }

}
