package botique;

public class AshokBotique {
    public static void main(String[] args) {
        System.out.println("botique");
        Botique ashok = new Botique();

        String name = "AshokBotique";
        int year = 2000;
        String location = "HYD";
        boolean certified = true;
        long fund = 200000;

        ashok.setName(name);
        ashok.setYear(year);
        ashok.setLocation(location);
        ashok.setFund(fund);
        ashok.setCertified(certified);
        ashok.newStock(name);

        String clientName = ashok.getName();
        System.out.println("client Name:" + clientName);
        int clientyear = ashok.getYear();
        System.out.println("client year:" + clientyear);
        String clientlocation = ashok.getLocation();
        System.out.println("clientlocation:" + clientlocation);
        boolean ClientCertified = ashok.IsCertified();
        System.out.println("clientcertified:" + ClientCertified);
        double clientfund = ashok.getFund();
        System.out.println("clientfund:" + clientfund);

    }


}
