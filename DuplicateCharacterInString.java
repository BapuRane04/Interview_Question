package Interview_Question;

public class DuplicateCharacterInString {
    public static void main(String[] args) {    
        String s = "programming";    
        int len = s.length();    
        char[] ch = s.toCharArray();    
        System.out.println("Duplicate characters in the given string: ");    
        for(int i = 0; i < len; i++) {    
            for(int j = i + 1; j < len; j++) {    
                if(ch[i] == ch[j]) {    
                    System.out.println(ch[j]);    
                    break;    
                }    
            }    
        }
    }
}
