import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class Studenti implements StudentBehavior{
    private String emri;
    private String mbiemri;
    private int mosha;
    private int idStudenti;
    Drejtimi drejtimi;
    Hashtable<Lenda,Integer> notimi=new Hashtable<Lenda,Integer>(); //Tabela me Lende dhe nota

    public Studenti(String emri, String mbiemri, int mosha, int idStudenti, Drejtimi drejtimi) {
        this.emri=emri;
        this.mbiemri=mbiemri;
        this.mosha=mosha;
        this.idStudenti=idStudenti;
        this.drejtimi=drejtimi;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public int getMosha() {
        return mosha;
    }

    public int getIdStudenti() {
        return idStudenti;
    }

    void printNotat(){
        System.out.print("Notat e studentit me id "+idStudenti+": ");
        System.out.println(notimi);
    }

    @Override
    public double getNotaMesatare() {
        double notaMesKalkulim=0;
        int count=0;
        Collection notat=notimi.values();
        Iterator itr = notat.iterator();
        while(itr.hasNext()) {
            notaMesKalkulim +=(int) itr.next();
            count++;
        }

        double notaMes=(double) notaMesKalkulim/count;
        return notaMes;
    }

    @Override
    public String toString() {
        return emri+" "+mbiemri+" id e studentit: "+idStudenti;
    }
}
