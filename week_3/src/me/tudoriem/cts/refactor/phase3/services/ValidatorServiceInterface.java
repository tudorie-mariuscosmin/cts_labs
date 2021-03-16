package me.tudoriem.cts.refactor.phase3.services;

import me.tudoriem.cts.refactor.exceptions.InvalidAgeException;
import me.tudoriem.cts.refactor.exceptions.InvalidPriceException;

public interface ValidatorServiceInterface {
    public void validatePrice(float price) throws InvalidPriceException;
    public  void validateAge(int accountAge) throws InvalidAgeException;

}
