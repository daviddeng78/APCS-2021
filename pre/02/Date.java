public class Date 
{
        public static void main(String[] args)
        {
            String day = "Monday";
            int date = 16;
            String month = "August";
            int year = 2021;

            System.out.println(day);
            System.out.println(month);
            System.out.println(date);
            System.out.println(year);

            /**
             * American Format
             */
            System.out.println();
            System.out.println("American Format:");
            System.out.print(day + ", ");
            System.out.print(month + " ");
            System.out.print(date + ", ");
            System.out.println(year);

            /**
             * European Format
             */
            System.out.println();
            System.out.println("European Format:");
            System.out.print(day + " ");
            System.out.print(date + " ");
            System.out.print(month + " ");
            System.out.println(year);
        }
}
