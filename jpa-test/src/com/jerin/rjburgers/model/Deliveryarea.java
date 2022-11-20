package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the deliveryarea database table.
 * 
 */
@Entity
@NamedQuery(name="Deliveryarea.findAll", query="SELECT d FROM Deliveryarea d")
public class Deliveryarea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int deliveryAreaID;

	private String deliveryAreaName;

	//bi-directional many-to-one association to Deliveryperson
	@OneToMany(mappedBy="deliveryarea")
	private List<Deliveryperson> deliverypersons;

	public Deliveryarea() {
	}

	public int getDeliveryAreaID() {
		return this.deliveryAreaID;
	}

	public void setDeliveryAreaID(int deliveryAreaID) {
		this.deliveryAreaID = deliveryAreaID;
	}

	public String getDeliveryAreaName() {
		return this.deliveryAreaName;
	}

	public void setDeliveryAreaName(String deliveryAreaName) {
		this.deliveryAreaName = deliveryAreaName;
	}

	public List<Deliveryperson> getDeliverypersons() {
		return this.deliverypersons;
	}

	public void setDeliverypersons(List<Deliveryperson> deliverypersons) {
		this.deliverypersons = deliverypersons;
	}

	public Deliveryperson addDeliveryperson(Deliveryperson deliveryperson) {
		getDeliverypersons().add(deliveryperson);
		deliveryperson.setDeliveryarea(this);

		return deliveryperson;
	}

	public Deliveryperson removeDeliveryperson(Deliveryperson deliveryperson) {
		getDeliverypersons().remove(deliveryperson);
		deliveryperson.setDeliveryarea(null);

		return deliveryperson;
	}

}