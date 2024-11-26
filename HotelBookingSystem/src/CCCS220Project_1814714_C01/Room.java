package CCCS220Project_1814714_C01;

import java.util.*;

public class Room {
   
    protected int floor;
    protected int room_number;
    protected double price;
    protected ArrayList<Booking> reserved=new ArrayList<>();//booking(Visitor v,Room r,Date in,Date out)

    public Room(int f, int n, double t) {
        this.floor = f;
        this.price = t;
        this.room_number = n;
    }

    //mathod  

    public void setFloor(int f) {
        this.floor = f;
    }

    public void SetRoomNumber(int n) {
        this.room_number = n;
    }

    public void setNightPrice(double t) {
        this.price = t;
    }

    public int GetFloor() {
        return floor;
    }

    public int GetRoomNumber() {
        return room_number;
    }

    public double GetNightPrice() {
        return price;
    }

    public ArrayList<Booking> GetroomBooking() {
        return reserved;
    }

    public ArrayList<Booking> Getreserve() {
        
        return reserved;
    }

    public void Reserve(Booking b) {
        reserved.add(b);
    }

    public void CancelReservatoin(Booking b) {
        reserved.remove(b);
    }
   

    @Override
    public String toString() {
      
        return "Room number: "+this.room_number +", Floor: "+this.floor;
    }

}
