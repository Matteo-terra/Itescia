package StarWars;

import Core.Sounds.Percussions;
import Core.Sounds.Wind;
import Core.Sounds.WoodWind;
import Core.Tools.DatabaseConnection;
import Core.Tools.Visite;
import Core.Tools.Calcul;
import Core.Tools.Fichiers;
import Core.Tools.MyDates;
import Core.Tools.Planning;
import Core.Others.DateConvertor;
import StarWars.Acteurs;
import StarWars.Films;
import StarWars.Personnages;
import static Core.Others.Console.print;
import java.util.Date;
import java.util.Locale;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) throws ParseException, SQLException, ClassNotFoundException {
        
        int x = 1;

        Visite v1 = new Visite();
        //-
        print("\nVisite "+x+" : "+v1);
        print("Nom du visiteur : "+v1.nomDuVisiteur);
        print("Date de naissance du visiteur : "+v1.dateDeNaissanceDuVisiteur);
        print("Note du visiteur : "+v1.noteDuVisteur);
        
        x++;
        
        Visite v2 = new Visite("Georges","1990-10-10",15);
        print("\nVisite "+x+" : "+v2);
        print("Nom du visiteur : "+v2.getNomDuVisiteur());
        print("Date de naissance du visiteur : "+v2.getDateDeNaissanceDuVisiteur());
        print("Note du visiteur : "+v2.getNoteDuVisteur());
        
        print("\ncharAt : "+v2.nomDuVisiteur.charAt(1));
        
        
        Integer a = 10;
        String b = a.toString();
        Integer c = a.intValue();
        
        String date1 = "2021-05-10";
        MyDates myDates = new MyDates();
        String date2 = myDates.dateUStoFR(date1);
        String date3 = myDates.dateFRtoUS(date2);
        print("\ndate start : "+date1);
        print("dateUStoFR : "+date2);
        print("dateFRtoUS : "+date3);
        DateConvertor dateConvertor = new DateConvertor();
        print("\nconvert to US : "+dateConvertor.dateConvertTypeDate(new Date(), Locale.ENGLISH));
        print("convert to FR : "+dateConvertor.dateConvertTypeDate(new Date(), Locale.FRANCE));
        
        Planning p1 = new Planning();
        print(p1.toString());
        Visite vA = new Visite("Georges DuPont", "1992/10/03", 20);
        Visite vB = new Visite("Georges DuPont", "2002/03/04", 15);
        Visite vC = new Visite("Georges DuPont", "1992/11/14", 14);
        Visite vD = new Visite("Georges DuPont", "1986/05/31", 18);
        p1.addVisite(vA);
        p1.addVisite(vB);
        p1.addVisite(vC);
        p1.addVisite(vD);
        print(p1.toString());
        
        
        Calcul calcul = new Calcul();
        calcul.setVarA(21);
        calcul.setVarB(35);
        print("\nA & B : "+calcul.toString());
        print("addition : "+calcul.addition());
        print("soustraction : "+calcul.soustraction());
        print("multiplication : "+calcul.multiplication());
        print("division : "+calcul.division());
        
        print("\nWind : ");
        Wind wind = new Wind();
        wind.play();
        print("Percussion : ");
        Percussions percussions = new Percussions();
        percussions.play();
        print("Woodwind : ");
        WoodWind woodwind = new WoodWind();
        woodwind.play();        
        
        print("\nListes Chaînées & itération : ");
        LinkedList<String> listeChainee = new LinkedList();
        listeChainee.add("Brian");
        listeChainee.addLast("Edouard");
        listeChainee.add("Paul");
        listeChainee.addFirst("Pierre");
        for(String element : listeChainee){
            print("- "+element);
        }
        print("listechainee - size : "+listeChainee.size());
        listeChainee.clear();
        listeChainee.add("Georges");
        listeChainee.add("Claire");
        listeChainee.addFirst("Pierre");
        for(String element : listeChainee){
            print("- "+element);
        }
        print("listechainee - size : "+listeChainee.size());
        ListIterator<String> listeChaineeIterator = listeChainee.listIterator();
        if(listeChaineeIterator.hasNext()){
            print("-> toString fo next element : "+listeChaineeIterator.next());
        }
        
        
        print("\nStack : ");
        Stack listeLIFO = new Stack();
        listeLIFO.push("Vélo");
        listeLIFO.push("Voiture");
        listeLIFO.push("Bus");
        for(Object element : listeLIFO){
            print("- "+element);
        }
        print("Peek element : "+listeChainee.peek());
        
        
        print("\nStar wars : ");
        
        Films filmA = new Films(0, "Star wars I","1977", 1, 1234.123, 6443.123);
        Films filmB = new Films(0, "Star wars II","1980", 2, 1234.123, 6443.123);
        Films filmC = new Films(0, "Star wars III","1983", 3, 1234.123, 6443.123);
        
        ArrayList<Films> films = new ArrayList();
        films.add(filmA);
        films.add(filmB);
        films.add(filmC);
        
        int y = 1;
        for(Films film : films){
            print("[Film "+y+"]"+film.toString());
            y++;
        }
        
        Personnages persoA = new Personnages(0, "Skywalker", "Anakin");
        Personnages persoB = new Personnages(0, "Skywalker", "Luke");
        Personnages persoC = new Personnages(0, "Skywalker", "Shmi");
        Personnages persoD = new Personnages(0, "Skywalker", "Ben");
        
        
        Acteurs acteur1 = new Acteurs(0, "Ford", "Harrison");
        Acteurs acteur2 = new Acteurs(0, "Hamill", "Mark");
        Acteurs acteur3 = new Acteurs(0, "Fisher", "Carrie");
        Acteurs acteur4 = new Acteurs(0, "Guinness", "Alec");
        
        ArrayList<Personnages> personnagesActeurA = new ArrayList(1);
        personnagesActeurA.add(persoA);
        personnagesActeurA.add(persoB);
        acteur1.setDuetPersonnages(personnagesActeurA);
        ArrayList<Personnages> personnagesActeurB = new ArrayList(1);
        personnagesActeurB.add(persoC);
        personnagesActeurB.add(persoD);
        acteur2.setDuetPersonnages(personnagesActeurB);
        ArrayList<Personnages> personnagesActeurC = new ArrayList(1);
        personnagesActeurC.add(persoC);
        personnagesActeurC.add(persoD);
        acteur3.setDuetPersonnages(personnagesActeurC);
        ArrayList<Personnages> personnagesActeurD = new ArrayList(1);
        personnagesActeurD.add(persoC);
        personnagesActeurD.add(persoD);
        acteur4.setDuetPersonnages(personnagesActeurD);
        
        ArrayList<Acteurs> acteursList1 = new ArrayList();
        acteursList1.add(acteur1);
        acteursList1.add(acteur2);
        acteursList1.add(acteur3);
        acteursList1.add(acteur4);
        filmA.setActeurs(acteursList1);
        print("\n"+filmA.toString());
        
        boolean isBefore = filmA.isBefore("2020");
        print("\n isBefore : "+isBefore);
        
        print("\n"+filmA.getActeurs());
        filmA.tri();
        print("\n"+filmA.getActeurs());
        
        print("\nHashMap Dico");
        HashMap<String,Films> dicoFilms = new HashMap();
        dicoFilms.put(filmA.getAnneeDeSortie(), filmA);
        dicoFilms.put(filmB.getAnneeDeSortie(), filmB);
        dicoFilms.put(filmC.getAnneeDeSortie(), filmC);        
        makeBackUp(dicoFilms);

    }
        


    public static void makeBackUp(HashMap dicoFilms){
        Set dicoFilmsSetIterator = dicoFilms.entrySet();
        Iterator dicoFilmsList = dicoFilmsSetIterator.iterator();
        while(dicoFilmsList.hasNext()) {
            Map.Entry film = (Map.Entry)dicoFilmsList.next();
            String filmKey = (String) film.getKey();
            Films filmValue = (Films) film.getValue();
            String filmTitre = filmValue.getTitre();
            String filmBenefice = filmValue.calculBenefice().get(1).toString();
            print(""+filmKey+" - "+filmTitre+" - "+filmBenefice);
        }
    }
    
}