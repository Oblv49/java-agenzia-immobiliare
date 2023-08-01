/*
*    Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
*        un metodo per aggiungere un immobile
*        un metodo per la ricerca di un immobile a partire dal codice alfanumerico
*        un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
*/


import java.util.ArrayList;

public class EstateAgency {
    //variables
    private ArrayList<Properties> propriertiesList = new ArrayList<>();

    //constructor
    public EstateAgency(ArrayList<Properties> propriertiesList) {
        this.propriertiesList = propriertiesList;
    }

    //getter & setter
        //get
        public ArrayList<Properties> getPropriertiesList() {
            return propriertiesList;
        }
        //set
        public void setPropriertiesList(ArrayList<Properties> propriertiesList) {
            this.propriertiesList = propriertiesList;
        }
    //toString

    @Override
    public String toString() {
        return "EstateAgency: " +
                "propriertiesList= " + propriertiesList +
                '.';
    }

    //methods
        //add proprierties to list
        public void addProprierties(Properties proprierties) {
            propriertiesList.add(proprierties);
        }
}
