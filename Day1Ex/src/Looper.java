public class Looper {
    public static void main(String [] args)
    {
        DoWhileLoop();
        System.out.print('\n');
        WhileLoop();
        System.out.print('\n');
        ForLoop();

    }

    private static void DoWhileLoop() {
        int i = 0;
        do {    // Print 3 rows
            int j = 1;
            do {    // Print 3 numbers
                int number = (3 * i) + j;
                System.out.print(number + " ");
                j++;
            } while (j <= 3);
            System.out.print('\n');
            i++;
        } while (i < 3);
    }

    private static void WhileLoop() {
        int i = 9;
        while (i > 0)
        {
            int min = i - 3;
            while (i > min)
            {
                System.out.print(i + " ");
                i--;
            }
            System.out.print('\n');
        }
    }

    private static void ForLoop()
    {
        long amount;
        for (int i = 0; i < 16; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                amount = (long)Math.pow(2, (4 * i) + j);
                System.out.print(amount + " ");
            }
            System.out.print('\n');
        }
    }
}
