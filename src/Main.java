
/*
*   Si vuole progettare un’applicazione in grado di gestire un’agenzia immobiliare.
*    Gli immobili sono caratterizzati da:
*        un codice alfanumerico,
*        indirizzo,
*        cap,
*        città
*        una superficie espressa in mq attraverso un numero intero.
*    Definire all’interno della classe Immobile un attributo per memorizzare il numero di persone interessate all’acquisto e aggiungere
*    un metodo per incrementare questo numero.
*    L’agenzia gestisce diverse tipologie di immobili:
*        Box
*        Abitazione
*        Villa
*    Per i box è riportato il numero di posti auto.
*    Per le abitazioni è riportato il numero di vani e il numero di bagni.
*    Per le ville è previsto, in aggiunta rispetto all’abitazione, la dimensione in mq di giardino.
*    Definire per ciascuna delle tre classi il metodo toString() in modo da fornire una descrizione completa dell’immobile.
*    Definire nella classe Immobile il metodo reimpostaSuperfici che prende in input la nuova superficie.
*    Implementare nella classe Villa l’overload di questo metodo. In questo caso prenderà i parametri superficie e
*    superficieGiardino.
*    Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
*        un metodo per aggiungere un immobile
*        un metodo per la ricerca di un immobile a partire dal codice alfanumerico
*        un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
*    Creare una classe Main con metodo main nel quale testare tutte le funzionalità delle classi
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //variables
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
        ArrayList<Properties> properties = new ArrayList<>();
        EstateAgency listProperties = new EstateAgency(properties);
        listProperties.addProprierties(box1);
        listProperties.addProprierties(box2);
        listProperties.addProprierties(villa1);
        listProperties.addProprierties(villa2);
        listProperties.addProprierties(residence1);
        listProperties.addProprierties(residence2);

        //test
        System.out.println(box1);
        System.out.println(residence1);
        System.out.println(villa2);
        System.out.println(listProperties.toString());
        System.out.println(listProperties.searchPropriertiesByCode("MS4VO2S"));
        System.out.println("Numero di views: " + villa1.getnInterestedPeople());
    }
}
