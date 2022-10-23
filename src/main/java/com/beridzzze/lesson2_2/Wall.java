package com.beridzzze.lesson2_2;

public class Wall implements Barrier {

    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Player player) {
        player.jump(this);
    }
}
