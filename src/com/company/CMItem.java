package com.company;

public class CMItem implements HeroItems {
    @Override
    public void itemForAura() {
        System.out.println("Buying Pipe");
    }

    @Override
    public void itemForSave() {
        System.out.println("Buying Force Staff");
    }

    @Override
    public void itemForDamage() {
        System.out.println("Buying BKB");
    }

    @Override
    public void itemForMobility() {
        System.out.println("Buying Blink");
    }
}
