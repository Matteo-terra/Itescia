package Core.Tools;

import java.util.ArrayList;

public class Planning {
    
    public ArrayList<Visite> visites;
    
    public Planning() { this.visites = new ArrayList(); }
    
    public Planning(ArrayList visite) { this.visites = visite; }
    
    public ArrayList getVisite() { return visites; }

    public void setVisite(ArrayList visite) { this.visites = visite; }
    
    public void addVisite(Visite visite){ this.visites.add(visite); }

    public void removeVisite(Visite visite){ this.visites.remove(visite); }    
    
    public String toString(){
        int x = 0;
        String toString;
        if(visites.size()>0){
            toString = "";
            for(Visite visite : visites){
                if(x==0){
                    toString += visite;
                } else { toString += " - "+visite; }
                x++;
            }
        } else { toString = "planning vide"; }
        return toString;
    }
    
}