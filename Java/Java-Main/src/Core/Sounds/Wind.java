package Core.Sounds;

import Core.Interfaces.Instruments;
import Core.Others.Console;

public class Wind implements Instruments{
    
    public void play(){ Console.print("Fiouuuuuuu"); }
    
    public String what(){ return null; }
    
    public void adjust(){}
}