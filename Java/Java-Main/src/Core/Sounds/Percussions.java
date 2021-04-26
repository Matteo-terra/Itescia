package Core.Sounds;

import Core.Interfaces.Instruments;
import Core.Others.Console;


public class Percussions implements Instruments{
    
    public void play(){ Console.print("Poum"); }
    
    public String what(){ return null; }
    
    public void adjust(){}
}