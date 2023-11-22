package parking;
import java.util.LinkedList;
import java.util.List;

public class Level {
    public int levelNum;
    public int rows;
    public final int SLOT_PER_ROW = 2;
    public List<ParkingSlot> takenSlots;

    public Level(int rows, int levelNum){
        this.levelNum = levelNum;
        this.rows = rows;
        this.takenSlots = new LinkedList<>();

    }
    private boolean isParkingFull() {
        int totalSlots = rows * SLOT_PER_ROW;
        return takenSlots.size() >= totalSlots;
    }
    private ParkingSlot getNextSlot(ParkingSlot lastOccupied) {
        if (lastOccupied.getCol() < SLOT_PER_ROW) {
            return new ParkingSlot(lastOccupied.getRow(), lastOccupied.getCol() + 1, levelNum);
        } else {
            return new ParkingSlot(lastOccupied.getRow() + 1, 0, levelNum);
        }
    }
    
    public ParkingSlot findAvailableSpot() {
        if (isParkingFull()) {
            return null;
        } else if (takenSlots.isEmpty()) {
            return new ParkingSlot(0, 0, levelNum);
        } else {
            ParkingSlot lastOccupied = takenSlots.get(takenSlots.size() - 1);
            return getNextSlot(lastOccupied);
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
