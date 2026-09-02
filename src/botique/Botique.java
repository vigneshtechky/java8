package botique;

public class Botique {
    String name;
    String location;
    double fund;
    int year;
    boolean certified;


    //setter methods==> to set the data to the global variables
    public void setName(String clientname) {
        this.name = clientname;
    }

    public void setLocation(String clientLocation) {
        this.location = clientLocation;
    }

    public void setFund(double clientProfit) {
        this.fund = clientProfit;
    }

    public void setYear(int clinetYear) {
        this.year = clinetYear;
    }

    public void setCertified(boolean clientCertified) {
        this.certified = clientCertified;

    }




    //getter methods --> to return the global variables data
    public String getName() {
        return name;
    }
    public String getLocation(){
        return location;
    }
    public double getFund(){
        return fund;
    }
    public int getYear(){
        return year;
    }
    public boolean IsCertified(){
        return certified;
    }

    //method newStock
    public void newStock(String botiqueName) {
        String name = getName();
        System.out.println( name+ " providing new stock");
    }

    public void oldStock(String botiqueName) {
        String name = this.getName();
        System.out.println( name+ " closing old stock");
    }


}
