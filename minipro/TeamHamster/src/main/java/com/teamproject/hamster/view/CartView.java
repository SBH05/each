package com.teamproject.hamster.view;

import com.teamproject.hamster.controller.CartController;
import com.teamproject.hamster.dto.ProductDTO;

import java.util.ArrayList;

public class CartView {

    public static void main(String[] args) {
        CartController cartController = new CartController();
        ArrayList<ProductDTO> productList;
        productList = new ArrayList<>();
        productList.add(new ProductDTO("아디다스 퍼피랫", 240, 110000));
        productList.add(new ProductDTO("퓨마 바리 뮬", 230, 120000));
        productList.add(new ProductDTO("나이키 인피니티 런", 260, 80000));


        cartController.shopBasket(productList);
    }

}
