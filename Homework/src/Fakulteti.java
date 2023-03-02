import java.util.List;

public class Fakulteti {
    String emri;
    List<Staff> stafi;
    List<Studenti> students;
    public Fakulteti(String emri) {
        this.emri = emri;
    }

    //printo studentet sipas drejtimit
    void printStudentet(Drejtimi d){
        for (Studenti s:students) {
            if (s.drejtimi.equals(d)){
                System.out.println(s.toString());
            }
        }
    }

    //printo stafin
    void printStaf(){
        for (Staff s:stafi) {
            System.out.println(s.toString());
            System.out.println();
        }
    }
}
