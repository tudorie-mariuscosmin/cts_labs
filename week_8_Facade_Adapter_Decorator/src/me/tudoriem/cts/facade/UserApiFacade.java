package me.tudoriem.cts.facade;

public class UserApiFacade {

    public static UserProfile getUserProfile(String serverIp, String username, String pass){
        GameServer gameServer = new GameServer();
        gameServer.connect(serverIp);
        if(gameServer.isConnected()){
            UserAccount user = new UserAccount();
            user.login(username, pass);
            UserProfile profile = user.downloadUserProfile();
            return profile;
        }
        return null;
    }
}
