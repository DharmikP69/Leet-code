import java.util.HashSet;

public class LC2351 {
    public static char repeatedCharacter(String s) {
        HashSet<Character> map = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(map.contains(s.charAt(i))){
                return ch;
            }

            map.add(ch);
        }
        return ' ';
    }
    public static void main(String[] args) {
        String s = "abccbaacz";
        
        System.out.println(repeatedCharacter(s));
    }
}
