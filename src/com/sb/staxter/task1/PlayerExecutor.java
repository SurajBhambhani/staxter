package com.sb.staxter.task1;

/**
 * Main class who executes the player communication.
 */
public class PlayerExecutor {
    public static void main(String[] args) {
        Message m = new Message();
        new Player1(m);
        new Player2(m);
    }
}




