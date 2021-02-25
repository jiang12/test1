package com.tedu.sp01.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 *@comment  

 *@author 

 *@date 2021Äê1ÔÂ5ÈÕ

 *@version 1.0.0

 *@company 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
	private String id;
	private User user;
	private List<Item> items;
}
