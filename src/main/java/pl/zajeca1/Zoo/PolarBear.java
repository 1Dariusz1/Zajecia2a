package pl.zajeca1.Zoo;

public class PolarBear extends Bear{
//    private int weight;
    private AttackStrategy attackStrategy;
    private Bear bear;

    public PolarBear() {
        super(new KillAttack());
        attackStrategy = new KillAttack();
        this.weight = 200;


    }





    //    @Override
//    public void attack(Animal animal) {
//        attackStrategy.attack(this, Animal);
//    }

//    public PolarBear(int weight) {
//        super();
//        this.weight = 200;
//    }





}
