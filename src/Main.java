import com.engeto.seller;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        seller seller = new seller("Aleš Roch", 16.05.1986, 15, 150, "Prague", "8YES5678", 8.6, "192.168.1.123");

        System.out.println(seller.getNameAndSurname());
        System.out.println(seller.getBirthDate());
        System.out.println(seller.getNumberOfConcludedContrats() + " concluded contracts");
        System.out.println(seller.getQuantity() + " tons");
        System.out.println(seller.getAddress());
        System.out.println(seller.getLicensePlateNumber());
        System.out.println(seller.getConsumption() + " l/100Km");
        System.out.println(seller.getiPAddress());

        double avarageQuantityPerContract = (seller.getQuantity() / seller.getNumberOfConcludedContrats());
        System.out.println("avarage quantity per contract is: " + avarageQuantityPerContract + " tons");

        }
    }
