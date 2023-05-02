package bronze;

import java.util.Scanner;

public class BaekJoon10808 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String s = in.next();

        countAlphabets(s);

    }

    public static void countAlphabets(String str){
        int[] count = new int[26];
        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if('a' <= c && c <= 'z'){
                count[c - 'a']++;
            }
        }

        for(int i=0; i<26; i++){
            System.out.print(count[i] + " ");
        }
    }
}
