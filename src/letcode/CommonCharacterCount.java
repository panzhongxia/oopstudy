package letcode;
/**
 * 给定两个字符串，对公共字符串进行计数。
 *
 * 示例
 * 输入 “aabcc” 和 “adcaa” ，输出应该是 3 。两个字符串有三个公共字符，分别是 2 个“a”和 1 个“c”。
 */

import java.util.ArrayList;
import java.util.List;

public class CommonCharacterCount {
    public int commonCharacterCountZFH(String strOne, String strTwo) {
        if(strOne==null || strTwo == null){
            System.out.println(0);
        }
        if(strOne.equals("") || strTwo.equals("")){
            System.out.println(0);
        }
        String max = "";
        String min = "";
        if(strOne.length() < strTwo.length()){
            max = strTwo;
            min = strOne;
        } else{
            max = strTwo;
            min = strOne;
        }
        String current = "";
        int count=0;
        List<String> subrep = new ArrayList<String>();
        for(int i=0; i<min.length(); i++){
            int rep=0;
            for(int begin=0, end=min.length()-i; end<=min.length(); begin++, end++){
                current = min.substring(begin, end);
                if(max.contains(current)){
                    if(!(subrep.contains(current))){
                        subrep.add(current);
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
