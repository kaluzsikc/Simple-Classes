import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before(){
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void canDrink(){
        assertEquals(90, waterbottle.getDrink());
    }

    @Test
    public void canEmpty(){
        assertEquals(0, waterbottle.getEmpty());
    }

    @Test
    public void canFill(){
        assertEquals(100, waterbottle.getFill());
    }
}
