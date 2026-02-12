package StrategyPattern;

public class GameApp {
    public static void main(String[] args) {
        System.out.println("=== Micole Kurt Gonda ===");
        System.out.println("=== Lab Assignment 1: Strategy Pattern ===\n");

        Character knight = new Knight();
        knight.performAttack();
        ((Knight) knight).defendMultiple();

        System.out.println();

        Character wizard = new Wizard();
        wizard.performAttack();
        wizard.performDefend();

        System.out.println();

        Character archer = new Archer();
        archer.performAttack();
        archer.performDefend();
    }
}
