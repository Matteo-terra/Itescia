package Core.Sounds;

import Core.Interfaces.Instruments;

public class WoodWind extends Wind implements Instruments{
    
    public void play(){
        Wind wind = new Wind();
        wind.play();
    }
    
    public String what(){ return null; }
    
    public void adjust(){}
}