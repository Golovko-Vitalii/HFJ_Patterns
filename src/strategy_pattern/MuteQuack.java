package strategy_pattern;

public class MuteQuack implements QuackBehaivor {
    public void quack(){
        System.out.println("<< Silence >>");
    }
}
