package StarWars;

import java.util.ArrayList;

public class Acteurs {
    
    private int id;
    private String nom;
    private String prenom;
    private ArrayList<Personnages> duetPersonnages = new ArrayList(1);
    
    public Acteurs(){}
    
    public Acteurs(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public int getNombrePersonnages(){ return this.duetPersonnages.size(); }
    
    public int getId(){ return id; }
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    public ArrayList getDuetPersonnages() { return duetPersonnages; }

    public void setId(int id){ this.id = id; }
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    public void setDuetPersonnages(ArrayList duetPersonnages) { this.duetPersonnages = duetPersonnages; }
    
    public String toString(){
        return "\n[Acteur]"
            +"\n- id : "+this.getId()
            +"\n- nom de l'acteur : "+this.getNom()
            +"\n- prénom de l'acteur : "+this.getPrenom()
            +"\n- nombre de personnages : "+this.getNombrePersonnages();
    }
}