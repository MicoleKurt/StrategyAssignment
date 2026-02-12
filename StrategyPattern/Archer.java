package StrategyPattern;

public class Archer extends Character {
    public Archer() {
        attackStrategy = new ShootArrow();
        defenseStrategy = new Dodge();
    }
}

