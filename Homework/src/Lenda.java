import java.util.List;


public class Lenda implements LendaBehavoir{
    private String emriLendes;
    List<StudentBehavior> studentet;

    public Lenda(String emriLendes) {
        this.emriLendes = emriLendes;
    }

    public String getEmriLendes() {
        return emriLendes;
    }

    @Override
    public int getStudentet() {
        return studentet.size();
    }

    @Override
    public String toString() {
        return emriLendes;
    }
}
