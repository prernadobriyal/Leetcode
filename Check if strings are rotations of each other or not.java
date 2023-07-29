class Solution{
    //Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2 ){
        // Your code here
        if(s1.length()!=s2.length())    return false;
        // int n=s1.length();
        int n=s1.length();
        for(int i=0; i<n; i++){
            if(s1.equals(s2))   return true;
            s2 = s2.substring(1)+s2.charAt(0);
        }
        return false;
    }
}
