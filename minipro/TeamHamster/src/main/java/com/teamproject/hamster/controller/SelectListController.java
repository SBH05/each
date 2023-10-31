package com.teamproject.hamster.controller;

import com.teamproject.hamster.dto.ProductDTO;
import com.teamproject.hamster.view.ListView;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectListController {


    private ArrayList<ProductDTO> selectList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    public void selectMenu() {
        int productNumber = 0;

        ArrayList<ProductDTO> productList = new ListView().getProductList();
        do {
            System.out.println("============선택한 상품 목롭입니다============");
            for (int i = 0; i < selectList.size(); i++) {
                System.out.println((i+1)+")"+selectList.get(i).getName()+" | 사이즈: "+selectList.get(i).getSize()+" | 금액: "+selectList.get(i).getPrice()+"원");

            }

            System.out.println();
            System.out.println("============준비된 상품 목롭입니다============");

            for (int i = 0; i < productList.size(); i++) {
                System.out.println((i+1)+") "+productList.get(i).getName()+" | 사이즈: "+productList.get(i).getSize()+" | 금액: "+productList.get(i).getPrice()+"원");
            }

            System.out.print("\n16) 선택상품 초기화\n");
            System.out.print("17) 프로그램 종료\n");

            if (selectList.size() > 0) {
                System.out.print("18) 장바구니가기");
            }
            System.out.print("선택할 상품을 입력하세요 : ");
            productNumber = sc.nextInt();


            if (productNumber == 16) {
                selectList.clear();
            }
            if (productList.size() > productNumber -1)
            {
                selectList.add(productList.get(productNumber - 1));
            }

        } while (productNumber != 17);
    }


    public ArrayList<ProductDTO> getSelectLists(ArrayList<ProductDTO> select){  // 선택한 상품목록 메소드
        return selectList;
    }





}


