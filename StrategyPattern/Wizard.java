package StrategyPattern;

public class Wizard extends Character {
    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategy = new CreateMagic();
    }
}