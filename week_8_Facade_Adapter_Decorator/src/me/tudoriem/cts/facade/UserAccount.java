package me.tudoriem.cts.facade;

public class UserAccount {

    public  void login(String username, String pass){
        System.out.println("Checking credentials");
    }


    public UserProfile downloadUserProfile(){
        return new UserProfile();
    }
}
