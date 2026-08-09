package main.java.edu.dioformacaojava.modulo1.rawstudies;

public class MethodsReview {
    
    public static void main (String[] args){
        System.out.println("=========================== HISTOIRE STORE ============================");
    
    final int QUANTITY_NUMBER_DISCOUNT = 5;
    final double DISCOUNT_PERCENTAGE = 0.15;

    String characterName = "Noire", cityBelong = "Lastation", itemName = "Healing Potions", vendorName = "Histoire";
    
    int numberItemPurchase = 10;

    double itemPrice = 350.5, totalValuePurchase, creditBalance = 4000.0, totalValueDiscount, totalItemPrice;

    System.out.printf("%s: Welcome %s from %s!!%n",vendorName, characterName, cityBelong);
    System.out.printf("%s: I would like to buy %d %s.%n", characterName, numberItemPurchase, itemName);
    System.out.printf("%s: So... Would you like to purchase %d %s?%n", vendorName, numberItemPurchase, itemName);
    System.out.printf("%s: Yes, I would.%n", characterName);
    System.out.printf("%s: Okay! I'll check your credits.%n", vendorName);

    totalItemPrice = itemPrice * numberItemPurchase;
    totalValueDiscount = calculateDiscount(DISCOUNT_PERCENTAGE, totalItemPrice);
    boolean creditSufficient = isCreditSufficient(creditBalance, totalItemPrice, numberItemPurchase, QUANTITY_NUMBER_DISCOUNT, totalValueDiscount);
    
    if (creditSufficient) {        
        totalValuePurchase = sumPurchase(numberItemPurchase, QUANTITY_NUMBER_DISCOUNT, totalValueDiscount, totalItemPrice);
        creditBalance =  calculateSubstractCredit(totalValuePurchase, creditBalance, totalValueDiscount);
        System.out.printf ("%s: %dx %s was purchased. %n%n",vendorName, numberItemPurchase, itemName);
        System.out.printf("%s: Current Credit: %.2f. %n",vendorName, creditBalance);
    } else {
        System.out.printf ("%s: Sorry, insufficient credits.",vendorName);
    }

    }
    public static double calculateDiscount (double discountPorcentage, double totalItemPrice) {
        return totalItemPrice * discountPorcentage;
    }

    public static boolean isCreditSufficient (double creditBalance, double totalItemPrice, int numberItemPurchase, 
    int quantityNumberDiscount, double totalValueDiscount) {
        if (numberItemPurchase >= quantityNumberDiscount) {
            return creditBalance - (totalItemPrice - totalValueDiscount) >= 0 ? true : false;
        } else {
           return creditBalance - totalItemPrice >= 0 ? true : false;
        }
    }

    public static double sumPurchase (int numberItemPurchase, int quantityNumberDiscount, double totalValueDiscount, double totalItemPrice){
        if (numberItemPurchase >= quantityNumberDiscount) {
            return totalItemPrice - totalValueDiscount ; 
        } else {
            return totalItemPrice;
        }
    }

    public static double calculateSubstractCredit (double totalValuePurchase, double creditBalance, double totalValueDiscount) {
        return creditBalance - totalValuePurchase;
    }

}
