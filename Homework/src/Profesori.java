
public class Profesori extends AcademicStaff implements ProfessorBehavior{
    private Lenda l;
    private double salary;
    public Profesori(String emri, String mbiemri, int mosha, Lenda l, double salary) {
        super(emri, mbiemri, mosha);
        this.l=l;
        this.salary=salary;
    }

    public Lenda getL() {
        return l;
    }

    @Override
    public void vendosNoten(Studenti s,int i) {
        s.notimi.put(l,i);
    }


    public int getNota(Studenti s){
        return 0;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\nLigjeron lenden: "+l+"\nKa rrogen: "+salary;
    }

    @Override
    public boolean kaAsistent() {
        return true;
    }

    @Override
    public boolean mentoron() {
        return true;
    }

    @Override
    public String ligjeron() {
        return "Ligjerata";
    }
}
