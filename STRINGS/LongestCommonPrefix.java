public String longestCommonPrefix(String[] strs) {
       if (strs == null || strs.length == 0) {
        return "";
    }
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) {
                return "";
            }
        }
    }
    return prefix;
    // TC: O(N*M) where,N is the length of the input array strs 
    // and M is the length of the shortest string in the array.
    // SC: O(1) because it uses only constant extra space to store the prefix string 
    // and the loop index variable. It does not create any additional data structures or arrays.
    
        
    }
