package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the deliveryaddress database table.
 * 
 */
@Entity
@NamedQuery(name="Deliveryaddress.findAll", query="SELECT d FROM Deliveryaddress d")
public class Deliveryaddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int deliveryAddressID;

	private String deliveryAddressCity;

	private String deliveryAddressState;

	private String deliveryAddressStreet1;

	private String deliveryAddressStreet2;

	private String deliveryAddressZip;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="deliveryaddress")
	private List<Order> orders;

	public Deliveryaddress() {
	}

	public int getDeliveryAddressID() {
		return this.deliveryAddressID;
	}

	public void setDeliveryAddressID(int deliveryAddressID) {
		this.deliveryAddressID = deliveryAddressID;
	}

	public String getDeliveryAddressCity() {
		return this.deliveryAddressCity;
	}

	public void setDeliveryAddressCity(String deliveryAddressCity) {
		this.deliveryAddressCity = deliveryAddressCity;
	}

	public String getDeliveryAddressState() {
		return this.deliveryAddressState;
	}

	public void setDeliveryAddressState(String deliveryAddressState) {
		this.deliveryAddressState = deliveryAddressState;
	}

	public String getDeliveryAddressStreet1() {
		return this.deliveryAddressStreet1;
	}

	public void setDeliveryAddressStreet1(String deliveryAddressStreet1) {
		this.deliveryAddressStreet1 = deliveryAddressStreet1;
	}

	public String getDeliveryAddressStreet2() {
		return this.deliveryAddressStreet2;
	}

	public void setDeliveryAddressStreet2(String deliveryAddressStreet2) {
		this.deliveryAddressStreet2 = deliveryAddressStreet2;
	}

	public String getDeliveryAddressZip() {
		return this.deliveryAddressZip;
	}

	public void setDeliveryAddressZip(String deliveryAddressZip) {
		this.deliveryAddressZip = deliveryAddressZip;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setDeliveryaddress(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setDeliveryaddress(null);

		return order;
	}

}