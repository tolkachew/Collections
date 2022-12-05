package com.company;

public class FantasyGame {
    public static void main(String[] args) {
        ElfBarracks elfBarracks = new ElfBarracks();
        Warrior warrior = elfBarracks.createWarrior();
        warrior.attack();
    }
}

abstract class Barracks {
    public abstract Warrior createWarrior();

    public abstract Archer createArcher();

    public abstract Mage createMage();
}

abstract class Archer {
    public abstract void shoot();
}

abstract class Mage {
    public abstract void cast();
}

abstract class Warrior {
    public abstract void attack();
}

class ElfArcher extends Archer {
    public void shoot() {
        System.out.println("Archer shoot");
    }
}

class ElfMage extends Mage {
    public void cast() {
        System.out.println("Mage cast");
    }
}

class ElfWarrior extends Warrior {
    public void attack() {
        System.out.println("ElfWarrior attack");
    }
}

class ElfBarracks extends Barracks {

    @Override
    public Warrior createWarrior() {
        return new ElfWarrior();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Mage createMage() {
        return null;
    }
}
