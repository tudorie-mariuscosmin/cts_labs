package me.tudoriem.cts.refactor.phase3;

import me.tudoriem.cts.refactor.exceptions.InvalidAgeException;
import me.tudoriem.cts.refactor.exceptions.InvalidPriceException;
import me.tudoriem.cts.refactor.phase3.services.MarketingServiceInterface;
import me.tudoriem.cts.refactor.phase3.services.ValidatorServiceInterface;
import me.tudoriem.cts.refactor.phase3.testProduct.TestProduct;

public class Product {

    MarketingServiceInterface mkService = null;
    ValidatorServiceInterface validator = null;
    public  Product (MarketingServiceInterface mkService, ValidatorServiceInterface validator){
//        if(mkService == null){
//            throw  new NullPointerException();
//        }
//        this.mkService = mkService;
        this.setMarketingService(mkService); // call the setter so we don't repeat ourselves
        this.validator = validator;
    }
    public Product(){
        // dependency injection based on the global services collection
        for(Object service: TestProduct.services){
            if(service instanceof  MarketingServiceInterface){
                this.setMarketingService((MarketingServiceInterface) service);
            }
            if(service instanceof  ValidatorServiceInterface){
                this.validator = (ValidatorServiceInterface) service;
            }
        }
        if(this.mkService == null || this.validator == null){
            throw new UnsupportedOperationException();
        }
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
        validator.validatePrice(price);
        validator.validateAge(accountAge);

        float fidelityDiscount = productType == ProductType.NEW? 0: mkService.getFidelityDiscount(accountAge);
        return getFinalPrice(price, fidelityDiscount, productType);

    }
}