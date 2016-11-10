package com.itnao.dao;

import com.itnao.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 凯 on 2016/11/10.
 */
@Repository
public interface UserDao {

    List<User> getUser();
}
