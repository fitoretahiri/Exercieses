import java.util.ArrayList;
import java.util.List;

public class Farm {
    public static void main(String[] args) {

        List <Animals> list= new ArrayList<Animals>(List.of(new Dog("Dog1",5,true,"Pitbull"),
                                                new Cow("cow1",4,true,"type1"),
                                                new Cat("Cat1",3,false,"blue")));
        System.out.println(list.toString());
        //remove the first animal on the list
        list.remove(0);
        System.out.println(list.toString());

        //return all vaccinated animals
        List<Animals> temp=new ArrayList<Animals>();
        list.forEach(animals -> {
            if (animals.isVaccinated()){
                temp.add(animals);
            }
        });
        System.out.println("----------------------------------------------");
        System.out.println(temp.toString());
    }
}
