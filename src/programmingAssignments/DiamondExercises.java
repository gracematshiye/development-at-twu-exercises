package programmingAssignments;

public class DiamondExercises {
    public static void main(String[] args){

        //Isosceles Triangle
        int n = 3;
        for(int i=1; i<=n; i++) {

            for(int j=2; j>=i; j--)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        System.out.println("\n");

        //Diamond
        for(int i=1; i<=n; i++) {

            for(int j=2; j>=i; j--)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }

            System.out.println("");
        }

        for(int i=n; i>=1; i--) {

            for(int j=3; j>i; j--)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=(2*i); k++) {
                System.out.print("*");
            }

            System.out.println("");
        }



    }
}
