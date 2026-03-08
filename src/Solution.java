class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for (char c : my_string.toCharArray()) {
            if(49 <= (int) c && (int) c <=57){
                answer += (int) c - 48;
            }
        }
        return answer;
    }
}

/*
다른 사용자 답변
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String str = my_string.replaceAll("[^0-9]","");

        for(char ch : str.toCharArray()) {
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }
}*/

/*
재미나이
class Solution {
    public int solution(String myString) {
        return myString.chars().mapToObj(i -> (char) i)
                        .filter(Character::isDigit).map(String::valueOf)
                        .mapToInt(Integer::valueOf)
                        .sum();
    }
}*/
