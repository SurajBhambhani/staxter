package com.sb.staxter.task1;


/**
 * Player2 working who sends a message
 */
public class Player2 implements Runnable {
    Message m;
    String[] s2 = { "HI Goody", "I am good,And U ?", "ha haa", "Sure when", "No" ,"You have to", "I gott a play time", "lets go", "oh hello", "Come on" };

    public Player2(Message m2) {
        this.m = m2;
        new Thread(this, "Player 2").start();
    }

    public void run() {
        for (int i = 0; i < s2.length; i++) {
            m.fromPlayerTwo(s2[i]);
        }
    }
}