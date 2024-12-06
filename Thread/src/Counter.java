public class Counter {
    int startCounter;
    int maxNr;

    public Counter(int startCounter, int maxNr) {
        this.startCounter = startCounter;
        this.maxNr = maxNr;
    }

    public int getStartCounter() {
        return startCounter;
    }

    public void setStartCounter(int startCounter) {
        this.startCounter = startCounter;
    }

    public int getMaxNr() {
        return maxNr;
    }

    public void setMaxNr(int maxNr) {
        this.maxNr = maxNr;
    }

    synchronized public int incCounter(){
        if(startCounter >= maxNr){
            return -1;
        }
        return startCounter++;
    }
}
