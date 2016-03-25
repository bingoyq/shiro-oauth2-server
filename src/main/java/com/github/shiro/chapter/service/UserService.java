package com.github.shiro.chapter.service;

import java.util.List;

import com.github.shiro.chapter.entity.User;

/**
 * 
 * @ClassName: UserService 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author 袁强 
 * @date 2016年3月25日 下午3:17:51 
 *
 */
public interface UserService {
    /**
     * 创建用户
     * @param user
     */
    public User createUser(User user);

    public User updateUser(User user);

    public void deleteUser(Long userId);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public void changePassword(Long userId, String newPassword);

    User findOne(Long userId);

    List<User> findAll();

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);

}
