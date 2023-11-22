package parking;
import java.util.LinkedList;
import java.util.List;

public class Level {
    public int levelNum;
    public int rows;
    public int SLOT_PER_ROW = 2;
    public List<ParkingSlot> takenSlots;

    public Level(int rows, int levelNum){
        this.levelNum = levelNum;
        this.rows = rows;
        this.takenSlots = new LinkedList<>();

    }
    public ParkingSlot findAvailableSpot(){ //checks if parking is available
        int totalSlots= rows*SLOT_PER_ROW;
        if(takenSlots.size()>=totalSlots){//parking full
            return null;
        }else if (takenSlots.isEmpty()){
            return new ParkingSlot(0,0,levelNum);
        }else{
            ParkingSlot lastOccupied = takenSlots.get(takenSlots.size()-1);
            if(lastOccupied.col<SLOT_PER_ROW){
                return new ParkingSlot(lastOccupied.row, lastOccupied.col+1, levelNum);
            }else{
                return new ParkingSlot(lastOccupied.row+1, 0, levelNum);
            }
        }
    }
    
    public boolean park(Car car){//method to add car to the free space
        ParkingSlot freeSpace = findAvailableSpot();
        if(freeSpace==null){
            return false;
        }else{
            freeSpace.occupySlot(car);
            takenSlots.add(freeSpace);
            return true;
        }
    }

}
