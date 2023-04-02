TC:O(n^2)  & SC:O(n) 

public String removeConsecutiveCharacter(String S){
        String str="";
        str+=S.charAt(0);
        for(int i=1;i<S.length();i++){
            if(S.charAt(i)!=S.charAt(i-1)){
               str+=S.charAt(i);
            }
        }
        return str;
    }

//optimized solution: 
//TC:O(n)  & SC:O(n) 

//public String removeConsecutiveCharacter(String S){

 // USING STRING BUILDER
 
    // using string builder 
    //  if (str == null || str.length() == 0) {
    //     return str; // return null or empty string as is
    // }
    
    // StringBuilder sb = new StringBuilder();
    // char prevChar = str.charAt(0);
    // sb.append(prevChar);
    
    // for (int i = 1; i < str.length(); i++) {
    //     char currChar = str.charAt(i);
    //     if (currChar != prevChar) {
    //         sb.append(currChar);
    //         prevChar = currChar;
    //     }
    // }
    
    // return sb.toString();
    
// USING HASHMAP
    
//   if (str == null || str.length() == 0) {
//         return str; // return null or empty string as is
//     }
    
//     Map<Character, Integer> map = new HashMap<>();
//     StringBuilder sb = new StringBuilder();
    
//     for (int i = 0; i < str.length(); i++) {
//         char currChar = str.charAt(i);
//         if (!map.containsKey(currChar)) {
//             sb.append(currChar);
//             map.put(currChar, 1);
//         }
//     } 
    
    // return sb.toString();
    
//USING HASHSET
    
    // if (str == null || str.length() == 0) {
    //     return str; // return null or empty string as is
    // }
    
    // Set<Character> set = new HashSet<>();
    // StringBuilder sb = new StringBuilder();
    
    // for (int i = 0; i < str.length(); i++) {
    //     char currChar = str.charAt(i);
    //     if (!set.contains(currChar)) {
    //         sb.append(currChar);
    //         set.add(currChar);
    //     }
    // }
    
    // return sb.toString();
}

//}
