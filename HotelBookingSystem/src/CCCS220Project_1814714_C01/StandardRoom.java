package CCCS220Project_1814714_C01;

public class StandardRoom extends Room {

    private String BedType;
    private String view;

    public StandardRoom(int f, int n, double t, String v, String b) {
        super(f, n, t);
        this.BedType = b;
        this.view = v;
    }

    public String getBedType() {
        return this.BedType;
    }

    public void setBedType(String b) {
        this.BedType = b;
    }

    public void setView(String v) {
        this.view = v;
    }

   
    public String getView() {
        return this.view;
    }

    @Override
    public String toString() {
        return super.toString() + " This Room has a " + this.view+" view";
    }
}
