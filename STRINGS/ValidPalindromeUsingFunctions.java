public boolean isPalindrome(String s) {
         s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
          // compare with the reverse of the string
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
        }
        
