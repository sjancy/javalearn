package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the order database table.
 * 
 */
@Entity
@NamedQuery(name="Order.findAll", query="SELECT o FROM Order o")
public class Order implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int orderID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDateTime;

	private BigDecimal orderTotalCost;

	private String orderType;

	//bi-directional many-to-one association to Customer
	@ManyToOne
	@JoinColumn(name="CustomerID")
	private Customer customer;

	//bi-directional many-to-one association to Deliveryaddress
	@ManyToOne
	@JoinColumn(name="DeliveryAddressID")
	private Deliveryaddress deliveryaddress;

	//bi-directional many-to-one association to Deliveryperson
	@ManyToOne
	@JoinColumn(name="DeliveryPersonID")
	private Deliveryperson deliveryperson;

	//bi-directional many-to-one association to Employee
	@ManyToOne
	@JoinColumn(name="EmployeeID")
	private Employee employee;

	public Order() {
	}

	public int getOrderID() {
		return this.orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Date getOrderDateTime() {
		return this.orderDateTime;
	}

	public void setOrderDateTime(Date orderDateTime) {
		this.orderDateTime = orderDateTime;
	}

	public BigDecimal getOrderTotalCost() {
		return this.orderTotalCost;
	}

	public void setOrderTotalCost(BigDecimal orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}

	public String getOrderType() {
		return this.orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Deliveryaddress getDeliveryaddress() {
		return this.deliveryaddress;
	}

	public void setDeliveryaddress(Deliveryaddress deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}

	public Deliveryperson getDeliveryperson() {
		return this.deliveryperson;
	}

	public void setDeliveryperson(Deliveryperson deliveryperson) {
		this.deliveryperson = deliveryperson;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}