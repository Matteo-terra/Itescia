package StarWars;

public class Personnages {
    private int id;
    private String nom;
    private String prenom;
    
    public Personnages(){}
    
    public Personnages(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public int getId(){ return this.id; }
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    
    public void setId(int id){ this.id = id; }
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    
    public String toString(){
        return "[Personnage]\n"
            +"\n- id : "+this.getId()
            +"\n- nom de l'acteur : "+this.getNom()
            +"\n- prénom de l'acteur : "+this.getPrenom();
    }
}