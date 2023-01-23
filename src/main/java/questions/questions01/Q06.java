package questions.questions01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q06 {
    public static void main(String[] args) {

        String str1 = "sweet sweet";
        String str2 = str1.trim().charAt(6) + " " + str1.indexOf("sw",1);
        System.out.println("str2 = " + str2);//str2 = s 6
        int index = str1.indexOf("sw",1);
        System.out.println("index = " + index);
        //str1.indexOf("sw",1) means return the index number of characters "sw" but start to count from 1

        // The indexOf() method is called with the substring "sw" and starting index of 1
        // the indexOf() method searches for the first occurrence of "sw" in the string "sweet sweet" starting from index 1
        // it finds the second occurrence of "sw" in the string "sweet sweet" at index 6
        // so the method returns 6
        //charAt(6) method call returns the character at the specified index of the string which is 's'
        //So the value of `str2` is the concatenation of "s" and "6" which results in "s 6".
/*
        Index	    0	1 	2	3	4	5	6	7	8	9	10
        Character	s	w	e	e	t		s	w	e	e	t
*/

        System.out.println("************************************");

        StringBuilder sb1 = new StringBuilder("Duke");
        String s1 = sb1.toString();
        //code
        String s2 = s1;
        System.out.println(s1 == s2);//true
        // == checks if the objects are equal, not their values

        System.out.println("*****************************");

        LocalDateTime dt = LocalDateTime.of(2023,1,23,3,29);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));//2023-01-23
        dt = dt.plusDays(30).plusMonths(1);
        System.out.println("dt: " + dt);//dt: 2023-03-22T03:29

        System.out.println("******************************");









    }
}









