package oop.assignment2.ex24.base;

public class Solution24 {
    public static void main(String[] args){
        // read datat
        // do stuff
       //AnagramDetector ad = new AnagramDetector();
       //boolean result = ad.isAnagram(s1, s2);

       //String output = generateOutput(result);

    }

    public static String generateOutput(boolean isAnagram){
        String output;
        if(isAnagram){
            output = "is anagram";
        }else {
            output = "is not anagram";
        }
        return output;
    }
}
