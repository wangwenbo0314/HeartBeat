package com.example.administrator.heartbeat;

/**
 * Created by Administrator on 2017/5/8 0008.
 */

public class Personage {
    private int heartImageId;
    private int heartViewId;
    private int heartNumber;

    public Personage(int heartImageId, int heartViewId, int heartNumber) {
        this.heartImageId = heartImageId;
        this.heartViewId = heartViewId;
        this.heartNumber = heartNumber;
    }

    public int getHeartImageId() {
        return heartImageId;
    }

    public int getHeartViewId() {
        return heartViewId;
    }

    public int getHeartNumber() {
        return heartNumber;
    }
}
