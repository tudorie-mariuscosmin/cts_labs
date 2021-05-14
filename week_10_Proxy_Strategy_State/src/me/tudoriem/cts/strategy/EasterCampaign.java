package me.tudoriem.cts.strategy;

public class EasterCampaign implements BonusStrategyInterface {
    @Override
    public void getBonusPoints(int receivedPoints, Player player) {
        if(player.playTime>5){
            player.experiencePoints += (2*receivedPoints);
        }
    }
}
