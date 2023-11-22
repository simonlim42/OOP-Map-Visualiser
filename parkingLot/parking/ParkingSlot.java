package parking;

public class ParkingSlot {
    private int row;
    private int col;
    private int level;
    private Car carInSlot;

    public ParkingSlot(int row,int col,int level){//coordinates of parking slot
        this.row=row;
        this.col=col;
        this.level=level;
    }

    public void occupySlot(Car car){
        this.carInSlot = car;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getLevel() {
        return level;
    }

    public Car getCarInSlot() {
        return carInSlot;
    }

    public void clearSlot() {
        this.carInSlot = null;
    }
}
