package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the deliveryperson database table.
 * 
 */
@Entity
@NamedQuery(name="Deliveryperson.findAll", query="SELECT d FROM Deliveryperson d")
public class Deliveryperson implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int deliveryPersonID;

	private String deliveryPersonCity;

	private String deliveryPersonFirstName;

	private String deliveryPersonLastName;

	private String deliveryPersonPhone;

	private String deliveryPersonState;

	private String deliveryPersonStreet1;

	private String deliveryPersonStreet2;

	private String deliveryPersonZip;

	//bi-directional many-to-one association to Deliveryarea
	@ManyToOne
	@JoinColumn(name="DeliveryAreaID")
	private Deliveryarea deliveryarea;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="deliveryperson")
	private List<Order> orders;

	public Deliveryperson() {
	}

	public int getDeliveryPersonID() {
		return this.deliveryPersonID;
	}

	public void setDeliveryPersonID(int deliveryPersonID) {
		this.deliveryPersonID = deliveryPersonID;
	}

	public String getDeliveryPersonCity() {
		return this.deliveryPersonCity;
	}

	public void setDeliveryPersonCity(String deliveryPersonCity) {
		this.deliveryPersonCity = deliveryPersonCity;
	}

	public String getDeliveryPersonFirstName() {
		return this.deliveryPersonFirstName;
	}

	public void setDeliveryPersonFirstName(String deliveryPersonFirstName) {
		this.deliveryPersonFirstName = deliveryPersonFirstName;
	}

	public String getDeliveryPersonLastName() {
		return this.deliveryPersonLastName;
	}

	public void setDeliveryPersonLastName(String deliveryPersonLastName) {
		this.deliveryPersonLastName = deliveryPersonLastName;
	}

	public String getDeliveryPersonPhone() {
		return this.deliveryPersonPhone;
	}

	public void setDeliveryPersonPhone(String deliveryPersonPhone) {
		this.deliveryPersonPhone = deliveryPersonPhone;
	}

	public String getDeliveryPersonState() {
		return this.deliveryPersonState;
	}

	public void setDeliveryPersonState(String deliveryPersonState) {
		this.deliveryPersonState = deliveryPersonState;
	}

	public String getDeliveryPersonStreet1() {
		return this.deliveryPersonStreet1;
	}

	public void setDeliveryPersonStreet1(String deliveryPersonStreet1) {
		this.deliveryPersonStreet1 = deliveryPersonStreet1;
	}

	public String getDeliveryPersonStreet2() {
		return this.deliveryPersonStreet2;
	}

	public void setDeliveryPersonStreet2(String deliveryPersonStreet2) {
		this.deliveryPersonStreet2 = deliveryPersonStreet2;
	}

	public String getDeliveryPersonZip() {
		return this.deliveryPersonZip;
	}

	public void setDeliveryPersonZip(String deliveryPersonZip) {
		this.deliveryPersonZip = deliveryPersonZip;
	}

	public Deliveryarea getDeliveryarea() {
		return this.deliveryarea;
	}

	public void setDeliveryarea(Deliveryarea deliveryarea) {
		this.deliveryarea = deliveryarea;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setDeliveryperson(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setDeliveryperson(null);

		return order;
	}

}