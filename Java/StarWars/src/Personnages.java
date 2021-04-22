public class Personnages {
    
    private String nom;
    private String prenom;
   
    public void Personnage(){}
    
    public void Personnage(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    
    public String toString(){
        return "Personnage : "+this.nom+" "+this.prenom;
    }
}