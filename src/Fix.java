public class Fix {
    public static void main(String[] args) {


        ////1.Create an array to hold the numbers 1-10.
        //fixed array declaration and initialization
        int[] numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //fixed missing declaration of i
        for (int i = 0; i < 10; i++) {
            System.out.println(numList[i]); //fixed must print array through iteration
        }


////2.Loop through that array and sum the numbers 1-10, then print that total to the screen.


        //fixed numList already declared and initialized
//        numList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int total = 0;
        for (int i = 0; i < 10; i++) {
            total = total + numList[i]; //fixed add values of numList to total one by one
        }
        System.out.println("The total of the numbers is " + total);


    }
}
