/*
* Gli immobili sono caratterizzati da:
*        un codice alfanumerico,
*        indirizzo,
*        cap,
*        città
*        una superficie espressa in mq attraverso un numero intero.
*    Definire all’interno della classe Immobile un attributo per memorizzare il numero di persone interessate all’acquisto e aggiungere
*    un metodo per incrementare questo numero.
*    toString
*/

import java.util.Random;

public abstract class Properties {
    //variables
    private String alfanumericCode = generateAlfanumericCode();
    private String address;
    private int cap;
    private String city;
    private int mq;
    private int nInterestedPeople = 0;

    //getter & setter
        //get
        public String getAlfanumericCode() {
            return alfanumericCode;
        }
        public String getAddress() {
            return address;
        }
        public int getCap() {
            return cap;
        }
        public String getCity() {
            return city;
        }
        public int getMq() {
            return mq;
        }
        public int getnInterestedPeople() {
            return nInterestedPeople;
        }
        //set
        public void setAddress(String address) {
            this.address = address;
        }
        public void setCap(int cap) {
            this.cap = cap;
        }
        public void setCity(String city) {
            this.city = city;
        }
        public void setMq(int mq) {
            this.mq = mq;
        }

    //constructor
    public Properties(String address, int cap, String city, int mq) {
        this.alfanumericCode = alfanumericCode;
        this.address = address;
        this.cap = cap;
        this.city = city;
        this.mq = mq;
        this.nInterestedPeople = nInterestedPeople;
    }

    //toString
    @Override
    public String toString() {
        return "Properties: " +
                "alfanumericCode= '" + alfanumericCode + '\'' +
                ", address= '" + address + '\'' +
                ", cap= " + cap +
                ", city= '" + city + '\'' +
                ", mq= " + mq +
                ", nInterestedPeople= " + nInterestedPeople +
                '.';
    }

    //methods
        //increment number of people views proprierties
        public void incrementNInterestedPeople() {
            nInterestedPeople++;
        }


    //methods private
        //creation unique code
        public String generateAlfanumericCode() {
            Random random = new Random();
            String charAlphanumeric = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            int lengthCode = 7;
            char[] code = new char[lengthCode];
            for (int i = 0; i < lengthCode; i++) {
                int indexRandom = random.nextInt(charAlphanumeric.length());
                code[i] = charAlphanumeric.charAt(indexRandom);
            }
            alfanumericCode = new String(code);
            return alfanumericCode;
        }


}
