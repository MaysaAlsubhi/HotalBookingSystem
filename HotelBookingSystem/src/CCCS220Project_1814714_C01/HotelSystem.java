
// [ctrl b] TO RUN
//(pwd) where the file saved?
//help(...)

import java.util.*;
import java.io.*;
//CCCS220Project_1814714_C01

public class HotelSystem {

    /*CLASS
        1-Room(int f , int n ,double t)+Room(String ty, int f, int n, double t)
        2-StandardRoom(int f, int n, double t,String b,String v)          
        3-Bungalow(int f, int n, double t,int nr,String d)           
        4-Booking(Visitor v,Room r,Date in,Date out)
        5-Service(String s, int p)
        6-Visitor(int id,String name,String nation,String email,long ph)
        7-VIP(int id, String name, String nation,String email, long ph,int vip)
     */
    public static void main(String[] arge) throws Exception {

        ArrayList<File> fileGust = new ArrayList<File>();
        ArrayList<Room> RoomGust = new ArrayList<>();
        ArrayList<Service> service = new ArrayList<Service>();
        ArrayList<Booking> booking = new ArrayList<Booking>();
        //_______________________________________________________________________________________        
        fileGust.add(new File("C:\\Users\\Masya\\Documents\\NetBeansProjects\\HotelBookingSystem\\src"
                + "\\CCCS220Project_1814714_C01\\inputRoom.txt"));//0

        fileGust.add(new File("C:\\Users\\Masya\\Documents\\NetBeansProjects\\HotelBookingSystem\\src"
                + "\\CCCS220Project_1814714_C01\\inputprocedure.txt"));//1

        fileGust.add(new File("C:\\Users\\Masya\\Documents\\NetBeansProjects\\HotelBookingSystem\\src"
                + "\\CCCS220Project_1814714_C01\\BookingStatus.txt"));//2

        if (fileGust.get(0).exists()) {
            System.out.println("the File " + fileGust.get(0).getName() + " are exist.");
        } else {
            System.out.println("the File " + fileGust.get(0).getName() + " are does not exist.");
        }
        if (fileGust.get(1).exists()) {
            System.out.println("the File " + fileGust.get(1).getName() + " are exist.");
        } else {
            System.out.println("the File " + fileGust.get(1).getName() + " are does not exist.");
        }
        if (fileGust.get(2).exists()) {
            System.out.println("the File " + fileGust.get(2).getName() + " are exist.");
        } else {
            System.out.println("the File " + fileGust.get(2).getName() + " are does not exist.");
        }
//____________________________________________________________________________________________         
        PrintWriter out;
        Scanner in2;
        try (Scanner in = new Scanner(fileGust.get(0))) {
            in2 = new Scanner(fileGust.get(1));
            out = new PrintWriter(fileGust.get(2));

            do {
                String[] word = in.nextLine().trim().split("\\s");
                if (word[0].matches("AddRoom")) {
                    RoomGust.add(AddRoom(Integer.parseInt(word[1]), Integer.parseInt(word[2]),
                            Integer.parseInt(word[3]), word[4], word[5]));

                } else if (word[0].matches("AddBungalo")) {
                    RoomGust.add(AddBungalow(Integer.parseInt(word[1]), Integer.parseInt(word[2]),
                            Double.parseDouble(word[3]), Integer.parseInt(word[4]), word[5]));

                } else if (word[0].matches("AddService")) {
                    service.add(AddService(word[1], Double.parseDouble(word[2])));

                }//else               
            } while (in.hasNextLine());//while loop1
            in.close();
            //______________________________________________________________________________________________

            out.print("--------------- Welcome to CS Hotel Management System ---------------"
                    + "\n--------------- Display All System Procedures ---------------\n");
            do {
                String[] word2 = in2.nextLine().trim().split("\\s");
                //Reserve//0 StandardRoom//1 King//2 city//3 2016/4 11/5 11/6 2016/7 11/8 16/9 V/10 10167/11 
                //Ahmad_Ali//12 Saudi//13 ali@gmail.com//14 0505676677//15 145//16
                if (word2[0].matches("Reserve")) {
                    if (word2[1].matches("StandardRoom")) {
                        if (word2[10].matches("V")) {
                            booking.add(new Booking(new VIP(Integer.parseInt(word2[11]), word2[12], word2[13], word2[14],
                                    Long.parseLong(word2[15]), Integer.parseInt(word2[16])),
                                    new StandardRoom(0, 0, 0, word2[3], word2[2]),
                                    (new Date(Integer.parseInt(word2[4]),
                                            Integer.parseInt(word2[5]),
                                            Integer.parseInt(word2[6]))),//chak_in
                                    (new Date(Integer.parseInt(word2[7]),
                                            Integer.parseInt(word2[8]),
                                            Integer.parseInt(word2[9])))));//chack_out

                        } else {
                            booking.add(new Booking(new Visitor(Integer.parseInt(word2[11]), word2[12], word2[13], word2[14],
                                    Long.parseLong(word2[15])),
                                    new StandardRoom(0, 0, 0, word2[3], word2[2]),
                                    (new Date(Integer.parseInt(word2[4]),
                                            Integer.parseInt(word2[5]),
                                            Integer.parseInt(word2[6]))),//chak_in
                                    (new Date(Integer.parseInt(word2[7]),
                                            Integer.parseInt(word2[8]),
                                            Integer.parseInt(word2[9])))));//chack_out

                        }
                    } else if (word2[1].matches("Bungalow")) {
                        if (word2[10].matches("V")) {
                            booking.add(new Booking(new VIP(Integer.parseInt(word2[11]), word2[12], word2[13], word2[14],
                                    Long.parseLong(word2[15]), Integer.parseInt(word2[16])),
                                    new Bungalow(0, 0, 0, Integer.parseInt(word2[2]), word2[3]),
                                    (new Date(Integer.parseInt(word2[4]),
                                            Integer.parseInt(word2[5]),
                                            Integer.parseInt(word2[6]))),//chak_in
                                    (new Date(Integer.parseInt(word2[7]),
                                            Integer.parseInt(word2[8]),
                                            Integer.parseInt(word2[9])))));//chack_out
                        } else {
                            booking.add(new Booking(new Visitor(Integer.parseInt(word2[11]), word2[12], word2[13], word2[14],
                                    Long.parseLong(word2[15])),
                                    new Bungalow(0, 0, 0, Integer.parseInt(word2[2]), word2[3]),
                                    (new Date(Integer.parseInt(word2[4]),
                                            Integer.parseInt(word2[5]),
                                            Integer.parseInt(word2[6]))),//chak_in
                                    (new Date(Integer.parseInt(word2[7]),
                                            Integer.parseInt(word2[8]),
                                            Integer.parseInt(word2[9])))));//chack_out
                        }
                    }//else bunglow
                    //_________________________________________________________________________________________

                } else if (word2[0].matches("Service")) {
                    //Id +type//Booking AddService(service)
                    for (int v = 0; v < booking.size(); v++) {
                        for (int s = 0; s < service.size(); s++) {
                            if (booking.get(v).getVisitor().getID() == Integer.parseInt(word2[1])) {
                                if (word2[2].equals(service.get(s).getServiceType())) {
                                    booking.get(v).AddServiceVisitor(new Service(word2[2], service.get(s).getServicePrise()));

                                }
                            }
                        }
                    }
                }
            } while (in2.hasNextLine());
            in2.close();
            //______________________________________________________________________________________________________

            for (int b = 0; b < booking.size(); b++) {
                for (int r = 0; r != RoomGust.size() - 1; r++) {
                    if (booking.get(b).getRoom() instanceof StandardRoom && RoomGust.get(r) instanceof StandardRoom) {

                        if (((StandardRoom) booking.get(b).getRoom()).getView().equalsIgnoreCase(((StandardRoom) RoomGust.get(r)).getView())) {
                            if (((StandardRoom) booking.get(b).getRoom()).getBedType().equalsIgnoreCase(((StandardRoom) RoomGust.get(r)).getBedType())) {

                                if (RoomGust.get(r).GetroomBooking().isEmpty()) {
                                    ((StandardRoom) booking.get(b).getRoom()).setFloor(RoomGust.get(r).GetFloor());
                                    ((StandardRoom) booking.get(b).getRoom()).setNightPrice(RoomGust.get(r).GetNightPrice());
                                    ((StandardRoom) booking.get(b).getRoom()).SetRoomNumber(RoomGust.get(r).GetRoomNumber());
                                    out.print("\nCommand BOOKING: Reserve a StandardRoom " + booking.get(b).toString());
                                    RoomGust.get(r).Reserve(booking.get(b));

                                    break;
                                } else {
                                    for (int re = 0; re < RoomGust.get(r).GetroomBooking().size(); re++) {
                                        if (booking.get(b).getChackIn().equals(RoomGust.get(r).GetroomBooking().get(re).getChackIn())
                                                && booking.get(b).getChackOut().equals(RoomGust.get(r).GetroomBooking().get(re).getChackOut())
                                                && ((StandardRoom) booking.get(b).getRoom()).getView().equals(((StandardRoom) RoomGust.get(r).GetroomBooking().get(re).getRoom()).getView())
                                                && ((StandardRoom) booking.get(b).getRoom()).getBedType().equals(((StandardRoom) RoomGust.get(r).GetroomBooking().get(re).getRoom()).getBedType())
                                                && !(booking.get(b).getVisitor().getName().equalsIgnoreCase(RoomGust.get(r).GetroomBooking().get(re).getVisitor().getName()))) {

                                            out.println("\nCommand BOOKING: CONFLICT\n Sorry ! There is no available Stand room\n"
                                                    + " From Day : " + booking.get(b).getChackIn().getDate()
                                                    + " Month : " + booking.get(b).getChackIn().getMonth()
                                                    + " Year : " + booking.get(b).getChackIn().getYear()
                                                    + " To Day : " + booking.get(b).getChackOut().getDate()
                                                    + " Month : " + booking.get(b).getChackOut().getMonth()
                                                    + " Year : " + booking.get(b).getChackOut().getYear());
                                            break;
                                        }

                                    }//loop re
                                }//empty
                            }
                        }

                    } else if (booking.get(b).getRoom() instanceof Bungalow && RoomGust.get(r) instanceof Bungalow) {

                        if (((Bungalow) booking.get(b).getRoom()).getOutDoor().equalsIgnoreCase(((Bungalow) RoomGust.get(r)).getOutDoor())) {
                            if ((((Bungalow) RoomGust.get(r)).getNmuberOfRoom()) == ((Bungalow) booking.get(b).getRoom()).getNmuberOfRoom()) {
                                if (RoomGust.get(r).GetroomBooking().isEmpty()) {
                                    ((Bungalow) booking.get(b).getRoom()).setFloor(RoomGust.get(r).GetFloor());
                                    ((Bungalow) booking.get(b).getRoom()).setNightPrice(RoomGust.get(r).GetNightPrice());
                                    ((Bungalow) booking.get(b).getRoom()).SetRoomNumber(RoomGust.get(r).GetRoomNumber());
                                    out.print("\nCommand BOOKING: Reserve a Bungalow " + booking.get(b).toString());
                                    RoomGust.get(r).Reserve(booking.get(b));
                                    break;
                                } else {
                                    for (int re = 0; re < RoomGust.get(r).GetroomBooking().size(); re++) {
                                        if (booking.get(b).getChackIn().equals(RoomGust.get(r).GetroomBooking().get(re).getChackIn())
                                                && booking.get(b).getChackOut().equals(RoomGust.get(r).GetroomBooking().get(re).getChackOut())
                                                && ((Bungalow) booking.get(b).getRoom()).getNmuberOfRoom() == ((Bungalow) RoomGust.get(r).GetroomBooking().get(re).getRoom()).getNmuberOfRoom()
                                                && ((Bungalow) booking.get(b).getRoom()).getOutDoor().equals(((Bungalow) RoomGust.get(r).GetroomBooking().get(re).getRoom()).getOutDoor())
                                                && !(booking.get(b).getVisitor().getName().equalsIgnoreCase(RoomGust.get(r).GetroomBooking().get(re).getVisitor().getName()))) {

                                            out.println("\nCommand BOOKING: CONFLICT\n Sorry ! There is no available Bungalow\n"
                                                    + " From Day : " + booking.get(b).getChackIn().getDate()
                                                    + " Month : " + booking.get(b).getChackIn().getMonth()
                                                    + " Year : " + booking.get(b).getChackIn().getYear()
                                                    + " To Day : " + booking.get(b).getChackOut().getDate()
                                                    + " Month : " + booking.get(b).getChackOut().getMonth()
                                                    + " Year : " + booking.get(b).getChackOut().getYear());

                                            break;
                                        }
                                    }//loop re
                                }//empty  

                            }
                        }
                    }
                }//loop b
            }//loop r

            for (int ve = 0; ve < booking.size(); ve++) {
                for (int i = 0; i < booking.get(ve).getServiceOfVisitor().size(); i++) {
                    if (booking.get(ve).getRoom() instanceof StandardRoom) {
                        out.println("\nCommand Add service:\n\n The Guest:" + booking.get(ve).getVisitor().getName()
                                + " in Room/" + "StandardRoom: " + booking.get(ve).getRoom().GetRoomNumber() + " floor: " + booking.get(ve).getRoom().GetFloor()
                                + " Ask for Service: " + booking.get(ve).getServiceOfVisitor().get(ve).getServiceType() + "\n");
                    } else if (booking.get(ve).getRoom() instanceof Bungalow) {
                        out.println("\nCommand Add service:\n\n The Guest:" + booking.get(ve).getVisitor().getName()
                                + " in Room/" + "Bungalow: " + booking.get(ve).getRoom().GetRoomNumber() + " floor: " + booking.get(ve).getRoom().GetFloor()
                                + " Ask for Service: " + booking.get(ve).getServiceOfVisitor().get(ve).getServiceType() + "\n");
                    }
                }
            }

            out.close();

            File all = new File("C:\\Users\\Masya\\Documents\\NetBeansProjects\\HotelBookingSystem"
                    + "\\src\\CCCS220Project_1814714_C01\\AllInvoiceForAllGuests");
            if (all.exists()) {

                for (int ind = 0; ind < booking.size(); ind++) {
                    Print_Invoice(booking.get(ind), all);
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//end main
    //_________________________________________________________________________________________

    //mahtod For the main
    public static StandardRoom AddRoom(int n1, int n2, int n3, String s1, String s2) {
        return new StandardRoom(n1, n2, n3, s1, s2);
    }

    public static Bungalow AddBungalow(int n1, int n2, double n3, int n4, String s1) {
        return new Bungalow(n1, n2, n3, n4, s1);
    }

    //
    public static Service AddService(String str, double num) {
        return new Service(str, num);
    }

    //arraylist of booking and printwrite??
    public static void Print_Invoice(Booking booking, File f) throws FileNotFoundException {
        try {
            String listService = "";

            String gestBill = "" + (booking.getVisitor().name.charAt(0) + "" + booking.getVisitor().name.charAt(1)
                    + "" + booking.getVisitor().ID)
                    + "_Guest_Invoice.txt";

            File gust = (new File(f, gestBill));
            PrintWriter out_file = new PrintWriter(gust);

            double night = booking.getChackIn().getDate() - booking.getChackOut().getDate();
            double nights = booking.getRoom().GetNightPrice() * night;
            double total = nights;

            for (int i = 0; i < booking.getServiceOfVisitor().size(); i++) {
                total += booking.getServiceOfVisitor().get(i).getServicePrise();
                listService += "\n" + booking.getServiceOfVisitor().get(i).getServiceType()
                        + " : " + booking.getServiceOfVisitor().get(i).getServicePrise();
            }//loop
            
            if (booking.getRoom() instanceof Bungalow) {
                out_file.print("--------------- Welcome to CS Hotel Management System ---------------"
                        + "\n--------- Current Date :  " + new Date(119, 1, 1, 23, 55, 33).toString() + "--------"
                        + "\nCommand: Print_Invoice"
                        + "\n Guest name : " + booking.getVisitor().name
                        + "\n Guest ID : " + booking.getVisitor().ID
                        + "\n Guest Bangalow # : " + booking.getRoom().GetRoomNumber() + " with a "
                        + ((Bungalow) booking.getRoom()).getOutDoor()
                        + "\n Check in date : " + booking.getChackIn().getDate() + "/"
                        + booking.getChackIn().getMonth() + "/" + booking.getChackIn().getYear()
                        + "\n Number of nights : " + night
                        + "\n"
                        + "\n--------------- Invoice Details ---------------"
                        + "\n Room Price in " + night + " nights : " + nights
                        + "\n Services:\n" + listService
                        + "------------------------------\nTotal : " + (total) + "");

            } else if (booking.getRoom() instanceof StandardRoom) {
                out_file.print("--------------- Welcome to CS Hotel Management System ---------------"
                        + "\n--------- Current Date :  " + new Date(119, 1, 1, 23, 55, 33).toString() + "--------"
                        + "\nCommand: Print_Invoice"
                        + "\n Guest name : " + booking.getVisitor().name
                        + "\n Guest ID : " + booking.getVisitor().ID
                        + "\n Guest Room # : " + booking.getRoom().GetRoomNumber()
                        + " in Floor : " + booking.getRoom().floor + " view : " + ((StandardRoom) booking.getRoom()).getView()
                        + "\n Check in date : " + booking.getChackIn().getDate() + "/"
                        + booking.getChackIn().getMonth() + "/" + booking.getChackIn().getYear()
                        + "\n Number of nights : " + night
                        + "\n"
                        + "\n--------------- Invoice Details ---------------"
                        + "\n Room Price in " + night + " nights : " + nights
                        + "\n Services:\n" + listService
                        + "------------------------------\nTotal : " + total + "");
            }
            if (booking.getVisitor() instanceof VIP) {
                out_file.print("\n------------------------------" + "\nYou are a VIP"
                        + "\nTotal after 20% discount: " + (total - (total * 20 / 100)) + "");
            }
            //return gust;
        } catch (FileNotFoundException e) {

        }

    }//end mathod

}//class
