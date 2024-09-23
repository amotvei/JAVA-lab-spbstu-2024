package Hero;
import Hero.MoveStrategy.Strategy;
public class Hero {
    private Strategy strategy;

    // конструктор
    public Hero(){
        this.strategy = null;
    }

    public void set(Strategy strategy){
        this.strategy = strategy;
    }
    public void move(String from, String to){
        if (strategy == null)
        {
            System.out.println("No move!");
            return;
        }
        strategy.move(from, to);
    }
}

