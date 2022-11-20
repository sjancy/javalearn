package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the employee database table.
 * 
 */
@Entity
@NamedQuery(name="Employee.findAll", query="SELECT e FROM Employee e")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int employeeID;

	private String employeeCity;

	private String employeeFirstName;

	private String employeeLastName;

	private String employeePhone;

	private String employeeState;

	private String employeeStreet1;

	private String employeeStreet2;

	private String employeeZip;

	//bi-directional many-to-one association to Order
	@OneToMany(mappedBy="employee")
	private List<Order> orders;

	public Employee() {
	}

	public int getEmployeeID() {
		return this.employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeCity() {
		return this.employeeCity;
	}

	public void setEmployeeCity(String employeeCity) {
		this.employeeCity = employeeCity;
	}

	public String getEmployeeFirstName() {
		return this.employeeFirstName;
	}

	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}

	public String getEmployeeLastName() {
		return this.employeeLastName;
	}

	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}

	public String getEmployeePhone() {
		return this.employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	public String getEmployeeState() {
		return this.employeeState;
	}

	public void setEmployeeState(String employeeState) {
		this.employeeState = employeeState;
	}

	public String getEmployeeStreet1() {
		return this.employeeStreet1;
	}

	public void setEmployeeStreet1(String employeeStreet1) {
		this.employeeStreet1 = employeeStreet1;
	}

	public String getEmployeeStreet2() {
		return this.employeeStreet2;
	}

	public void setEmployeeStreet2(String employeeStreet2) {
		this.employeeStreet2 = employeeStreet2;
	}

	public String getEmployeeZip() {
		return this.employeeZip;
	}

	public void setEmployeeZip(String employeeZip) {
		this.employeeZip = employeeZip;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public Order addOrder(Order order) {
		getOrders().add(order);
		order.setEmployee(this);

		return order;
	}

	public Order removeOrder(Order order) {
		getOrders().remove(order);
		order.setEmployee(null);

		return order;
	}

}