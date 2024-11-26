package CCCS220Project_1814714_C01;

public class VIP extends Visitor {

    private int vip_Id;

    public VIP(int id, String name, String nation,String email, long ph, int vip) {
        super(id, name, email, nation, ph);
        this.vip_Id = vip;
    }

    public int getVib_Id() {
        return this.vip_Id;
    }

    public void Setvip_id(int num) {
        this.vip_Id = num;
    }

    @Override
    public String toString() {
        //This Visitor is a VIP  ID: 12134, Name: Ahmad_Alghamdi, Nationality: Saudi, Email: Ahmad@gmail.com, Phone: 505670077 VIPID: 155
        return "This Visitor is a VIP " + super.toString() + " VIPID: " + this.vip_Id;
    }
}
