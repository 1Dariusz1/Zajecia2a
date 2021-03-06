package pl.zajeca1.Zoo;

class Bear extends Animal implements Attackable{
    private AttackStrategy attackStrategy;

    Bear(AttackStrategy attackStrategy) {
        this.attackStrategy = attackStrategy;
    }



    @Override
    public void attack(Animal animal) {
        attackStrategy.attack(this, animal);
    }


}
