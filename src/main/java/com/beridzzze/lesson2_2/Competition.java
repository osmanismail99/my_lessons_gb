package com.beridzzze.lesson2_2;

public class Competition {

    public static void main(String[] args) {
        Competition competition = new Competition();
        competition.play();

    }

    void play() {
        Player[] players = {
                new Human("Gadya Petrovich Hrenova", 10, 3),
                new Human("Ivan Ivanovich Ivanov", 12, 4),
                new Robot("R2D2", 15, 1),
                new Cat("Murzik", 3, 6)
        };

        Barrier[] course = {
                new Track(2),
                new Wall(1),
                new Track(5),
                new Wall(3),
                new Wall(4)
        };

        for (Barrier barrier : course) {
            for (Player player : players){
                barrier.overcome(player);
            }
        }

        for (Player player : players) {
            if(player.isPlay()){
                System.out.println(player);
            }
        }

    }


}
