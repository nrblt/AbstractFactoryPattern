package com.company;

public class HeroItemsConcreteFactory implements HeroFactory{

    @Override
    public HeroItems heroPurchase(String heroName) {
        HeroItems heroItems = null;
        if(heroName=="AntiMagItem"){
            heroItems =new AntiMagItem();
        }
        else if(heroName=="CMItem"){
            heroItems =new CMItem();
        }
        else{
            System.out.println("Please, write again");
//            heroPurchase()
            return heroItems;
        }
        heroItems.itemForAura();
        heroItems.itemForDamage();
        heroItems.itemForMobility();
        heroItems.itemForDamage();


        return heroItems;
    }
}
