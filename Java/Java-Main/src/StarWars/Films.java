package StarWars;

import Core.Others.Console;
import static Core.Others.Console.print;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Films {

    private int id;
    private String titre;
    private String anneeDeSortie;
    private int numeroEpisode;
    private double cout;
    private double recette;
    private ArrayList<Acteurs> acteurs;
    
    public Films() {}
    
    public Films(boolean nouveaFilm){
        if(nouveaFilm==true){
            print("[Nouveau film]");
            //-
            Scanner scan = new Scanner(System.in);
            //-
            print("- (string) titre du film : ");
            String titreFilm = scan.nextLine();
            this.titre = titreFilm;
            //-
            print("- (string) année du film : ");
            String anneeDeSortieFilm = scan.next();
            this.anneeDeSortie = anneeDeSortieFilm;
            //-
            print("- (int) numéro du film : ");
            int numeroEpisodeFilm = scan.nextInt();
            this.numeroEpisode = numeroEpisodeFilm;
            //-
            print("- (double) coût du film : ");
            double coutFilm = scan.nextDouble();
            this.cout = coutFilm;
            //-
            print("- (double) recette du film : ");
            double recetteFilm = scan.nextDouble();
            this.recette = recetteFilm;
            //-
            this.id = 0;
            this.acteurs = new ArrayList();
            //-
            print("[Nouveau film enregistré]");
        }
    }
    
    public Films(int id, String titre, String anneeDeSortie, int numeroEpisode, double cout, double recette) {
        this.id = id;
        this.titre = titre;
        this.anneeDeSortie = anneeDeSortie;
        this.numeroEpisode = numeroEpisode;
        this.cout = cout;
        this.recette = recette;
        this.acteurs = new ArrayList();
    }

    public int getNombreActeurs(){ return !this.acteurs.isEmpty() && this.acteurs.size()>0 ? this.acteurs.size() : 0 ; }
    
    public int getNombrePersonnages(){
        int i = 0;
        for(Acteurs acteur : this.acteurs){
            i +=acteur.getNombrePersonnages();
        }
        return i;
    }
    
    public ArrayList calculBenefice(){
        double x = this.recette-this.cout;
        ArrayList result = new ArrayList();
        if(x >= 0){
            result.add(true);
            result.add(x);
        } else {
            result.add(false);
            result.add(x);
        }
        return result;
    }
    
    public boolean isBefore(String anneeInserted) throws ParseException{
        DateFormat format = new SimpleDateFormat("YYYY", Locale.FRANCE);
        Date anneeDeSortieToDate = format.parse(this.anneeDeSortie);
        Date anneeInsertedToDate = format.parse(anneeInserted);
        return anneeDeSortieToDate.compareTo(anneeInsertedToDate) < 0;
    }
    
    public ArrayList tri(){
        ArrayList<Acteurs> acteursTries = new ArrayList();
        if(this.acteurs!=null && !this.acteurs.isEmpty() && this.acteurs.size()>0){
            Collections.sort(this.acteurs, new Comparator<Acteurs>() {
                @Override
                public int compare(Acteurs acteur1, Acteurs acteur2){ return  acteur1.getNom().compareTo(acteur2.getNom()); }
            });
            acteursTries.addAll(this.acteurs);
            Console.print("\n[Trie effectué]");
        } else{
            acteursTries = null;
            Console.print("\n[Trie non effectué]");
        }
        return acteursTries;
    }

    public int getId(){ return this.id; }
    public String getTitre() { return titre; }
    public String getAnneeDeSortie() { return anneeDeSortie; }
    public int getNumeroEpisode() { return numeroEpisode; }
    public double getCout() { return cout; }
    public double getRecette() { return recette; }
    public ArrayList<Acteurs> getActeurs() { return acteurs; }

    // The methods of basic setter below.
    public void setId(int id){ this.id = id; }
    public void setTitre(String titre) { this.titre = titre; }
    public void setAnneeDeSortie(String anneeDeSortie) { this.anneeDeSortie = anneeDeSortie; }
    public void setNumeroEpisode(int numeroEpisode) { this.numeroEpisode = numeroEpisode; }
    public void setCout(double cout) { this.cout = cout;}
    public void setRecette(double recette) { this.recette = recette; }
    public void setActeurs(ArrayList<Acteurs> acteurs) { this.acteurs = acteurs; }
    
    public String toString(){
        return "[Film]"+
            "\n"+this.getId()
            +"\n- titre du film : "+this.getTitre()
            +"\n- année de sortie du film : "+this.getAnneeDeSortie()
            +"\n- numéro de l'épisode du film : "+this.getNumeroEpisode()
            +"\n- coût du film : "+this.getCout()
            +"\n- recette du film : "+this.getRecette()
            +"\n- bénéfice : "+this.calculBenefice()
            +"\n- nb acteurs : "+this.getNombreActeurs()
            +"\n- nb personnages : "+this.getNombrePersonnages();
    }
}