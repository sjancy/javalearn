package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the deliveryareazip database table.
 * 
 */
@Entity
@NamedQuery(name="Deliveryareazip.findAll", query="SELECT d FROM Deliveryareazip d")
public class Deliveryareazip implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int deliveryAreaZipCode;

	private int deliveryAreaID;

	public Deliveryareazip() {
	}

	public int getDeliveryAreaZipCode() {
		return this.deliveryAreaZipCode;
	}

	public void setDeliveryAreaZipCode(int deliveryAreaZipCode) {
		this.deliveryAreaZipCode = deliveryAreaZipCode;
	}

	public int getDeliveryAreaID() {
		return this.deliveryAreaID;
	}

	public void setDeliveryAreaID(int deliveryAreaID) {
		this.deliveryAreaID = deliveryAreaID;
	}

}