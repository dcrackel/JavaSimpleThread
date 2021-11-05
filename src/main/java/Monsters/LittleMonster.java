package Monsters;

import Monsters.Runners.ClientRunner;

public class LittleMonster extends Thread {
    Thread thread = null;
    ClientRunner clientRunner = new ClientRunner();

    public void shutdown(){
        thread.interrupt();
    }

    public void run() {
        System.out.println("Starting thread...");
        clientRunner.runner(this);

        while(!thread.isInterrupted()){
            clientRunner.countUp();
            System.out.println("inside thread");
        }
        System.out.println("Thread has stopped");
    }

    public static void main(String args[])
    {
        LittleMonster littleMonster = new LittleMonster();
        littleMonster.thread = new Thread(littleMonster);
        littleMonster.start();
        System.out.println("This code is outside of the thread");
    }

}