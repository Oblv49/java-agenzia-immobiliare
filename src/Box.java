/*
*    Per i box è riportato il numero di posti auto.
*    toString
*/

public class Box extends Properties{
    //variables
    private int nParkingSpaces;

    //getter & setter
        //get
        public int getnParkingSpaces() {
            return nParkingSpaces;
        }
        //set
        public void setnParkingSpaces(int nParkingSpaces) {
            this.nParkingSpaces = nParkingSpaces;
        }
    //constructor
    public Box(String address, int cap, String city, int mq, int nParkingSpaces) {
        super(address, cap, city, mq);
        this.nParkingSpaces = nParkingSpaces;
    }

    //tostring
    @Override
    public String toString() {
        return super.toString() +
                " nParkingSpaces=" + nParkingSpaces +
                '.';
    }
}
