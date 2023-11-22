package parking;

import java.util.List;

public class ParkingLot {
    public List<Level> levels;

    public ParkingLot(List<Level> level){
        this.levels=level;
    }
    public boolean park(Car car){
        System.out.println("hey!");
        for(Level level:levels){
            
            if(level.park(car)){
                return true;
            }else{
                continue;
            }
        }
         return false;
    }

}
