package com.ty.onetomanybi_dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetomanybi_dto.Items;
import com.ty.onetomanybi_dto.Shoppingcart;

public class ShoppingDao {
	public void saveShoppingcart(Shoppingcart cart) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("umsgs");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		/*et.begin();
		em.persist(cart);
		List<Items> item = cart.getItem();

		for (Items item5 : item) {
			em.persist(item5);

		}
		et.commit();
	*/

		et.begin();
		em.persist(cart);
		et.commit();
}
	}
