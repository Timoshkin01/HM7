package com.company;

public abstract class Hero implements HavingSuperAbility {
    public Hero(int health, int damage, String superPowerAbility) {
        this.health = health;
        this.damage = damage;
        this.superPowerAbility = superPowerAbility;
    }

    private int health;
    private int damage;
    private String superPowerAbility;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperPowerAbility() {
        return superPowerAbility;
    }

    public void setSuperPowerAbility(String superPowerAbility) {
        this.superPowerAbility = superPowerAbility;
    }

    public String info() {return this.health + " " + this.damage + " " + this.superPowerAbility;}
}
