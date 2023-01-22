package questions.questions01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q4 {
    public static void main(String[] args) {
        String[] strs = {"A","B"};
        int idx = 0;
        for (String s: strs){
            strs[idx] = strs[idx].concat(" element " + idx);
            //if we do not add strs[idx], loop does not update the array
            //because, arrays are immutable
            idx++;
        }
        for (idx = 0; idx < strs.length; idx++){
            System.out.println(strs[idx]);
        }

        System.out.println(Arrays.toString(strs));

        System.out.println("**********************");
        List<String> stringList = new ArrayList<>(Arrays.asList("A","B"));
        int idxList = 0;
        for (String s: stringList){
            stringList.set(idxList, stringList.get(idxList).concat(" element " + idxList));
            idxList++;
        }
        for (idxList = 0; idxList < stringList.size(); idxList++){
            System.out.print(stringList.get(idxList) + " ");//A element 0 B element 1
        }
        System.out.println();
        System.out.println(stringList);//[A element 0, B element 1]



    }
}
