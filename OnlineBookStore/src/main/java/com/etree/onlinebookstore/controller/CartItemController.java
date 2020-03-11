package com.etree.onlinebookstore.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.etree.onlinebookstore.model.Cart;
import com.etree.onlinebookstore.model.CartItem;
import com.etree.onlinebookstore.service.BookService;
import com.etree.onlinebookstore.service.CartItemService;
import com.etree.onlinebookstore.service.CartService;
import com.etree.onlinebookstore.service.CustomerService;

@RestController
public class CartItemController {

	@Autowired
	private CartService cartService;

	@Autowired
	private CartItemService cartItemService;

	@Autowired
	private CustomerService customerService;

	@Autowired
	private BookService bookService;

	/*
	 * @GetMapping("/user/cart/add/{productId}") public void
	 * addCartItem(@PathVariable(value = "productId") int productId) { User user =
	 * (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
	 * String mailId = user.getUsername(); Customer customer =
	 * customerService.findCustomerByMailId(mailId); Cart cart = customer.getCart();
	 * List<CartItem> cartItems = cart.getCartItems(); Book book =
	 * bookService.findById(productId).orElse(null); for (int i = 0; i <
	 * cartItems.size(); i++) { CartItem cartItem = cartItems.get(i); if
	 * (book.getBookId() == cartItem.getBook().getBookId()) {
	 * cartItem.setQuantity(cartItem.getQuantity() + 1);
	 * cartItem.setTotalPrice(cartItem.getQuantity() *
	 * cartItem.getBook().getBookPrice()); cartItemService.save(cartItem); return; }
	 * } CartItem cartItem = new CartItem(); cartItem.setQuantity(1);
	 * cartItem.setBook(book); cartItem.setTotalPrice(book.getBookPrice() * 1);
	 * cartItem.setCart(cart); cartItemService.save(cartItem); }
	 */
	@GetMapping("/user/cart/removeCartItem/{cartItemId}")
	public void removeCartItem(@PathVariable(value = "cartItemId") int cartItemId) {
		cartItemService.deleteById(cartItemId);
	}

	@GetMapping("/user/cart/removeAllItems/{cartId}")
	public void removeAllCartItems(@PathVariable(value = "cartId") int cartId) {
		Optional<Cart> cart = cartService.findById(cartId);
		List<CartItem> cartItems = cart.get().getCartItems();
		for (CartItem cartItem : cartItems) {
			cartItemService.deleteById(cartItem.getCartItemId());
		}
	}
}
