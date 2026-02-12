package StrategyPattern;

public class Knight extends Character {
    public Knight() {
        attackStrategy = new SwingSword();
        // A Knight uses multiple defense strategies
        defenseStrategy = new Shield(); // Default
    }

    public void defendMultiple() {
        new Shield().defend();
        new Dodge().defend();
        new CreateMagic().defend();
    }
}



