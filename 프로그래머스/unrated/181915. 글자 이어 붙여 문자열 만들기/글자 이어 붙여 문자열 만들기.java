class Solution {
 public String solution(String my_string, int[] index_list) {
        String answer = "";
        String[] my_string_list = my_string.split("");
        for(int i = 0; i<index_list.length;i++){
            answer+=my_string_list[index_list[i]];
        }
        return answer;
    }
}