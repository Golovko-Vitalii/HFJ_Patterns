package strategy_pattern;

public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehaivor = new Quack();
        flyBehaivor = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
