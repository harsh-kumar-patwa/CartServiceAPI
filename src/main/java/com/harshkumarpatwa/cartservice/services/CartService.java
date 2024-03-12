package com.harshkumarpatwa.cartservice.services;

import com.harshkumarpatwa.cartservice.dto.CartDTO;
import com.harshkumarpatwa.cartservice.models.Cart;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CartService implements CartInteface{
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public Cart getCartById(Long id) {
        CartDTO cartDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/carts/"+id,
                CartDTO.class);
        Cart cart = new Cart();
        cart.setId(cartDTO.getId());
        cart.setDate(cartDTO.getDate());
        cart.setUserId(cartDTO.getUserId());
        cart.setProduct(cartDTO.getProducts());
        return cart;


    }
    @Override
    public Cart[] getAllcart() {
        CartDTO[] cartDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/carts",
                CartDTO[].class);
        Cart[] cartList = new Cart[cartDTO.length];
        for (int i = 0; i < cartDTO.length; i++) {
            cartList[i] = new Cart();
            cartList[i].setId(cartDTO[i].getId());
            cartList[i].setUserId(cartDTO[i].getUserId());
            cartList[i].setDate(cartDTO[i].getDate());
            cartList[i].setProduct(cartDTO[i].getProducts());
        }
        return cartList;
    }
    @Override
    public Cart[] getCartInRangeOfDate(String startDate, String endDate) {
        CartDTO[] cartDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/carts?startdate="+startDate+"&enddate="+endDate,
                CartDTO[].class);
        Cart[] cartListByDate = new Cart[cartDTO.length];
        for (int i = 0; i < cartDTO.length; i++) {
            cartListByDate[i] = new Cart();
            cartListByDate[i].setId(cartDTO[i].getId());
            cartListByDate[i].setUserId(cartDTO[i].getUserId());
            cartListByDate[i].setProduct(cartDTO[i].getProducts());
            cartListByDate[i].setDate(cartDTO[i].getDate());
        }
        return cartListByDate;
    }
    @Override
    public Cart[] getCartByUserId(Long userId) {
        CartDTO[] cartDTO = restTemplate.getForObject(
                "https://fakestoreapi.com/carts/user/"+userId,
                CartDTO[].class);
        Cart[] cartListByUserId = new Cart[cartDTO.length];
        for (int i = 0; i < cartDTO.length; i++) {
            cartListByUserId[i] = new Cart();
            cartListByUserId[i].setId(cartDTO[i].getId());
            cartListByUserId[i].setUserId(cartDTO[i].getUserId());
            cartListByUserId[i].setProduct(cartDTO[i].getProducts());
            cartListByUserId[i].setDate(cartDTO[i].getDate());

        }
        return cartListByUserId;
    }

    public Cart addNewCart(Cart cart) {
        CartDTO cartDTO = new CartDTO();
        cartDTO.setId(cart.getId());
        cartDTO.setUserId(cart.getUserId());
        cartDTO.setDate(cart.getDate());
        cartDTO.setProducts(cart.getProduct());

        restTemplate.postForEntity(
                "https://fakestoreapi.com/carts",
                cartDTO,
                CartDTO.class);

        return cart;
    }
    @Override
    public Cart updateCart(Long id,Cart cart) {
        Cart oldCart = getCartById(id);
        CartDTO newCart = new CartDTO();
        newCart.setId(oldCart.getId());
        newCart.setUserId(oldCart.getUserId());
        newCart.setDate(oldCart.getDate());
        newCart.setProducts(oldCart.getProduct());

        restTemplate.postForEntity(
                "https://fakestoreapi.com/carts",
                newCart,
                Cart.class);
        return cart;
    }
    @Override
    public Cart deleteCart(Long id) {
        Cart getCart = getCartById(id);
        restTemplate.delete("https://fakestoreapi.com/carts/"+id);
        return getCart;
    }
}
