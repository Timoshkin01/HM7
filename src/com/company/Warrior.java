package com.company;

public class Warrior extends Hero{

    public Warrior(int health, int damage, String superPowerAbility) {
        super(health, damage, superPowerAbility);
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Молниеносная смерть " + getSuperPowerAbility());
    }

    public String info() {return super.info();}
}
