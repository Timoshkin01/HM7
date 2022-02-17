package com.company;

public class Magic extends Hero {

    public Magic(int health, int damage, String superPowerAbility) {
        super(health, damage, superPowerAbility);
    }

    @Override
    public void applySuperAbility(String superPowerAbilityType) {
        System.out.println("Маг применил способность " + getSuperPowerAbility());
    }

    public String info() {return super.info();}
}

