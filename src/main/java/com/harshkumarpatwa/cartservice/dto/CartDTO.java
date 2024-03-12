package com.harshkumarpatwa.cartservice.dto;

import com.harshkumarpatwa.cartservice.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CartDTO {
    private Long id;
    private Long userId;
    private Date date;
    private Product[] products;

}
