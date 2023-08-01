/*
*    Per le ville è previsto, in aggiunta rispetto all’abitazione, la dimensione in mq di giardino.
*    toString
*/
public class Villa extends PrivateResidence{
    //variables
    private int mqGarden;

    //getter & setter
        //get
        public int getMqGarden() {
            return mqGarden;
        }
        //set
        public void setMqGarden(int mqGarden) {
            this.mqGarden = mqGarden;
        }

    //constructor
    public Villa(String address, int cap, String city, int mq, int nRoom, int nBathrooms, int mqGarden) {
        super(address, cap, city, mq, nRoom, nBathrooms);
        this.mqGarden = mqGarden;
    }

    //tostring

    @Override
    public String toString() {
        return super.toString() +
                "Villa{" +
                "mqGarden=" + mqGarden +
                '}';
    }
}
