package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;

public class Four_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] res = str.toCharArray();

        ArrayList<Character> arr = new ArrayList<>();
        arr.add(res[res.length-1]);
        for (int i = res.length-1; i > 0; i--){
            if ( arr.get(arr.size()-1) <= res[i-1]){
                arr.add(res[i-1]);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.size(); i++){
            sb.append(arr.get(i));
        }
        System.out.println(sb.reverse().toString());
    }
}