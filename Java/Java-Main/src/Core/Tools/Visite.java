package Core.Tools;

public class Visite {

    public String nomDuVisiteur = "Brian";
    public String dateDeNaissanceDuVisiteur = "1987-10-05";
    public int noteDuVisteur = 20;

  
    public Visite(){}
    
    public Visite(String nomDuVisiteur, String dateDeNaissanceDuVisiteur, int noteDuVisteur) {
        this.nomDuVisiteur = nomDuVisiteur;
        this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur;
        this.noteDuVisteur = noteDuVisteur;
    }
    
    public String getNomDuVisiteur() { return nomDuVisiteur; }
    public String getDateDeNaissanceDuVisiteur() { return dateDeNaissanceDuVisiteur; }
    public int getNoteDuVisteur() { return noteDuVisteur; }
    
    public void setNomDuVisiteur(String nomDuVisiteur) { this.nomDuVisiteur = nomDuVisiteur; }
    public void setDateDeNaissanceDuVisiteur(String dateDeNaissanceDuVisiteur) { this.dateDeNaissanceDuVisiteur = dateDeNaissanceDuVisiteur; }
    public void setNoteDuVisteur(int noteDuVisteur) { this.noteDuVisteur = noteDuVisteur; }
    
    public String toString(){ return this.nomDuVisiteur+" "+this.dateDeNaissanceDuVisiteur+" "+this.noteDuVisteur; }
    
}