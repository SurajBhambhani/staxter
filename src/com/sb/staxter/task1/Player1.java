package com.sb.staxter.task1;

/**
 * Player1 working who sends a message
 */
public class Player1 implements Runnable {
    Message m;
    String[] s1 = { "Hello Suraj", "How are you ?", "I am also doing fine!", "Want to go out", "you suggest", "You Only", "I too have classes", "No","No","Ok" };

    public Player1(Message m1) {
        this.m = m1;
        new Thread(this, "Player 1").start();
    }

    public void run() {
        for (int i = 0; i < s1.length; i++) {
            m.fromPlayerOne(s1[i]);
        }
    }
}
