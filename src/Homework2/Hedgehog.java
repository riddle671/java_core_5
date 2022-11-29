package Homework2;

public class Hedgehog {
    int numberofneedles;
    int speed;

    public void setNumberofneedles(int numberofneedles) {
        this.numberofneedles = numberofneedles;
        System.out.print(speed + " Привет ");
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberofneedles() {
        return numberofneedles + 10;
    }

    public int getSpeed() {
        return speed;
    }

    public Hedgehog(int numberofneedles, int speed) {
        this.numberofneedles = numberofneedles;
        this.speed = speed;










    }
}
