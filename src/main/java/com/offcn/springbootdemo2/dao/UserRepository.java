package com.offcn.springbootdemo2.dao;

import com.offcn.springbootdemo2.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByNameAndAge(String name,Integer age);
}
