package com.ecom.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long order_id;

	
	@Column(name="p_id")
	private Long p_id;


	public Orders() {
	
	}


	public Orders(Long order_id, Long p_id) {
		super();
		this.order_id = order_id;
		this.p_id = p_id;
	}


	public Long getOrder_id() {
		return order_id;
	}


	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}


	public Long getP_id() {
		return p_id;
	}


	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}


	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", p_id=" + p_id + "]";
	}
	
	
}
