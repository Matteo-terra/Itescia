public class Acteurs {
    
    private String nom;
    private String prenom;
    
   
    public void Acteur(){}
   
    public void Acteur(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    
    public String getNom(){ return this.nom; }
    public String getPrenom(){ return this.prenom; }
    
    public void setNom(String nom){ this.nom = nom; }
    public void setPrenom(String prenom){ this.prenom = prenom; }
    
    public String toString(){
        return "Acteur : "+this.nom+" "+this.prenom;
    }
}