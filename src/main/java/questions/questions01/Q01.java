package questions.questions01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q01 {
    public static void main(String[] args) {

        //Q1:
        int x = 1;
        int y = 1;
        if (x++ < ++y){// x is still 1, y is 2 ==> true
            System.out.println("hello");
        }else {
            System.out.println("welcome");
        }
        System.out.println("log " + x + " : " + y );//log 2:2 ==> x is used again so x becomes 2

        System.out.println("**********************************");

        //Q2:
        int i = 10;
        int j = 20;
        int k = (j += i)/5;  // k = 30/5 = 6
        //(j =j+i) = (j = 30) in parentheses j is equalized to 30
        System.out.println(i + " : " + j +  " : " + k);


        System.out.println("********************************");
        //Q3:

        String date = LocalDate.parse("2023-01-22").format(DateTimeFormatter.ISO_DATE);
        System.out.println(date);//2023-01-22
        /*
        The "ISO-like date-time formatter" that formats or parses a date-time with the offset and zone if available,
        such as '2011-12-03T10:15:30', '2011-12-03T10:15:30+01:00' or '2011-12-03T10:15:30+01:00[Europe/Paris]'.
        This returns an immutable formatter capable of formatting and
        parsing the ISO-8601 extended local or offset date-time format,
        as well as the extended non-ISO form specifying the time-zone.
         */

        /*
        "LocalDate" is an immutable date-time object that represents a date,
        often viewed as year-month-day. Other date fields, such as day-of-year,
        day-of-week and week-of-year, can also be accessed.
        For example, the value "2nd October 2007" can be stored in a LocalDate.
         */
        /*
        "parse() method" obtains an instance of LocalDate from a text string such as 2007-12-03.
         */

        System.out.println("******************************");

        //Q4:

        int[] stack = {10,20,30};
        int size = stack.length;
        System.out.println("size "+ size);
        int idx = 0;
        // line n1
        do{
            idx++;
        } while(idx <size-1);
        System.out.println("the top element: " + stack[idx]);// the top element: 30











    }
}
