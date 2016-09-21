package programmingAssignments;


public class TriangleExercises {

    public static void main (String[] arg){
        System.out.println("*"); //Print one asterisk to the console.
        System.out.println();

        int horizontal = 8;
        for (int i = 0; i < horizontal; i++) {
            System.out.print("*");
        }

        System.out.println("\n");
        int vertical = 3;
        for (int i = 0; i < vertical; i++) {
            System.out.println("*");
        }

        System.out.println("\n");
        int rightTriangle = 3;
        for (int i = 1; i <= rightTriangle; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
