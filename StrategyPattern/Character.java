package StrategyPattern;

//Character Base Class
public abstract class Character {
 protected AttackStrategy attackStrategy;
 protected DefenseStrategy defenseStrategy;

 public void setAttackStrategy(AttackStrategy attackStrategy) {
     this.attackStrategy = attackStrategy;
 }

 public void setDefenseStrategy(DefenseStrategy defenseStrategy) {
     this.defenseStrategy = defenseStrategy;
 }

 public void performAttack() {
     attackStrategy.attack();
 }

 public void performDefend() {
     defenseStrategy.defend();
 }
}

