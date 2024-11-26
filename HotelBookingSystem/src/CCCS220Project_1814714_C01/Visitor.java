
package CCCS220Project_1814714_C01;

public class Visitor {
    protected int ID;
    protected String name;
    protected String Email;
    protected String Nationality;
    protected long phone;
    
    public Visitor(int id,String name,String nation,String email,long ph){
        this.Email=email;
        this.ID=id;
        this.Nationality=nation;
        this.name=name;
        this.phone=ph;
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String Nationality) {
        this.Nationality = Nationality;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
   
    @Override
    public String toString(){
    //  ID: 14449Omar_OmarSaudiOmarO@gmail.com567488899  
        return " ID: "+this.ID+", Name: "+this.name+", Nationality: "+this.Nationality+", Email: "+this.Email+", Phone: "+this.phone;
    }
}
