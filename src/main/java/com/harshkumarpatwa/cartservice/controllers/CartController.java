package com.harshkumarpatwa.cartservice.controllers;

import com.harshkumarpatwa.cartservice.models.Cart;
import org.springframework.web.bind.annotation.*;
import com.harshkumarpatwa.cartservice.services.CartService;

@RestController
public class CartController {
    private CartService cartService;
    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/carts/{id}")
    public Cart getCartById(@PathVariable("id") Long id) {
        return cartService.getCartById(id);
    }
    @GetMapping("/carts")
    public Cart[] getAllcart(){
        return cartService.getAllcart();
    }
    @GetMapping("/carts/")
    public Cart[] getCartInRangeOfDate(@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate){
        return cartService.getCartInRangeOfDate(startDate, endDate);
    }
    @GetMapping("/carts/user/{userId}")
    public Cart[] getCartByUserId(@PathVariable("userId") Long userId){
        return cartService.getCartByUserId(userId);
    }
    @PostMapping("/carts")
    public Cart addNewCart(@RequestBody Cart cart){
        return cartService.addNewCart(cart);
    }
    @PatchMapping("/carts/{id}")
    public Cart updateCart(@PathVariable("id") Long id,@RequestBody Cart cart){
        return cartService.updateCart(id,cart);
    }
    @DeleteMapping("/carts/{id}")
    public Cart deleteCart(@PathVariable("id") Long id){
        return cartService.deleteCart(id);
    }

}
