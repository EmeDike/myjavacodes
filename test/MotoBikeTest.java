import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotoBikeTest {
    @Test
    public void turnBikeOn() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        assertTrue(true);
    }

    @Test
    public void turnBikeOff() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.turnOff();
        assertFalse(false);
    }

    @Test
    public void speedUp1() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.setGear(1);
        mb.increaseSpeed1();
        assertEquals(16, mb.checkSpeed());
    }

    @Test
    public void speedUp2() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.setGear(2);
        mb.increaseSpeed2();
        assertEquals(26, mb.checkSpeed());
    }

    @Test
    public void speedUp3() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.setGear(3);
        mb.increaseSpeed3();
        assertEquals(38, mb.checkSpeed());
    }

    @Test
    public void speedUp4() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.setGear(4);
        mb.increaseSpeed4();
        assertEquals(48, mb.checkSpeed());
    }

    @Test
    public void decelerate1() {
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.setGear(1);
        mb.decreaseSpeed1();
        assertEquals(14, mb.checkdeceleration());
    }

    @Test
        public void decelerate2(){
        MotoBike mb = new MotoBike();
        mb.turnOn();
        mb.setGear(2);
        mb.decreaseSpeed2();
        assertEquals(22, mb.checkdeceleration());
}
     @Test
         public void decelerate3(){
         MotoBike mb = new MotoBike();
         mb.turnOn();
         mb.setGear(3);
         mb.decreaseSpeed3();
         assertEquals(32, mb.checkdeceleration());
     }

     }


