package com.dmz.basic.idao;
import com.dmz.basic.exception.DBException;
import com.dmz.basic.model.Login;

/**
 * Created by dmz on 2016/8/19.
 */
public interface ILoginDao {
    void insertLogin(Login record) throws DBException.NoReaction, DBException.DBServerException;

    Login selectByPrimaryKey(Long id) throws DBException.EmptyData, DBException.MultipleData, DBException.DBServerException;

    Login selectLoginByLogin(Login login) throws DBException.EmptyData, DBException.MultipleData, DBException.DBServerException;
}
