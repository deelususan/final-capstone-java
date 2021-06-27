package com.ecom.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.web.entity.Orders;
import com.ecom.web.entity.Product;
import com.ecom.web.entity.User;
import com.ecom.web.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderrepository;

	// Get All Orders
	public List<Orders> geAllMyorders() {
		return orderrepository.findAll();

	}

	// Find Products by UserId
	//public List<Orders> getOrderbyMyUserId(long u_id) {
//		return orderrepository.getCartbyUserId(u_id);
//	}

	/* Add Order to Cart
	public List<Orders> addMyOrder(long p_id, long u_id) {
		Orders obj = new Orders();
		obj.setP_id(p_id);
		obj.setU_id(u_id);

		return this.getOrderbyMyUserId(u_id);

	}*/
	
	public User findUserId(String uname) {
		return orderrepository.findUserIdByUname(uname);
		
	}
	
	public Orders addMyOrder(Orders order) {
	return orderrepository.save(order);

	}

}
