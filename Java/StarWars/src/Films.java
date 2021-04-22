public class Films {

    private String titre;
    private String anneeDeSortie;
    private String numeroEpisode;
    private double cout;
    private double recette;
    
    public void Film() {}
    
    public void Film(String titre, String anneeDeSortie, String numeroEpisode, double cout, double recette)
    {   this.titre = titre;
        this.anneeDeSortie = anneeDeSortie;
        this.numeroEpisode = numeroEpisode;
        this.cout = cout;
        this.recette = recette;
    }

    public String getTitre() {return titre;}
    public String getAnneeDeSortie() { return anneeDeSortie; }
    public String getNumeroEpisode() { return numeroEpisode; }
    public double getCout() { return cout; }
    public double getRecette() { return recette; }

    public void setTitre(String titre) { this.titre = titre; }
    public void setAnneeDeSortie(String anneeDeSortie) { this.anneeDeSortie = anneeDeSortie; }
    public void setNumeroEpisode(String numeroEpisode) { this.numeroEpisode = numeroEpisode; }
    public void setCout(double cout) { this.cout = cout;}
    public void setRecette(double recette) { this.recette = recette; }
    
    public String toString(){
        return "Film : "+this.titre+" "+this.anneeDeSortie+" "+this.numeroEpisode+" "+this.cout+" "+this.recette;
    }
}