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

    /**
     * @param nums an array of ints
     * 
     * @return number of even ints in array
     */
    public static int countEvens(int[] nums) 
    {
        int evens = 0;
        for (int val : nums)
        {
            if (val % 2 == 0)
            {
                evens++;
            }
        }
        return evens;
    }

    /**
     * @param nums an array of ints
     * 
     * @return difference between largest and smallest values (range)
     */
    public static int bigDiff(int[] nums) 
    {
        int smallestNum = nums[0];
        int largestNum = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] < smallestNum)
            {
                smallestNum = nums[i];
            }
            else if (nums[i] > largestNum)
            {
                largestNum = nums[i];
            }
        }
        return largestNum - smallestNum;
    }

    /**
     * @param nums an array of ints
     * 
     * @return "centered" average
     * Ignore largest and smallest values but only once 
     */
    public static int centeredAverage(int[] nums)
    {
        int smallestNum = nums[0];
        int largestNum = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            if (nums[i] < smallestNum)
            {
                smallestNum = nums[i];
            }
            else if (nums[i] > largestNum)
            {
            largestNum = nums[i];
            }
        }

        int sum = 0;

        boolean smallIgnored = false;
        boolean largeIgnored = false;

        int arrLength = nums.length;

        for (int val : nums)
        {
            if (!smallIgnored && val == smallestNum)
            {
                smallIgnored = true;
                arrLength--;
            }

            else if (!largeIgnored && val == largestNum)
            {
                largeIgnored = true;
                arrLength--;
            }

            else 
            {
                sum += val;
            }
        }
        return sum / arrLength;
    }

    /**
     * @param nums
     * 
     * @return sum of ints in array
     * Ignore ints equal to 13 and ones right after them
     */
    public static int sum13(int[] nums) 
    {
        int sum = 0;
      
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 13)
            {
                i++;
            }
            else 
            {
                sum += nums[i];
            }
        }
        return sum;
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

    //test methods here
    public static void main(String[] args)
    {
        //countEvens()
        newQuestion();
        int[] a1 = {2, 1, 2, 3, 4};
        int[] b1 = {2, 2, 0};
        int[] c1 = {1, 3, 5};
        System.out.println(countEvens(a1));
        System.out.println(countEvens(b1));
        System.out.println(countEvens(c1));
        endQuestion();

        //bigDiff()
        newQuestion();
        int[] a2 = {10, 3, 5, 6};
        int[] b2 = {7, 2, 10, 9};
        int[] c2 = {2, 10, 7, 2};
        System.out.println(bigDiff(a2));
        System.out.println(bigDiff(b2));
        System.out.println(bigDiff(c2));
        endQuestion();

        //centeredAverage()
        newQuestion();
        int[] a3 = {1, 2, 3, 4, 100};
        int[] b3 = {1, 1, 5, 5, 10, 8, 7};
        int[] c3 = {-10, -4, -2, -4, -2, 0};
        System.out.println(centeredAverage(a3));
        System.out.println(centeredAverage(b3));
        System.out.println(centeredAverage(c3));
        endQuestion();

        //sum13()
        newQuestion();
        int[] a4 = {1, 2, 2, 1};
        int[] b4 = {1, 1};
        int[] c4 = {1, 2, 2, 1, 13};
        System.out.println(sum13(a4));
        System.out.println(sum13(b4));
        System.out.println(sum13(c4));
        endQuestion();

        //sum67()
        newQuestion();
        int[] a5 = {1, 2, 2};
        int[] b5 = {1, 2, 2, 6, 99, 99, 7};
        int[] c5 = {1, 1, 6, 7, 2};
        System.out.println(sum67(a5));
        System.out.println(sum67(b5));
        System.out.println(sum67(c5));
        endQuestion();
    }
}
