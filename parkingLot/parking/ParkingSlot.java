package parking;

public class ParkingSlot {
    public int row;
    public int col;
    public int level;
    public Car carInSlot;

    public ParkingSlot(int row,int col,int level){//coordinates of parking slot
        this.row=row;
        this.col=col;
        this.level=level;
    }

    public void occupySlot(Car car){
        this.carInSlot = car;
    }
}
