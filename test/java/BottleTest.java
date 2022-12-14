import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    Bottle bottle;

    @Before
    public void before(){bottle = new Bottle(100);}

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canTakeSip(){
        bottle.drink();
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void canEmpty(){
        bottle.empty();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void canRefill(){
        bottle.drink();
        bottle.refill();
        assertEquals(100, bottle.getVolume());
    }

}
