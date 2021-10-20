package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HeroFactory heroFactory=new HeroItemsConcreteFactory();
        heroFactory.heroPurchase("CMItem");
        System.out.println("\n");

//        heroFactory.heroPurchase("AntiMagItem");


    }
}
