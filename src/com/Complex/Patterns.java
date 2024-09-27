package com.Complex;

public class Patterns {
    public static void main(String[] args) {
      //  regexPattern("ABABCABABCE");
      //  regexPattern("ABCABC");
    	regexPattern("ABCDABCDE");
      /*
        regexPattern("ABCDABCE");
        regexPattern("ABCABCE");
        regexPattern("AAA");
        regexPattern("AAAA");
        regexPattern("BBB");
        regexPattern("AAAAAA");
        */
    }
    private static void regexPattern(String text) {
       int n = text.length();
       StringBuilder result = new StringBuilder();
       result.append(text.charAt(0));
       int i =1;
       if(n==0)
       {
           return;
       }
       if(n%2 ==0)
       {
           if(text.substring(0,n/2).equals(text.substring(n/2,n)))
           {
               result.append(text.substring((n/2)+1)).append("*");
               System.out.println(result);
               System.out.println(result.length());
               return;
           }
       }
       while(i<n)
       {
           String str = text.substring(0,i);
           //System.out.println(str+":::"+result);
           if(i*2<=n) {
               if (str.equals(text.substring(i, i * 2))) {
                   result.append("*");
                   i *= 2;
               } else {
                   result.append(text.charAt(i));
                   i++;
               }
           }
           else {
               result.append(text.substring(i));
               break;
           }
       }
       System.out.println(result);
       System.out.println(result.length());
    }
}