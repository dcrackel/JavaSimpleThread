package Monsters.Runners;

import Monsters.LittleMonster;

public class ClientRunner {
    LittleMonster littleMonster = null;
    int x = 0;

    public void runner(LittleMonster littleMonster) {
        this.littleMonster = littleMonster;
        countUp();
    }

    public void countUp()
    {
        x++;
        System.out.println("The COUNT is: " + x);
        if (x > 10) {
            littleMonster.shutdown();
            System.out.println("shutdown!!");
        }
    }

}

