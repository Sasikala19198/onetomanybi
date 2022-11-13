package com.ty.onetomanybi_dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Shoppingcart {
	@Id
	private int id;
	private String name;
	private String address;
	private String emailid;
	
    @OneToMany(mappedBy="cart",cascade = CascadeType.PERSIST)
    
	private List<Items>item;
	
	public List<Items> getItem() {
		return item;
	}
	public void setItem(List<Items> item) {
		this.item = item;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
}
