package com.digital;


import java.util.ArrayList;
import java.util.List;

public class CodingBat {

    public boolean scoresIncreasing(int[] scores) {
        boolean res = false;
        for(int i = 0; i < scores.length-1; i++){
            if(scores[i] <= scores[i+1]){
                res = true;
            }else{
                return false;
            }
        }
        return res;
    }

    public boolean scores100(int[] scores) {
        boolean res = false;
        for(int i = 0; i < scores.length-1; i++){
            if(scores[i] == 100 && scores[i+1] == 100){
                res = true;
            }
        }
        return res;
    }

    public boolean scoresClump(int[] scores) {

        for(int i = 0; i < scores.length-2; i++){
            if(scores[i+1] - scores[i] <= 2 && scores[i+2] - scores[i] <= 2 ){
                return  true;
            }
        }
        return false;
    }


    public int wordsCount(String[] words, int len) {
        int count = 0;

        for(int i = 0; i < words.length; i++) {
            if(words[i].length() == len) {
                count++;
            }
        }
        return count;
    }

    public String[] wordsFront(String[] words, int n) {
        String [] str = new String[n];
        for(int i = 0; i < n; i++) {
            str[i] = words[i];
        }

        return str;
    }

    public List wordsWithoutList(String[] words, int len) {

        ArrayList<String> word = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].length() == len) {

            } else {
                word.add(words[i]);
            }
        }
        return word;
    }

    public boolean hasOne(int n) {
        String num = Integer.toString(n);
        return num.contains("1");
    }

    public boolean dividesSelf(int n) {

        String val = String.valueOf(n);

        for (int i=0; i<val.length(); i++) {

            if (val.substring(i, i+1).equals("0"))

                return false;

            else if (n%Integer.valueOf(val.substring(i, i+1))!=0)

                return false;
        }
        return true;
    }


    public int[] copyEvens(int[] nums, int count) {

        int[] nums2 = new int[count];
        int evens = 0;

        for(int i = 0; i < nums.length && evens < count; i++){
            if(nums[i] % 2 == 0){
                nums2[evens] = nums[i];
                evens++;
            }
        }
        return nums2;
    }

    public int matchUp(String[] a, String[] b) {

        int count = 0;

        for(int i = 0; i < a.length; i++){

            if(a[i].length() != 0 && b[i].length() != 0)

                if(a[i].substring(0,1).equals(b[i].substring(0,1))){
                    count++;
                }
        }
        return count;
    }

    public int scoreUp(String[] key, String[] answers) {
        int count = 0;

        for(int i = 0; i<key.length;i++){

            if(key[i] == answers[i]){

                count+=4;
            }
            else if(answers[i].equals("?")){
                count+=0;
            }
            else if(key[i]!=answers[i]){

                count-=1;
            }
        }return count;
    }

    public String[] wordsWithout(String[] words, String target) {
        int count = 0;

        for(int i = 0; i <words.length;i++){

            if(words[i].equals(target)){

                count++;
            }
        }
        String [] array = new String[words.length-count];

        int count2 = 0;
        for(int i = 0; i<words.length;i++){

            if(!(words[i].equals(target))){

                array[count2] = words[i];
                count2++;

            }
        }
        return array;
    }


    public int scoresSpecial(int[] a, int[] b) {
        int largest = 0;
        int largest2 = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 10 == 0){
                largest = Math.max(largest, a[i]);
            }
        }
        for(int i = 0; i < b.length; i++){
            if(b[i] % 10 == 0){
                largest2 = Math.max(largest2, b[i]);
            }
        }
        return largest + largest2;
    }





}
