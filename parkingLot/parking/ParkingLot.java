package parking;

import java.util.List;

public class ParkingLot {
    private List<Level> levels;

    public ParkingLot(List<Level> levels) {
        this.levels = levels;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public boolean park(Car car){
        if (levels == null) {
            throw new IllegalArgumentException("Levels cannot be null");
        }
    
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
