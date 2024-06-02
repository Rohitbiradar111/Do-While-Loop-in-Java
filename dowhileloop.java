//This program shows different do while loop examples in java -

public class dowhileloop {
    public static void main(String args[])
    {
        //Example 1 -
        int number = 1;
        do
        {
            System.out.println(number);
            number++;
        }while(number<=5);

        //Example 2 -
        int i = 0;
        do
        {
            System.out.println("Statement");
            i++;
        }while(i<0);

        //Example 3 -
        int a = 1;
        do 
        {
            System.out.println("DO WHILE LOOP");
            a++;
        }
        while(a<=5);

        //Example 4 -
        int x = 21, sum = 0; 
        do
        {
            sum = sum + x;
            x--;
        }while(x>10);
        System.out.println("Sum = "+sum);

        //Example 5 - 
        int c = 1;
        do
        System.out.println("WITHOUT CURLY BRACKETS");
        while(c>=3);
    }
}