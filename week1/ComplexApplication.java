package com.myfirstproject;

/**
 * A simple Class, representing an application.
 *
 * @author javapapo
 */
public class ComplexApplication {

    int price;

    public ComplexApplication(int aPrice) {
        this.price = aPrice;
    }

    public void printYourPrice() {
        System.out.println(this.price);
    }

    public int getPrice() {
        return price;
    }

    /**
     * MAIN APPLICATION START
     */
    public static void main(String[] args) {

        ComplexApplication msOffice = new ComplexApplication(100);
        ComplexApplication photoShop = new ComplexApplication(200);

        msOffice.printYourPrice();
        photoShop.printYourPrice();

        int totalPrice = msOffice.getPrice() + photoShop.getPrice();
        System.out.println("Total price is: "+400);

    }
}
