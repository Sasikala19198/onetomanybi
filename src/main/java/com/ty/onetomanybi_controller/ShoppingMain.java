package com.ty.onetomanybi_controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi_dao.ShoppingDao;
import com.ty.onetomanybi_dto.Items;
import com.ty.onetomanybi_dto.Shoppingcart;

public class ShoppingMain {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("umsgs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Shoppingcart cart=new Shoppingcart();
		cart.setId(5);
		cart.setName("subash");
		cart.setAddress("usilai");
		cart.setEmailid("subash@gmail.com"); 
		
		Items item=new Items();
		item.setId(101);
		item.setName("choclate");
		item.setPrice(50);
		item.setManufacturer("kitkat");
		item.setCart(cart);
		
		Items item1=new Items();
		item1.setId(201);
		item1.setName("poha");
		item1.setPrice(100);
		item1.setManufacturer("Rahipoha");
		item1.setCart(cart);
		
		List<Items>it=new ArrayList<Items>();
		it.add(item);
		it.add(item1);
		
		cart.setItem(it);
		
		ShoppingDao dao=new ShoppingDao();
		dao.saveShoppingcart(cart);
		
	}

}
