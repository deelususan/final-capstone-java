package com.ecom.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecom.web.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, Long> {


}