package com.rbi.materialgroup.Dao;

import com.rbi.materialgroup.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User,Integer> {

}
