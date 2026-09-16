  import java.util.concurrent.*;
    import java.util.HashSet.*;

  
  String[] code = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--",
            "-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
        };

        Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                sb.append(code[c - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();