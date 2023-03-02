package algorithms;

// There are 100 doors at a closed state and 100 students, the first students changes
// the state of every door, the second student changes the state of every second door,
// the third student changes the state of every third door and so on.... What is the
// state of the doors after every student has his turn to open/close doors.
public class LockerProblem {
    public static void main(String[] args) {
        boolean[] doors = new boolean[100];
        boolean [] vargu=method(doors);
       /* int c=0;
        for (int i = 0; i < doors.length; i=c*(c+2)) {
                doors[i] = !doors[i];
                c++;
        }*/

        for (int i = 0; i < vargu.length; i++) {
            System.out.print(vargu[i] + ", ");
        }
    }

    public static boolean[] method(boolean [] doors){

        int c=0;
        for (int i = 0; i < doors.length; i=c*(c+2)) {
            doors[i] = !doors[i];
            c++;
        }
        return doors;
    }
}
