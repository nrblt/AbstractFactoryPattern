package com.company;

public class HeroNeutralItemsConcreteFactory  implements HeroNeutralItemsFactory{
    @Override
    public HeroNeutralItems heroNeutralPurchase(String neutralItem) {
        HeroNeutralItems heroNeutralItems=null;
        if(neutralItem=="flicker"){
            heroNeutralItems=new Flicker();
        }
        else{
            heroNeutralItems=new Apex();
        }
        return heroNeutralItems;
    }
}
