package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the orderdetails database table.
 * 
 */
@Entity
@Table(name="orderdetails")
@NamedQuery(name="Orderdetail.findAll", query="SELECT o FROM Orderdetail o")
public class Orderdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OrderdetailPK id;

	private int menuItemQuantity;

	private String orderDetailsComments;

	public Orderdetail() {
	}

	public OrderdetailPK getId() {
		return this.id;
	}

	public void setId(OrderdetailPK id) {
		this.id = id;
	}

	public int getMenuItemQuantity() {
		return this.menuItemQuantity;
	}

	public void setMenuItemQuantity(int menuItemQuantity) {
		this.menuItemQuantity = menuItemQuantity;
	}

	public String getOrderDetailsComments() {
		return this.orderDetailsComments;
	}

	public void setOrderDetailsComments(String orderDetailsComments) {
		this.orderDetailsComments = orderDetailsComments;
	}

}