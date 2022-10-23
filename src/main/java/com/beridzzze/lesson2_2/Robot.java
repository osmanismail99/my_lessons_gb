package com.beridzzze.lesson2_2;

public class Robot implements Player {

    private final String model;
    private final int runLimit;
    private final int jumpLimit;
    private boolean play;

    public Robot(String model, int runLimit, int jumpLimit) {
        this.model = model;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = true;
    }

    @Override
    public void jump(Wall wall) {
        if (play) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.printf("Robot model %s preodolel prepyadstviye visotou %d", model, wall.getHeight());
                return;
            }
            System.out.printf("Robot model %s ne preodolel prepyadstviye visotou %d", model, wall.getHeight());
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
                System.out.printf("Robot model %s preodolel prepyadstviye dlinoy %d\n", model, track.getLength());
                return;
            }
            System.out.printf("Robot model %s ne preodolel prepyadstviye dlinoy %d\n", model, track.getLength());
            play = false;
        }
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                '}';
    }
}
