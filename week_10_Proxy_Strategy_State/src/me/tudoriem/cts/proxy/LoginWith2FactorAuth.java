package me.tudoriem.cts.proxy;

public class LoginWith2FactorAuth implements LoginInterface{

    LoginInterface loginModule = null;

    public LoginWith2FactorAuth(LoginInterface loginModule) {
        this.loginModule = loginModule;
    }
    public  boolean checkGeneratedCode(int code){
        if(code==1245){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean login(String username, String password) {
       if(this.loginModule.login(username,password)){
           System.out.println("Please input generated code that you have received over email");
           System.out.println("Check received code");
           if(checkGeneratedCode(1234)){
               System.out.println("Hello"+username);
               return true;
           }else{
               System.out.println("the code is not ok");
           }
       }
       return false;
    }

    @Override
    public boolean checkServerIsUp() {
        return this.loginModule.checkServerIsUp();
    }
}
