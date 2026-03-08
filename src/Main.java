//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
  /*Solution sol = new Solution();
  System.out.println(Arrays.toString(sol.solution(new int[] {4, 2, 6, 1, 7, 6}, 3 )));
*/
  String s = "fuck you";
  System.out.println(s);
  for (int i = 0; i < 3; i++){
    s += s.substring(0, 1);
    System.out.println(s);
  }

}
