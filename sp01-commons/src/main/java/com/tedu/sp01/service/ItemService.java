package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

/**
 * 
 *@comment  

 *@author 

 *@date 2021Äê1ÔÂ5ÈÕ

 *@version 1.0.0

 *@company 
 */
public interface ItemService {
	List<Item> getItems(String orderId);
	void decreaseNumbers(List<Item> list);
}
