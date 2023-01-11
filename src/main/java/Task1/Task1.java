package Task1;

import java.util.Arrays;
import java.util.List;

public class Task1 {

    public int countNumbers(String str) {
        if(str == null) return 0;
        char operator = str.charAt(str.length()-1);
        if(operator != '-' && operator != '+') return 0;
        str = str.substring(0,str.length()-1);
        String[] strings = str.split("[\\D]");
        strings = Arrays.stream(strings)
                .filter(s -> (s != null && s.length() > 0))
                .toArray(String[]::new);
        List<Integer> integers = Arrays.stream(strings).map(String::trim).map(Integer::valueOf).toList();
        int result = integers.get(0);
        if(operator == '+'){
            for (int i = 1; i < integers.size(); i++) {
                result+=integers.get(i);
            }
        }else{
            for (int i = 1; i < integers.size(); i++) {
                result-=integers.get(i);
            }
        }
        return result;
    }

}
