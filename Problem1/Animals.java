public class Animals {
    private String name; //read only
    private int age;
    private boolean isVaccinated;

    public Animals(String name, int age, boolean isVaccinated) {
        this.name = name;
        this.age = age;
        this.isVaccinated = isVaccinated;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    @Override
    public String toString() {
        return "Animal: "+name+" is "+age+" old and is "+(isVaccinated?"":"not ")+"vaccinated!";
    }
}
