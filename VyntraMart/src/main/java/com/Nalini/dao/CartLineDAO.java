package com.Nalini.dao;

import java.util.List;

import com.Nalini.Model.Cart;
import com.Nalini.Model.CartLine;
import com.Nalini.Model.OrderDetail;

public interface CartLineDAO {

	public List<CartLine> list(int cartId);
	public CartLine get(int id);	
	public boolean add(CartLine cartLine);
	public boolean update(CartLine cartLine);
	public boolean delete(CartLine cartLine);

	// list of available cartLine
		public List<CartLine> listAvailable(int cartId);

		// fetch the CartLine based on cartId and productId
		public CartLine getByCartAndProduct(int cartId, int productId);	
		
		boolean updateCart(Cart cart);
		
		// adding order details
		boolean addOrderDetail(OrderDetail orderDetail);

	
}
