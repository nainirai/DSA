public boolean isPalindrome(String s) {

        // simple APPROACH using STRINGBUILDER

        //  s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        //   // compare with the reverse of the string
        // StringBuilder sb = new StringBuilder(s);
        // return s.equals(sb.reverse().toString());

        s=s.toLowerCase().replaceAll("[^a-z0-9]","");
        return isPalindromeHelper(s,0,s.length()-1);
    }    

        // Using RECURSION
        public boolean isPalindromeHelper(String s, int l, int r){
            if(l>=r){
                return true;
            }
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            return isPalindromeHelper(s,l+1,r-1);
        }

// s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
// the purpose of this line of code is to convert the string s to lowercase and remove all non-alphanumeric characters 
// (characters that are not lowercase letters or digits) from it. The resulting value of s will be a string with only lowercase letters and digits. Any special characters or uppercase letters in the original s will be eliminated.
// ^ is negation or not 

  //  Java does not support having methods declared inside other methods; methods must be declared directly within the class.
   // therefore isPalindromeHelper method outside the isPalindrome method, 
  // and it should be declared within the same class (the class containing the isPalindrome method).
        
