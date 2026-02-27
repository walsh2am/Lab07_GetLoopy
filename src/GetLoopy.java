public class GetLoopy {
    static void main(String[] args) {
        //Task 1:
        System.out.print("Task 1: ");
        for (int i=0; i<=30; i++)
        {

            System.out.print(" " + i);
        }

        //Task 2:
        System.out.print("\nTask 2: ");
        for (int i=30; i>=0; i--){
            System.out.print(" " + i);
        }

        //Task 3:
        System.out.print("\nTask 3: ");
        for (int i = 0; i<=18; i+=3)
        {
            System.out.print(" " + i);
        }

        //Task 4:
        System.out.print("\nTask 4: ");
        for (int i=10; i>=0; i-=2){
            System.out.print(" " + i);
        }

        //Task 5:
        System.out.println("\nTask 5: ");
        for (int row=0; row <=4; row++)
        {
            //System.out.println("*");
            for (int col = 0; col <= row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Task 6:
        System.out.println("\nTask 6: ");
        for (int row=0; row <=4; row++)
        {
            //System.out.println("*");
            for (int col = 4; col >= row; col--)
            {
                System.out.print("*");
            }
            System.out.println();
        }



        //Task 7:
        System.out.println("\nTask 7: ");
        for (int row=0; row <=4; row++)
        {
            for (int col = 0; col <= 4; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
