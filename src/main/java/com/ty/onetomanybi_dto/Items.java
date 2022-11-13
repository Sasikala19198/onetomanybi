package com.ty.onetomanybi_dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Items {
	
		@Id
		private int id;
		private String name;
		private int price;
		private String manufacturer;
		private String address;
		
		@ManyToOne
		@JoinColumn
		private Shoppingcart cart;
		
		
		public Shoppingcart getCart() {
			return cart;
		}
		public void setCart(Shoppingcart cart) {
			this.cart = cart;
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
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		

}
