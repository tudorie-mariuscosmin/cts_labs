package me.tudoriem.cts.refactor.phase3;

import me.tudoriem.cts.refactor.exceptions.InvalidAgeException;
import me.tudoriem.cts.refactor.exceptions.InvalidPriceException;
import me.tudoriem.cts.refactor.phase3.services.MarketingServiceInterface;

public class Product {

    MarketingServiceInterface mkService = null;
    public  Product (MarketingServiceInterface mkService){
//        if(mkService == null){
//            throw  new NullPointerException();
//        }
//        this.mkService = mkService;
        this.setMarketingService(mkService); // call the setter so we don't repeat ourselves
    }

    // optional based on specs
    public void  setMarketingService(MarketingServiceInterface mkService){
        if(mkService == null){
            throw  new NullPointerException();
        }
        this.mkService = mkService;
    }

    private static float getDiscountValue(float price, float discount){
        return  discount*price;
    }

    private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount){
        return (price - discountValue)*(1-fidelityDiscount) ;
    }


    private static float getFinalPrice(float price, float fidelityDiscount, ProductType type){
        float discountValue = getDiscountValue(price,type.getDiscount());
        return getPriceWithDiscountAndFidelity(price, discountValue, fidelityDiscount);
    }

    public float computePriceWithDiscount(ProductType productType, float price, int accountAge) throws InvalidPriceException, InvalidAgeException {
        if(price <=0){
            throw  new InvalidPriceException();
        }
        if(accountAge <0){
            throw  new InvalidAgeException();
        }

        float fidelityDiscount = productType == ProductType.NEW? 0: mkService.getFidelityDiscount(accountAge);
        return getFinalPrice(price, fidelityDiscount, productType);

    }
}