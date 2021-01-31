import java.util.Scanner;

public class cryptoRegister {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Three letter coin name: ");
        String coinName = in.next();

        System.out.print("Enter coin amount: ");
        double coinAmount = in.nextDouble();
        //System.out.println("");

        System.out.print("Enter coin purchase price [in USD]: ");
        double coinPurchasePrice = in.nextDouble();
        //System.out.println("");

        double totInvestment = coinAmount * coinPurchasePrice;

        System.out.println("Coin Name       Coin Amount     Coin PP       Investment");
        System.out.println("----------------------------------------------------------");
        System.out.printf("%s             %.2f          $%.2f     $%.2f",coinName,coinAmount,
                coinPurchasePrice,totInvestment);




    }
}
