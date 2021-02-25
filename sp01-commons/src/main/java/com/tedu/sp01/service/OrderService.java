package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

/**
 * 
 * @comment
 * 
 * @author
 * 
 * @date 2021Äê1ÔÂ5ÈÕ
 * 
 * @version 1.0.0
 * 
 * @company
 */
public interface OrderService {
	Order getOrder(String orderId);

	void addOrder(Order order);
}
