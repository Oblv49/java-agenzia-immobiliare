/*
*    Per le abitazioni è riportato il numero di vani e il numero di bagni.
*    toString
*/

public class PrivateResidence extends Properties{
    //variables
    private int nRoom;
    private int nBathrooms;

    //getter & setter
        //get
        public int getnRoom() {
            return nRoom;
        }
        public int getnBathrooms() {
            return nBathrooms;
        }

    //constructor
    public PrivateResidence(String address, int cap, String city, int mq, int nRoom, int nBathrooms) {
        super(address, cap, city, mq);
        this.nRoom = nRoom;
        this.nBathrooms = nBathrooms;
    }

    //tostring
    @Override
    public String toString() {
        return super.toString() +
                "PrivateResidence{" +
                "nRoom=" + nRoom +
                ", nBathrooms=" + nBathrooms +
                '}';
    }
}
