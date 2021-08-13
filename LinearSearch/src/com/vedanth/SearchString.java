package com.vedanth;

public class SearchString {
    public static void main(String[] args) {
        String name = "abcde";
        char target = 'b';
        System.out.println(search(name, target));

        System.out.println(name.toCharArray());
    }
    static boolean search2(String str, char target){
        if(str.length() == 0)
        {
            return false;
        }
        for(char ch : str.toCharArray()) {
            if(ch == target)
            {
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target){
        if(str.length() == 0)
        {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}

