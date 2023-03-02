public interface Staff {
    default boolean kaAsistent(){
        return false;
    }
    default boolean mentoron(){
        return false;
    }
    String ligjeron();

    String toString();
}
