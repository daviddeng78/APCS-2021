public class Array_2
{
    private static int questionCount = 1;

    public static void newQuestion()
    {
        System.out.println("QUESTION " + questionCount + "\n====================");
        questionCount++;
    }

    public static void endQuestion()
    {
        System.out.println("====================\n");
    }

    //test methods here
    public static void main(String[] args)
    {
        
    }

    /**
     * @param nums an array of ints
     * 
     * @return sum of ints in array
     * Ignore sections starting from 6 and ending at 7
     */
    public static int sum67(int[] nums) 
    {
        int sum = 0;
        boolean Ignore = false;
      
        for (int val : nums)
        {
            if (val == 6)
            {
                Ignore = true;
            }
            else if (val == 7)
            {
                if (Ignore == false)
                {
                    sum += val;
                }
                else 
                {
                    Ignore = false;
                }
            }
            else if (Ignore)
            {
                continue;
            }
            else 
            {
                sum += val;
            }
        }
        return sum;
    }
}