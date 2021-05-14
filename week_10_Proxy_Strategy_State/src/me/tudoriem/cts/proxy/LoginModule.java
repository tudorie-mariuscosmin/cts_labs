package me.tudoriem.cts.proxy;

public class LoginModule implements LoginInterface{
    String serverIp;
    String dbConnection;


    public LoginModule(String serverIp, String dbConnection) {
        this.serverIp = serverIp;
        this.dbConnection = dbConnection;
    }

    @Override
    public boolean login(String username, String password) {
        System.out.println("Connecting to the database "+ dbConnection);
        if(username.toLowerCase().equals("admin") && password.equals("1234admin"))
            return true;
        else
            return false;

    }
    @Override
    public boolean checkServerIsUp() {
        return true;
    }
}
