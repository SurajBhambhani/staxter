package com.sb.staxter.task1;

/**
 * Common message for sharing among players
 */
public class Message {
    boolean flag = false;

    public synchronized void fromPlayerOne(String msg) {
        if (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Sending Message to Player 2 :- "+msg);
        flag = true;
        notify();
    }

    public synchronized void fromPlayerTwo(String msg) {
        if (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Sending Message to Player 1 :- "+msg);
        flag = false;
        notify();
    }
}
