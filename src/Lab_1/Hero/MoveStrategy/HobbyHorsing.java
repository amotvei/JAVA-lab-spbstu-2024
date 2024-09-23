package Lab_1.Hero.MoveStrategy;

public class HobbyHorsing implements Strategy {
    public void move(String from, String to)
    {
        System.out.println("Герой HERO едет на лошади из: " + from + " в " + to);

    }

}
