/*
*    Definire una classe AgenziaImmobiliare che contiene una lista di immobili e presenta
*        un metodo per aggiungere un immobile
*        un metodo per la ricerca di un immobile a partire dal codice alfanumerico
*        un metodo per restituire l’immobile che ha avuto il maggior numero di persone interessate
*/


import java.util.ArrayList;

public class EstateAgency {
    //variables
    private ArrayList<Properties> propertiesList = new ArrayList<>();

    //constructor
    public EstateAgency(ArrayList<Properties> propriertiesList) {
        this.propertiesList = propriertiesList;
    }

    //getter & setter
        //get
        public ArrayList<Properties> getPropriertiesList() {
            return propertiesList;
        }
        //set
        public void setPropriertiesList(ArrayList<Properties> propriertiesList) {
            this.propertiesList = propriertiesList;
        }


    //methods
        //add proprierties to list
        public void addProprierties(Properties proprierties) {
            propertiesList.add(proprierties);
        }
        //search by code
        public Properties searchPropriertiesByCode(String codeAlfanumeric) {
            for (Properties proprierties : propertiesList) {
                if (proprierties.getAlfanumericCode().equals(codeAlfanumeric)) {
                    System.out.println("Immobile trovato: " + proprierties.toString());
                    return proprierties;
                }
            }
            System.out.println("Il codice non è stato trovato.");
            return null;
        }
        //the most views


    //toString
    @Override
    public String toString() {
        return "EstateAgency: " +
                "propriertiesList= " + propertiesList +
                '.';
    }

}
