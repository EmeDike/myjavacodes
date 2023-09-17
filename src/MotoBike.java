import org.junit.Test;

public class MotoBike {
    private boolean isOn;
    private int acceleration;
    private int currentSpeed;
    private int deceleration;
    private int gear;

    public void turnOn() {
    }

    public void turnOff() {
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void increaseSpeed1() {
        acceleration = 15;
        if (gear == 1 && acceleration == 15) {
            acceleration += 1;
        }
    }

    public int checkSpeed() {
        return acceleration;
    }

    public void increaseSpeed2() {
        acceleration = 24;
        if (gear == 2 && acceleration == 24) {
            acceleration += 2;

        }
    }

    public void increaseSpeed3() {
        acceleration = 35;
        if (gear == 3 && acceleration == 35) {
            acceleration = acceleration+3;


        }
    }

    public void increaseSpeed4() {
        acceleration = 44;
        if (gear == 4 && acceleration == 44) {
            acceleration += 4;

        }
    }
    public void decreaseSpeed1() {
        acceleration = 15;
        if (gear == 1 && acceleration == 15) {
            deceleration = acceleration - 1;
        }
    }
        public void decreaseSpeed2() {
            acceleration = 24;
            if (gear == 2 && acceleration == 24) {
                deceleration = acceleration - 2;
            }
        }

    public void decreaseSpeed3() {
        acceleration = 35;
        if (gear == 3 && acceleration == 35){
            deceleration = acceleration - 3;
            //deceleration = acceleration - 3
        }
    }

    public int checkdeceleration() {
        return deceleration;

    }
}