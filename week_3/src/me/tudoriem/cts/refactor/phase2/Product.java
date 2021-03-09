package me.tudoriem.cts.refactor.phase2;

import me.tudoriem.cts.refactor.exceptions.InvalidAgeException;
import me.tudoriem.cts.refactor.exceptions.InvalidPriceException;

public class Product {

    public  static final int MAX_AGE_ACCOUNT = 10;
    public  static  final float MAX_FIFELITY_DISCOUNT = 0.15f;

    private static float getDiscountValue(float price, float discount){
        return  discount*price;
    }

    private static float getPriceWithDiscountAndFidelity(float price, float discountValue, float fidelityDiscount){
        return (price - discountValue)*(1-fidelityDiscount) ;
    }

    private  static float getFidelityDiscount(int accountAge){
        return (accountAge > MAX_AGE_ACCOUNT) ? MAX_FIFELITY_DISCOUNT : (float)accountAge/100;
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

        float fidelityDiscount = productType == ProductType.NEW? 0: getFidelityDiscount(accountAge);
        return getFinalPrice(price, fidelityDiscount, productType);

    }
}