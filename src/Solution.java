import java.util.ArrayList;

public class Solution {
    public int[] solution(int[] num_list){
        ArrayList<Integer> array = new ArrayList<>();


        for (int i : num_list) {
            array.add(i);
        }

        int last = num_list[num_list.length - 1];
        int plast = num_list[num_list.length - 2];

        if(last > plast) array.add(last - plast);
        else array.add(last * 2);

        int[] answer = array.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }


}