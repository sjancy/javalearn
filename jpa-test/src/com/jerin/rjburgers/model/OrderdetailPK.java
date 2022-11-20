package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the orderdetails database table.
 * 
 */
@Embeddable
public class OrderdetailPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int orderID;

	private int menuItemID;

	public OrderdetailPK() {
	}
	public int getOrderID() {
		return this.orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getMenuItemID() {
		return this.menuItemID;
	}
	public void setMenuItemID(int menuItemID) {
		this.menuItemID = menuItemID;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OrderdetailPK)) {
			return false;
		}
		OrderdetailPK castOther = (OrderdetailPK)other;
		return 
			(this.orderID == castOther.orderID)
			&& (this.menuItemID == castOther.menuItemID);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.orderID;
		hash = hash * prime + this.menuItemID;
		
		return hash;
	}
}