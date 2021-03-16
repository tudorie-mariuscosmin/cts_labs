package me.tudoriem.cts.refactor.phase3.testProduct;

import me.tudoriem.cts.refactor.exceptions.InvalidAgeException;
import me.tudoriem.cts.refactor.exceptions.InvalidPriceException;
import me.tudoriem.cts.refactor.phase3.Product;
import me.tudoriem.cts.refactor.phase3.ProductType;
import me.tudoriem.cts.refactor.phase3.services.Marketing2021Strategy;
import me.tudoriem.cts.refactor.phase3.services.MarketingEasterStrategy;
import me.tudoriem.cts.refactor.phase3.services.MarketingServiceInterface;
import me.tudoriem.cts.refactor.phase3.services.ValidatorService;

import java.util.ArrayList;

public class TestProduct {
    public static ArrayList<Object> services = new ArrayList<>();
    public static  void startup(){
        //load services
        services.add(new ValidatorService());
        services.add(new Marketing2021Strategy());
    }
    public static  void  main(String[] args){

        startup();

        //Product product = new Product();
        Product product = new Product(new Marketing2021Strategy(), new ValidatorService());
        try {
           float finalPrice =  product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
            System.out.println("The final price is: "+finalPrice );

            product.setMarketingService(new MarketingEasterStrategy());

            finalPrice =  product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
            System.out.println("The final price is: "+finalPrice );

            product.setMarketingService(new MarketingServiceInterface() {
                @Override
                public float getFidelityDiscount(int accountAge) {
                    return 0.3f;
                }
            });

            finalPrice =  product.computePriceWithDiscount(ProductType.DISCOUNTED, 100, 5);
            System.out.println("The final price is: "+finalPrice );
        } catch (InvalidPriceException | InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}
