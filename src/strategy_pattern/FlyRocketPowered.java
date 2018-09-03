package strategy_pattern;

public class FlyRocketPowered implements FlyBehaivor {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
