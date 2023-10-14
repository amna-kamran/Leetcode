class Solution {
        public static boolean isSubtractive(char current, char next) {
        String subS = current + "" + next;
        return subS.equals("IV") || subS.equals("IX") || subS.equals("XL") || subS.equals("XC") || subS.equals("CD") || subS.equals("CM");
    }

    public static int getValue(String numeral) {
        switch (numeral) {
            case "I": return 1;
            case "V": return 5;
            case "X": return 10;
            case "L": return 50;
            case "C": return 100;
            case "D": return 500;
            case "M": return 1000;
            case "IV": return 4;
            case "IX": return 9; 
            case "XL": return 40;  
            case "XC": return 90; 
            case "CD": return 400;
            case "CM": return 900; 
            default: return 0;
        }
    }
    public int romanToInt(String s) {
              int num = 0;
       for (int i = 0; i < s.length(); i++) {
           if (i < s.length() - 1 && isSubtractive(s.charAt(i), s.charAt(i + 1))) {
               String subS = s.substring(i, i + 2);
               num += getValue(subS);
               i++; 
           } else {
               num += getValue(s.charAt(i) + "");
           }
       }
       return num;

    }
}