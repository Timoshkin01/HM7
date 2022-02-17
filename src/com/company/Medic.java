package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String superPowerAbility) {
        super(health, damage, superPowerAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Лечение по площади " + getSuperPowerAbility());
    }

    public String info() {return super.info();}
}

