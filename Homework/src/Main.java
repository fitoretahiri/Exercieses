/*Second OOP Problem:
- Create an OOP based Schooling system. (Students, teachers, classes etc...)

Try to have at least:
 - 1 Abstract class
 - 2 extended classes
 - 5 interfaces with multiple implementations
 - all of them are linked with each other and usable in a Main class
 */

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fakulteti f=new Fakulteti("UBT");
        Lenda lenda1=new Lenda("SHKI");
        //Krijimi i stafit
        Staff p=new Profesori("Emri","Mbiemri",60,lenda1,800);
        Profesori p2=new Profesori("Emri2","Mbiemri2",50,new Lenda("WEB"),950.2);
        Staff a1=new Asistenti("Asistenti1","Tahiri",21,lenda1,p2,"Ushtrime Numerike");
        //Drejtimi
        Drejtimi d=new Drejtimi("Shkenca Kompjuterike");
        //Studentet qe i takojne drejtimit d
        Studenti s=new Studenti("Studenti","Studenti",20,123456,d);
        Studenti s2=new Studenti("Studenti2","Studenti2",19,12,d);
        //vendosja e stafit dhe studenteve ne listat e fakultetit
        f.stafi=new ArrayList<Staff>(List.of(p,p2));
        f.students=new ArrayList<Studenti>(List.of(s,s2));
        //Vendosja e studenteve ne lendet e caktuara psh ni lende e ndjekun shume studenta
        lenda1.studentet=new ArrayList<StudentBehavior>(List.of(s,s2));
        //vendosja e notave nga Profesori ne baze te studentit
        ((Profesori) p).vendosNoten(s,10);
        p2.vendosNoten(s,9);
        p2.vendosNoten(s2,9);
        System.out.println("Printimi i notave: ");
        s.printNotat();
        s2.printNotat();
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Nota mesatare e studentit "+s.getEmri()+": "+s.getNotaMesatare());

        System.out.println("Numri i studenteve qe ndjekun lenden \""+lenda1.getEmriLendes()+"\": "+lenda1.getStudentet());
        //printo studentet sipas drejtimit
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Studentet e drejtimit: "+d.emriDrejtimit);
        f.printStudentet(d);
        System.out.println("----------------------------------------------------------------------");
        f.printStaf();
    }

}
