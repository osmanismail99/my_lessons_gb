package com.beridzzze.lesson2_2;

public class Track implements Barrier {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void overcome(Player player) {
        player.run(this);
    }
}
