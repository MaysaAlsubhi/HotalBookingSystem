package CCCS220Project_1814714_C01;

import java.util.*;

public class Booking {
        
    private String bookingID="";
    private Visitor guest;
    private Room guestRoom;
    private Date chack_in;
    private Date chack_out;
    private ArrayList<Service> guestService=new ArrayList<>();
   
    public Booking(Visitor v, Room r, Date in, Date out) {
        Random random=new Random();
        this.chack_in = in;
        this.chack_out = out;
        this.guest = v;
        this.guestRoom = r;
        
        //new Booking reference number as follow:Visitor First Letter + Visitor Id+ Random value (between 0 and 999). Example :S 11167 260
        this.bookingID += v.getName().charAt(0)+""+ v.getID()+""+ random.nextInt(1000);
    }

    //mathod
    public void setVisitor(Visitor v) {
        this.guest = v;
    }

    public Visitor getVisitor() {
        return this.guest;
    }

    public void setRoom(Visitor v) {
        this.guest = v;
    }

    public Room getRoom() {
        return this.guestRoom;
    }

    public String guestNumber() {
        return this.bookingID;
    }
    public void setguestNumber(String s) {
        this.bookingID=s;
    }

    public ArrayList<Service> getServiceOfVisitor() {
        return this.guestService;
    }

    public void AddServiceVisitor(Service s) {
//followed by 1 integer [Visitor ID] and 1 string [Service type]
    this.guestService.add(s);
    }

    public void setChackIn(Date in) {
        this.chack_in = in;
    }

    public Date getChackIn() {
        return this.chack_in;
    }

    public void setChackOut(Date out) {
        this.chack_out = out;
    }

    public Date getChackOut() {
        return this.chack_out;
    }

    @Override
    public String toString() {
     //Command Add service:\n \n The Guest:Sameer_Maghrabi in Room/Bungalow: 102 floor: 10 .tostring

        return  "\n******Booking Refrence number : "+this.bookingID
                +" ******Guest information : + "+this.guest.toString()+" ******Check in Day : "+this.chack_in.getDate()
                +" Month : "+this.chack_in.getMonth()+" Year : "+this.chack_in.getYear()+" Check out Day : "+this.chack_out.getDate()
                +" Month : "+this.chack_out.getMonth()+" Year : "+this.chack_in.getYear()+" ******Room information :  "+this.guestRoom.toString()+"\n";
    }

    
}
