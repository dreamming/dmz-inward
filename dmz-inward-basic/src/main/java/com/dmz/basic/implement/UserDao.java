package com.dmz.basic.implement;

import com.dmz.basic.exception.DBException;
import com.dmz.basic.idao.IUserDao;
import com.dmz.basic.mapper.UserMapper;
import com.dmz.basic.model.Login;
import com.dmz.basic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by dmz on 2016/8/19.
 */
@Repository
public class UserDao implements IUserDao {

    @Autowired
    private UserMapper userMapper;

    public User selectUserByUser(User userParam) throws DBException.EmptyData, DBException.MultipleData, DBException.DBServerException {
        try {
            List<User> user = userMapper.selectUserByUser(userParam);
            if (user == null || user.isEmpty()) {
                throw new DBException.EmptyData("No User Data.");
            } else if (user.size() != 1) {
                throw new DBException.MultipleData("Multiple Data.");
            } else {
                return user.get(0);
            }
        } catch (Exception e) {
            if (e instanceof DBException.EmptyData) {
                throw (DBException.EmptyData) e;
            } else if (e instanceof DBException.MultipleData) {
                throw (DBException.MultipleData) e;
            }
            throw new DBException.DBServerException("DB Service Error", e);
        }
    }
}
