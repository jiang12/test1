package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

/**
 * 
 * @comment
 * 
 * @author
 * 
 * @date 2021��1��5��
 * 
 * @version 1.0.0
 * 
 * @company
 */
public interface UserService {
	User getUsers(Integer id);

	void addScore(Integer id, Integer score);
}
