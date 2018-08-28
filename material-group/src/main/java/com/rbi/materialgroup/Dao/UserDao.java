package com.rbi.materialgroup.Dao;

import com.rbi.materialgroup.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface UserDao extends CrudRepository<User,Integer> {

}
