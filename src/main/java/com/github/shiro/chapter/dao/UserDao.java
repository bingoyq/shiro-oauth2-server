package com.github.shiro.chapter.dao;

import java.util.List;

import com.github.shiro.chapter.entity.User;

/**
 * 
 * @ClassName: UserDao 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 袁强 
 * @date 2016年3月25日 下午3:19:01 
 *
 */
public interface UserDao {

    public User createUser(User user);
    public User updateUser(User user);
    public void deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
