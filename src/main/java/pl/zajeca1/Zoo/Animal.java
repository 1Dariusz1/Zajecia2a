package pl.zajeca1.Zoo;

import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

abstract public class Animal {

    protected int weight;
    private int time;
    private LocalDateTime LastEatime;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        LocalDateTime tenDaysBeForeNow = LocalDateTime.now().minusDays(11);

        return true;
    }

    public void eat(){
        this.LastEatime = LocalDateTime.now();
//        now();
    }

    boolean isBefor () {

        return false;
    }


    public int getLastTime() {

        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
