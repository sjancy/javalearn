package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the payment database table.
 * 
 */
@Entity
@NamedQuery(name="Payment.findAll", query="SELECT p FROM Payment p")
public class Payment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int paymentID;

	private int orderID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date paymentDate;

	private BigDecimal paymentTotalPaid;

	private String paymentType;

	public Payment() {
	}

	public int getPaymentID() {
		return this.paymentID;
	}

	public void setPaymentID(int paymentID) {
		this.paymentID = paymentID;
	}

	public int getOrderID() {
		return this.orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public BigDecimal getPaymentTotalPaid() {
		return this.paymentTotalPaid;
	}

	public void setPaymentTotalPaid(BigDecimal paymentTotalPaid) {
		this.paymentTotalPaid = paymentTotalPaid;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

}