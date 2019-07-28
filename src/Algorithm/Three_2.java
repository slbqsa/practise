package Algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Three_2{

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String t = sc.nextLine();
            char[] chars = s.toCharArray();
            char[] chart = t.toCharArray();
            //将chart转为Character数组为了使用Comparator进行降序排序
            Character []arr=new Character[chart.length];
            for (int i = 0; i <arr.length; i++) {
                arr[i]=chart[i];
            }
            //排序匹配字符数组
            Arrays.sort(arr, new Comparator<Character>() {
                public int compare(Character o1, Character o2) {
                    return o2-o1;
                }
            });
            for (int i = 0; i < chars.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    if (chars[i] < arr[j]) {
                        chars[i] = arr[j];
                        arr[j]='a';
                        break;
                    }
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
