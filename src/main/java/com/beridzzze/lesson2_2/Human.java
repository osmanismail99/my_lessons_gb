package com.beridzzze.lesson2_2;

public class Human implements Player {

    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean play;

    public Human(String name, int runLimit, int jumpLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = true;
    }

    @Override
    public void jump(Wall wall) {
        if (play) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.printf("Celovek po imeni %s preodolel prepyadstviye visotou %d\n", name, wall.getHeight());
                return;
            }
            System.out.printf("Celovek po imeni %s ne preodolel prepyadstviye visotou %d\n", name, wall.getHeight());
            play = false;
        }
    }

    @Override
    public boolean isPlay() {
        return play;
    }

    @Override
    public void run(Track track) {
        if (play) {
            if (runLimit >= track.getLength()) {
                System.out.printf("Celovek po imeni %s preodolel prepyadstviye dlinoy %d\n", name, track.getLength());
                return;
            }
            System.out.printf("Celovek po imeni %s ne preodolel prepyadstviye dlinoy %d\n", name, track.getLength());
            play = false;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
