package Lab_1.Hero.MoveStrategy;

public class Walk implements Strategy {
    public void move(String from, String to)
    {
        System.out.println("Герой HERO идет из: " + from + " в " + to);
    }
}
