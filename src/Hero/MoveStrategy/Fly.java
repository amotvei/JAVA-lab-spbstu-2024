package Hero.MoveStrategy;

public class Fly implements Strategy {
    public void move(String from, String to){
        System.out.println("Герой HERO летит из: " + from + " в " + to);
    }
}
