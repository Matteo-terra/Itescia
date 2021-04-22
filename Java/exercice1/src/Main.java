package exercice1.src;


import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        
        Visite v1 = new Visite();
        //-
        affiche("\nVisite "+x+" : "+v1);
        affiche("Nom du visiteur : "+v1.nomDuVisiteur);
        affiche("Date de naissance du visiteur : "+v1.dateDeNaissanceDuVisiteur);
        affiche("Note du visiteur : "+v1.noteDuVisteur);
        
        x++;
        
        Visite v2 = new Visite("Georges","1990-10-10",15);
        //-
        affiche("\nVisite "+x+" : "+v2);
        affiche("Nom du visiteur : "+v2.getNomDuVisiteur());
        affiche("Date de naissance du visiteur : "+v2.getDateDeNaissanceDuVisiteur());
        affiche("Note du visiteur : "+v2.getNoteDuVisteur());
        
        affiche("\ncharAt : "+v2.nomDuVisiteur.charAt(1));
        
        Integer a = 10;
        String b = a.toString();
        Integer c = a.intValue();
        
        affiche("\nconvert to US : "+v1.convertUS(new Date(), Locale.ENGLISH));
        affiche("\nconvert to FR : "+v1.convertUS(new Date(), Locale.FRANCE));

        
    }
    
    public static void affiche(String text){
        System.out.println(text);
    }
    
}