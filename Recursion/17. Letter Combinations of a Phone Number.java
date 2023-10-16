class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> hm= new HashMap<>();
        List<String> resultList = new ArrayList<>(); 
        
        if(digits == null || digits.length()==0){
             return resultList;
        }  
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");
       
        letter(digits, hm, 0, resultList, new StringBuilder());
        return resultList;
    }
    public static void letter(String digits, HashMap<Character, String> hm, int idx, List<String> resultList, StringBuilder currComb){      
       if(idx==digits.length()){
           resultList.add(currComb.toString());
           return;
       }
        char currDigit = digits.charAt(idx);
        String currletter = hm.get(currDigit);
        if(currletter!=null){
            for(int i=0;i<currletter.length(); i++){
                    
                    currComb.append(currletter.charAt(i));
                    letter(digits, hm, idx+1, resultList, currComb);
                    currComb.deleteCharAt(currComb.length()-1);
          }
        }  
    }   
}
