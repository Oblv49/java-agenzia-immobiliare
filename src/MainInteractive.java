
/*
*  main interattivo che usa lo scanner per far decidere cosa fare all'utente
*/

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class MainInteractive {
    public static void main(String[] args) {
        //variables
        Scanner input = new Scanner(System.in);
        String userChoose = "0";
        ArrayList<Properties> properties = new ArrayList<>();
        EstateAgency listProperties = new EstateAgency(properties);

        // Istanziamo 2 Box
        Box box1 = new Box("Via Roma 1", 20121, "Milano", 20, 1);
        Box box2 = new Box("Via Verdi 10", 10100, "Torino", 15, 2);
        // Istanziamo 2 PrivateResidence
        PrivateResidence residence1 = new PrivateResidence("Via dei Fiori 5", 50123, "Firenze", 120, 3, 2);
        PrivateResidence residence2 = new PrivateResidence("Via delle Palme 20", 80100, "Napoli", 90, 2, 1);
        // Istanziamo 2 Villa
        Villa villa1 = new Villa("Via delle Rose 15", 40100, "Bologna", 200, 5, 3, 400);
        Villa villa2 = new Villa("Via degli Ulivi 8", 30100, "Venezia", 180, 4, 2, 300);

        //creation list

        listProperties.addProprierties(box1);
        listProperties.addProprierties(box2);
        listProperties.addProprierties(villa1);
        listProperties.addProprierties(villa2);
        listProperties.addProprierties(residence1);
        listProperties.addProprierties(residence2);
        System.out.println(" ");
        System.out.println("BENVENUTO SUL GESTIONALE DELL'AGENZIA");
        do {
            System.out.println("-------------------------------------");
            System.out.println("Scegli cosa vuoi fare (inserisci il numero corrispondente): ");
            System.out.println("-------------------------------------");
            System.out.println("1. Visualizzare tutta la lista di immobili.");
            System.out.println("2. Cerca un immobile tramite codice univoco.");
            System.out.println("3. Visualizza l'immobile con più interesse.");
            System.out.println("4. Dichiarare interesse per un immobile.");
            System.out.println("5. Reimpostare superfice di un immobile.");
            System.out.println("6. Aggiungere un immobile alla lista.");
            System.out.println("0. Uscire dal programma.");
            userChoose = input.nextLine();
            System.out.println("-------------------------------------");
            switch (userChoose){
                case "1":
                    for (Properties property : properties) {
                        if(property instanceof Villa) {
                            System.out.println("La proprità è una Villa.");
                            System.out.println(property);
                        } else if (property instanceof PrivateResidence){
                            System.out.println("La proprietà è un Appartamento.");
                            System.out.println(property);
                        } else if (property instanceof Box) {
                            System.out.println("La proprietà è un Box");
                            System.out.println(property);
                        }
                    }
                    System.out.println("-------------------------------------");
                    break;
                case "2":
                    System.out.println("Inserisci il codice da ricercare.");
                    userChoose = input.nextLine();
                    listProperties.searchPropriertiesByCode(userChoose);
                    System.out.println("-------------------------------------");
                    break;
                case "3":
                    System.out.println("Immobile che ha ricevuto più interesse: " + listProperties.mostInterestingProperty());
                    break;
                case "4":
                    System.out.println("Quale Proprietà ti interessa?: ");
                    System.out.println("-------------------------------------");
                    int c = 1;
                    for (Properties property : properties) {
                        if (property instanceof Villa) {
                            System.out.println(c + ". " + "La proprietà è una Villa.");
                            System.out.println(property);
                            c++;
                        } else if (property instanceof PrivateResidence){
                            System.out.println(c + ". " + "La proprietà è un Appartamento.");
                            System.out.println(property);
                            c++;
                        } else if (property instanceof Box) {
                            System.out.println(c + ". " + "La proprietà è un Box");
                            System.out.println(property);
                            c++;
                        }
                    }
                    System.out.println(" ");
                    System.out.println("Inserisci il numero della proprietà scelta: ");
                    userChoose = input.nextLine();
                    if (Integer.parseInt(userChoose) >= 1 && Integer.parseInt(userChoose)<= properties.size()) {
                        Properties selectedProperty = properties.get(Integer.parseInt(userChoose) - 1);
                        selectedProperty.incrementNInterestedPeople();
                        System.out.println("-------------------------------------");
                        System.out.println("Grazie per aver manifestato interesse per la proprietà:");
                        System.out.println(selectedProperty);
                    } else {
                        System.out.println("Indice non valido. Riprova.");
                    }
                    break;
                case "5":
                    System.out.println("Scegli la proprietà da aggiornare: ");
                    System.out.println("-------------------------------------");
                    int i = 1;
                    for (Properties property : properties) {
                        if (property instanceof Villa) {
                            System.out.println(i + ". " + "La proprietà è una Villa.");
                            System.out.println(property);
                            i++;
                        } else if (property instanceof PrivateResidence){
                            System.out.println(i + ". " + "La proprietà è un Appartamento.");
                            System.out.println(property);
                            i++;
                        } else if (property instanceof Box) {
                            System.out.println(i + ". " + "La proprietà è un Box");
                            System.out.println(property);
                            i++;
                        }
                    }
                    System.out.println(" ");
                    System.out.println("Inserisci il numero della proprietà che vuoi modificare: ");
                    userChoose = input.nextLine();
                    System.out.println("-------------------------------------");
                    if (Integer.parseInt(userChoose) >= 1 && Integer.parseInt(userChoose)<= properties.size()) {
                        Properties selectedProperty = properties.get(Integer.parseInt(userChoose) - 1);
                        if (selectedProperty instanceof Villa) {
                            System.out.print("Inserisci i metri quadrati della Villa: ");
                            int mqVilla = input.nextInt();
                            System.out.print("Inserisci i metri quadrati del giardino della villa ");
                            int mqGarden = input.nextInt();
                            ((Villa) selectedProperty).reimpostMq(mqVilla);
                        } else if (selectedProperty instanceof PrivateResidence) {
                            System.out.print("Inserisci i metri quadrati dell'Appartamento: ");
                            int mqAppartamento = input.nextInt();
                            ((PrivateResidence) selectedProperty).reimpostMq(mqAppartamento);
                        } else if (selectedProperty instanceof Box) {
                            System.out.print("Inserisci i metri quadrati del Box: ");
                            int mqBox = input.nextInt();
                            ((Box) selectedProperty).reimpostMq(mqBox);
                        }
                        System.out.println("-------------------------------------");
                        System.out.println("Metri quadrati aggiornati con successo per la proprietà selezionata.");
                        System.out.println(selectedProperty);
                        input.nextLine();
                    } else {
                        System.out.println("Indice non valido. Riprova.");
                    }
                    break;
                case "6":
                    System.out.println("Scegli se inserire un Appartamento una Villa o Box.");
                    System.out.println("-------------------------------------");
                    System.out.println("1. Appartamento");
                    System.out.println("2. Villa");
                    System.out.println("3. Box");
                    userChoose = input.nextLine();
            }

        } while (!userChoose.equals("0"));

        System.out.println("Programma in chiusura..");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Arrivederci e a Presto!");
    }
}
