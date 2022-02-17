package com.company;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(210, 21, "Electro");
        Medic medic = new Medic(200, 20, "Healling");
        Warrior warrior = new Warrior(220, 22, "Critical damage");

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("Shii");

            System.out.println(heroes[i].info());
        }
    }
}

