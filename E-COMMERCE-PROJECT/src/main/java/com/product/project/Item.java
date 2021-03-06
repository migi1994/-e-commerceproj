package com.product.project;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {
      @Id
    @GeneratedValue
	private Integer itemNo;
	private String itemDesc;
	private double  itempirce;
	
	

  
  
	public Item(int itemNo, String itemDesc, double itempirce) {
		super();
		this.itemNo = itemNo;
		this.itemDesc = itemDesc;
		this.itempirce = itempirce;
	   
	}
	public int getItemNo() {
		return itemNo;
	}
	public void setItemNo(int itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public double getItempirce() {
		return itempirce;
	}
	public void setItempirce(float itempirce) {
		this.itempirce = itempirce;
	}



	
	
}