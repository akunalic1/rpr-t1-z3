package ba.unsa.etf.rpr;

public class Sat {
    private int sati, minute, sekunde;

    public Sat(int sati, int minute, int sekunde){
        this.postavi(sati, minute, sekunde);
    }
    public void postavi(int sati, int minute, int sekunde){
        this.sati=sati;
        this.minute=minute;
        this.sekunde=sekunde;
    }
    void sljedeci() {
        sekunde++;
        if (sekunde==60) { sekunde=0; minute++; }
        if (minute==60) { minute=0; sati++; }
        if (sati==24) sati=0;
    }
    void prethodni() {
        sekunde--;
        if (sekunde==-1) { sekunde=59; minute--; }
        if (minute==-1) { minute=59; sati--; }
        if (sati==-1) sati=23;
    }
    void pomjeriZa(int pomak) {
        if (pomak>0) for (int i=0; i<pomak; i++) sljedeci();
		else for (int i=0; i<-pomak; i++) prethodni();
    }

    public int getSati() {
        return sati;
    }

    public int getMinute() {
        return minute;
    }

    public int getSekunde() {
        return sekunde;
    }
    public void ispisi(){
        System.out.println(sati + ":" + minute + ":" + sekunde );
    }
}
