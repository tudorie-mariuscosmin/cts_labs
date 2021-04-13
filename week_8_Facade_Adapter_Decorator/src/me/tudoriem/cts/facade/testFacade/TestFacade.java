package me.tudoriem.cts.facade.testFacade;

import me.tudoriem.cts.facade.GameServer;
import me.tudoriem.cts.facade.UserAccount;
import me.tudoriem.cts.facade.UserApiFacade;
import me.tudoriem.cts.facade.UserProfile;

public class TestFacade {
    public static void main(String[] args) {
        GameServer gameServer = new GameServer();
        gameServer.connect("10.0.0.1");
        if(gameServer.isConnected()){
            UserAccount user = new UserAccount();
            user.login("Player1", "1234");
            UserProfile profile = user.downloadUserProfile();
            profile.getUserProfile();
        }


        UserProfile player1Profile = UserApiFacade.getUserProfile("10.0.0.1", "Player 1", "1234");
        if(player1Profile!= null){
            player1Profile.getUserProfile();
        }
    }
}
