package com.company;

public class SlowPlayer extends Player implements PlayBehaviour{

    public SlowPlayer(String userName, int age) {
        super(userName, age);
    }

    @Override
    public void play(Game game) {
        System.out.println(getUserName()+" is playing slow!");
    }

    @Override
    public void getSatisfaction(int timePlayedInMinutes) {
        if(timePlayedInMinutes==0){
            System.out.println("Nothing changed!");
        }
        else if (timePlayedInMinutes>0 && timePlayedInMinutes<=10){
            System.out.println(getUserName()+" is happy. Time played: "+timePlayedInMinutes+" mins.");
        }else {
            System.out.println(getUserName()+" is the happiest. Time played: "+timePlayedInMinutes+" mins.");
        }
    }

}
