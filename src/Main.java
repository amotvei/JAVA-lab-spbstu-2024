import Hero.Hero;
import Hero.MoveStrategy.Strategy;
import Hero.MoveStrategy.HobbyHorsing;
import Hero.MoveStrategy.Fly;
import Hero.MoveStrategy.Walk;


public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        Strategy horse = new HobbyHorsing();
        Strategy plane = new Fly();
        Strategy walked = new Walk();

        Hero hero = new Hero();

        hero.set(walked);
        hero.move("Дом", "Политех");

        hero.set(horse);
        hero.move("Конюшня", "Ипподрон");

        hero.set(plane);
        hero.move("МОСКВА", "САНКТ_ПЕТЕРБУРГ");

    }
}
