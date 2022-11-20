package com.jerin.rjburgers.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the menuitem database table.
 * 
 */
@Entity
@NamedQuery(name="Menuitem.findAll", query="SELECT m FROM Menuitem m")
public class Menuitem implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int menuItemID;

	private String menuItemDescription;

	private String menuItemName;

	private BigDecimal menuItemPrice;

	private int menuItemType;

	public Menuitem() {
	}

	public int getMenuItemID() {
		return this.menuItemID;
	}

	public void setMenuItemID(int menuItemID) {
		this.menuItemID = menuItemID;
	}

	public String getMenuItemDescription() {
		return this.menuItemDescription;
	}

	public void setMenuItemDescription(String menuItemDescription) {
		this.menuItemDescription = menuItemDescription;
	}

	public String getMenuItemName() {
		return this.menuItemName;
	}

	public void setMenuItemName(String menuItemName) {
		this.menuItemName = menuItemName;
	}

	public BigDecimal getMenuItemPrice() {
		return this.menuItemPrice;
	}

	public void setMenuItemPrice(BigDecimal menuItemPrice) {
		this.menuItemPrice = menuItemPrice;
	}

	public int getMenuItemType() {
		return this.menuItemType;
	}

	public void setMenuItemType(int menuItemType) {
		this.menuItemType = menuItemType;
	}

}