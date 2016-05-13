package com.dmz.service.serviceimpl;

import com.dmz.basic.mapper.LoginMapper;
import com.dmz.basic.mapper.UserMapper;
import com.dmz.basic.model.Login;
import com.dmz.basic.model.User;
import com.dmz.service.iservice.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

/**
 * Created by dmz on 2016/3/18.
 */
@Service
public class LoginService implements ILoginService {

    @Autowired
    private LoginMapper loginMapper;

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public int addLoginInfo(Login login) {
        return loginMapper.insert(login);
    }

    public Login getLoginInfoById(Long id) {
        return loginMapper.selectByPrimaryKey(id);
    }

    public Login getLoginInfoByLogin(Login login) {
        return loginMapper.selectLoginByLogin(login);
    }

    public User showUserDetailByLoginName(Login login) {
        if (login != null && login.getLoginName() != null) {
            login = loginMapper.selectLoginByLogin(login);
            if (login != null) {
                User user = new User();
                user.setUserNo(login.getUserNo());
                return userMapper.selectUserByUser(user);
            }
        }
        return null;
    }

    public Boolean checkUserLogin(Login login) {

        if (login!=null && !StringUtils.isEmpty(login.getLoginName()) &&
                !StringUtils.isEmpty(login.getPasswd())){

            login = loginMapper.selectLoginByLogin(login);
            if (login != null ){
                return true;
            }
        }
        return false;
    }

}
