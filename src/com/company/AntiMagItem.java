package com.company;

public class AntiMagItem implements HeroItems {
    @Override
    public void itemForAura() {
        System.out.println("Buying Radiance");
    }

    @Override
    public void itemForSave() {
        System.out.println("Buying Satanic");
    }

    @Override
    public void itemForDamage() {
        System.out.println("Buying Crystalys");
    }

    @Override
    public void itemForMobility() {
        System.out.println("Buying Manta Style");
    }
}
