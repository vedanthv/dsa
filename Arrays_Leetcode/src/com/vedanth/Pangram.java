package com.vedanth;

public class Pangram {
        public boolean checkIfPangram(String sentence) {
            String ls="abcdefghijklmnopqrstuvwxyz";
            for(int i=0;i<ls.length();i++){
                if(sentence.indexOf(ls.charAt(i))==-1){
                    return false;
                }

            }
            return true;
        }
    }

