package me.tudoriem.cts.strategy;

public class NoCampaign implements BonusStrategyInterface{
    @Override
    public void getBonusPoints(int receivedPoints, Player player) {
        player.experiencePoints +=receivedPoints;
    }
}
