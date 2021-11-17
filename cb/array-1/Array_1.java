public class Array_1
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

    public static String arrToString(int[] a)
    {
        String result = "{";
        for (int i = 0; i < a.length; i++)
        {
            result += a[i];
            if (i - a.length != -1)
            {
                result += ", ";
            }
        }
        return result + "}";
    }

    /**
     * @param nums an array of ints
     * The array will be length 1 or more.
     * 
     * @return true if 6 appears as either the first or last element in the array.
     */
    public static boolean firstLast6(int[] nums)
    {
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    /**
     * @param nums an array of ints
     * 
     * @return true if the array is length 1 or more, and the first element and the last element are equal.
     */
    public static boolean sameFirstLast(int[] nums)
    {
        return (nums.length >= 1 && nums[0] == nums[nums.length - 1]);
    }

    /**
     * @param none
     * 
     * @return intArray length 3 containing first 3 digits of pi (3.14)
     */
    public static int[] makePi()
    {
        int[] pi = {3, 1, 4};
        return pi;
    }

    /**
     * @param a first array
     * @param b second array
     * Both arrays will be length 1 or more.
     * 
     * @return true if they have the same first element or they have the same last element
     */
    public static boolean commonEnd(int[] a, int[] b)
    {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }

    /**
     * @param nums an array of ints
     * The array will be of length 3
     * 
     * @return sum of ints
     */
    public static int sum3(int[] nums)
    {
        int sum = 0;
        for (int val : nums)
        {
            sum += val;
        }
        return sum;
    }

    /**
     * @param nums an array of ints
     * The array will be of length 3
     * 
     * @return an array with the elements "rotated left" (e.x. {1, 2, 3} --> {2, 3, 1})
     */
    public static int[] rotateLeft3(int[] nums)
    {
        int[] rotatedLeft = new int[nums.length];
        rotatedLeft[rotatedLeft.length - 1] = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            rotatedLeft[i - 1] = nums[i];
        }
        return rotatedLeft;
    }

    /**
     * @param nums an array of ints
     * The array will be of length 3
     * 
     * @return a new array with elements in reverse order
     */
    public static int[] reverse3(int[] nums)
    {
        int[] reversed = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--)
        {
            reversed[reversed.length - 1 - i] = nums[i];
        }
        return reversed;
    }

    //test methods here
    public static void main(String[] args)
    {
        //firstLast6()
        newQuestion();
        int[] a1 = {1, 2, 6};
        int[] b1 = {6, 1, 2, 3};
        int[] c1 = {13, 6, 1, 2, 3};
        System.out.println(firstLast6(a1));
        System.out.println(firstLast6(b1));
        System.out.println(firstLast6(c1));
        endQuestion();

        //sameFirstLast()
        newQuestion();
        int[] a2 = {1, 2, 3};
        int[] b2 = {1, 2, 3, 1};
        int[] c2 = {1, 2, 1};
        System.out.println(sameFirstLast(a2));
        System.out.println(sameFirstLast(b2));
        System.out.println(sameFirstLast(c2));
        endQuestion();

        //makePi()
        newQuestion();
        System.out.println(arrToString(makePi()));
        endQuestion();

        //commonEnd()
        newQuestion();
        int[] a4 = {1, 2, 3};
        int[] b40 = {7, 3};
        int[] b41 = {7, 3, 2};
        int[] b42 = {1, 3};
        System.out.println(commonEnd(a4, b40));
        System.out.println(commonEnd(a4, b41));
        System.out.println(commonEnd(a4, b42));
        endQuestion();
        
        //sum3()
        newQuestion();
        int[] a5 = {1, 2, 3};
        int[] b5 = {5, 11, 2};
        int[] c5 = {7, 0, 0};
        System.out.println(sum3(a5));
        System.out.println(sum3(b5));
        System.out.println(sum3(c5));
        endQuestion();

        //rotateLeft3()
        newQuestion();
        int[] a6 = {1, 2, 3};
        int[] b6 = {5, 11, 9};
        int[] c6 = {7, 0, 0};
        System.out.println(arrToString(rotateLeft3(a6)));
        System.out.println(arrToString(rotateLeft3(b6)));
        System.out.println(arrToString(rotateLeft3(c6)));
        endQuestion();

        //reverse3()
        newQuestion();
        int[] a7 = {1, 2, 3};
        int[] b7 = {5, 11, 9};
        int[] c7 = {7, 0, 0};
        System.out.println(arrToString(reverse3(a7)));
        System.out.println(arrToString(reverse3(b7)));
        System.out.println(arrToString(reverse3(c7)));
        endQuestion();
    }
}