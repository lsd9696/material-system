package com.rbi.materialgroup.Service;

import com.rbi.materialgroup.Dao.UserDao;
import com.rbi.materialgroup.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

//    增加
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

//    删除
    @Transactional
    public void deleteById(int id){
        userDao.deleteById(id);
    }

//查询所有
    @Transactional
    public List<User> findAll(){
        List<User> userList = (List<User>) userDao.findAll();
        return userList;
    }

}
