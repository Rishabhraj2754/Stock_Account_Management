import java.util.Scanner;

public class StockPortfolio {
    public static void main(String[] args) {

        int numberOfStock;
        System.out.println("Enter the number of Stock");
        Scanner scanner = new Scanner(System.in);
        numberOfStock = scanner.nextInt();

        Stock[] stocks = new Stock[numberOfStock];

        for(int i = 0; i < numberOfStock; i++){
            System.out.println("ENTER THE NAME OF THE STOCK");
            String name = scanner.next();
            System.out.println("ENTER NUMBER OF SHARES");
            int numberOfShares=scanner.nextInt();
            System.out.println("ENTER THE PRICE OF STOCK");
            double price=scanner.nextDouble();
            stocks[i] = new Stock(name, numberOfShares, price);
        }
        for(int i = 0; i < numberOfStock; i++){
            System.out.println(stocks[i].name);
            System.out.println(stocks[i].numberOfShares);
            System.out.println(stocks[i].price);
           double totalValue = stocks[i].price * stocks[i].numberOfShares;
            System.out.println(totalValue);
        }

    }

}
