package CCCS220Project_1814714_C01;

public class Service {
    
    private double priceS;
    private String TypeS;
   
    public Service(String s, double p) {
        this.priceS = p;
        this.TypeS = s;
    }
    
    public double getServicePrise() {
        return this.priceS;
    }
    public String getServiceType(){
        return this.TypeS;
    }
    public void setServicePrice(double n){
        this.priceS=n;
    }
    public void setServiceType(String s){
        this.TypeS=s;
    }
    @Override
    public String toString(){
        return" Ask for Service: "+this.TypeS;
    }
}
