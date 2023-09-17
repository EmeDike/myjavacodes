import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test
    public void turnOnAirConditioner(){
        AirConditioner cherish = new AirConditioner();
        cherish.turnOn();
        assertTrue(cherish.isTurnedOn());

    }
    @Test
    public void turnOffAirConditioner(){
        AirConditioner cherish = new AirConditioner();
        cherish.turnOn();
        cherish.turnOff();
        assertFalse(cherish.IsTurnedOff());
    }
    @Test
    public void increaseTemperature(){
        AirConditioner cherish = new AirConditioner();
        cherish.turnOn();
        cherish.increaseTemperature();
        assertEquals(21, cherish.getTemperature());

    }
    @Test
    public void decreaseTemperature(){
        AirConditioner cherish = new AirConditioner();
        cherish.turnOn();
        cherish.decreaseTemperature();
        assertEquals(19, cherish.getTemperature());
    }
    @Test
    public void keepTempe30(){
        AirConditioner cherish = new AirConditioner();
        cherish.turnOn();
        cherish.keepTemp30();
        assertEquals(30, cherish.getTemperature());

    }
    @Test
    public void keepTemp16(){
        AirConditioner cherish = new AirConditioner();
        cherish.turnOn();
        cherish.keepTemp16();
        assertEquals(16, cherish.getTemperature());


    }



}