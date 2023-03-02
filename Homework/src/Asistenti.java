
public class Asistenti extends AcademicStaff implements AsistentiBehavior{
    Lenda l;
    Profesori p;
    String llojiUshtrimeve;

    public Asistenti(String emri, String mbiemri, int mosha, Lenda l, Profesori p, String llojiUshtrimeve) {
        super(emri, mbiemri, mosha);
        this.l=l;
        this.p=p;
        this.llojiUshtrimeve=llojiUshtrimeve;
    }

    @Override
    public String llojiUshtrimeve() {
        return llojiUshtrimeve;
    }

    @Override
    public Profesori ktheProf() {
        return p;
    }

    @Override
    public String toString() {
        return super.toString()+" ka llojin e ushtrimeve: "+llojiUshtrimeve;
    }

    @Override
    public String ligjeron() {
        return "Ushtrime";
    }
}
