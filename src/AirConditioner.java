public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void turnOn() {
        this.isOn = true; // Corrected here
    }

    public boolean isTurnedOn() {
        return isOn; // Corrected here
    }

    public boolean isTurnedOff() { // Corrected the method name (camelCase)
        return !isOn; // Corrected here
    }

    public void turnOff() {
        this.isOn = false; // Corrected here
    }

    public void increaseTemperature() {
        temperature = 20;
        if (temperature < 30) {
            temperature += 1;
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public boolean IsTurnedOff() {
        return false;
    }

    public void decreaseTemperature() {
        temperature = 20;
        if (temperature > 20);
        temperature = temperature - 1;
    }

    public void keepTemp30() {
        temperature = 30;
        if (temperature > 30);
        temperature = temperature;
    }

    public void keepTemp16() {
        temperature = 16;
        if (temperature > 16)
            temperature = temperature;
    }
}
