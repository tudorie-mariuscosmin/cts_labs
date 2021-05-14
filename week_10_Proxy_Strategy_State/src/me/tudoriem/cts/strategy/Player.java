package me.tudoriem.cts.strategy;

public class Player {
    String username;
    int playTime;
    int experiencePoints;
    BonusStrategyInterface bonusCampaign = null;
    public Player(String username, int playTime, int experiencePoints) {
        this.username = username;
        this.playTime = playTime;
        this.experiencePoints = experiencePoints;
    }

    public void setBonusCampaign(BonusStrategyInterface bonusCampaign) {
        this.bonusCampaign = bonusCampaign;
    }
    public  void  getExperiencePoints(int pointsReceived){
       if(this.bonusCampaign!=null){
           this.bonusCampaign.getBonusPoints(pointsReceived,this);
       }
    }

}
