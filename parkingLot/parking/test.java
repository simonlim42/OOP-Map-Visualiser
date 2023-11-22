package parking;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class test {

    @Test
    public void test1(){
        List<Level> levels = List.of(new Level(2,0), new Level(2,1));

        ParkingLot parkingLot = new ParkingLot(levels);

        assertTrue(parkingLot.park(new Car("2DZB223")));
        assertTrue(parkingLot.park(new Car("CLD6158")));
        assertTrue(parkingLot.park(new Car("8DQW449")));
        assertTrue(parkingLot.park(new Car("SC46695")));

        assertTrue(parkingLot.park(new Car("2DZB223")));
        assertTrue(parkingLot.park(new Car("CLD6158")));
        assertTrue(parkingLot.park(new Car("8DQW449")));
        assertTrue(parkingLot.park(new Car("SC46695")));

        assertFalse(parkingLot.park(new Car("SC46695")));

    }
}