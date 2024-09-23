package Lab_1;

import Lab_1.Hero.Hero;
import Lab_1.Hero.MoveStrategy.Strategy;
import Lab_1.Hero.MoveStrategy.HobbyHorsing;
import Lab_1.Hero.MoveStrategy.Fly;
import Lab_1.Hero.MoveStrategy.Walk;


public class Main {
    public static void main(String[] args){
        System.out.println("Hello world");
        Strategy horse = new HobbyHorsing();
        Strategy plane = new Fly();
        Strategy walked = new Walk();

        Hero hero = new Hero();

        hero.set(walked);
        hero.move("Дом", "Политх");

        hero.set(horse);
        hero.move("Конюшня", "Ипподрн");

        hero.set(plane);
        hero.move("МОСКВА", "САНКТ_ПЕТЕРБУРГ");

    }
}
