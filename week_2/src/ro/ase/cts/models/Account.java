package ro.ase.cts.models;

import ro.ase.cts.exceptions.IllegalTransferException;
import ro.ase.cts.exceptions.InsufficientFundsException;

public abstract class Account {
    public abstract void deposit(Double amount);
    public abstract void withdraw(Double amount) throws InsufficientFundsException;
    public abstract Object getBalance();
    public abstract void transfer(Account destination, Double amount) throws InsufficientFundsException, IllegalTransferException;
}
