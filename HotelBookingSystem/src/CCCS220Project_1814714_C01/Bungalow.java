package CCCS220Project_1814714_C01;

public class Bungalow extends Room {

    private int NmuberOfRoom;
    private String outDoor;

    public Bungalow(int f, int n, double t, int nr, String d) {
        super(f, n, t);
        this.NmuberOfRoom = nr;
        this.outDoor = d;
    }

    public int getNmuberOfRoom() {
        return this.NmuberOfRoom;
    }

   
    public String getOutDoor() {
        return this.outDoor;
    }

    public void setNmuberOfRoom(int b) {
        this.NmuberOfRoom = b;
    }

    public void setView(String v) {
        this.outDoor = v;
    }

    @Override
    public String toString() {
        return super.toString() +"This Room is a Bungalow with a "+this.outDoor;
    }
}
