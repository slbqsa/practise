package DiSanzhou;
import java.util.*;

public class Third_6 {

      public static class Bear {
             int zhandouli;
             int jiezhi;
          }
          public Bear(int zhandouli,int jiezhi){
          this.zhandouli  = zhandouli;
          this.jiezhi = jiezhi;
      }
}
    public static class descComparator implements Comparable<Third_6.Bear>, Comparator<T> {
        public int compare(Third_6.Bear b1, Third_6.Bear b2) {
            return b1.zhandouli != b2.zhandouli ? b2.zhandouli - b1.zhandouli : b1.jiezhi - b2.jiezhi;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Third_6.Bear[] bears = new Third_6.Bear[n];
        int [] sweet = new int [m];
        for(int i = 0;i<m;i++){
            sweet[i] = sc.nextInt();
        }
        HashMap<Integer, Third_6.Bear> map  = new HashMap<>();
        for (int i = 0;i<n;i++){
            int zhanduoli = sc.nextInt();
            int jiezhi = sc.nextInt();
            bears[i] = new Third_6.Bear(zhanduoli,jiezhi);
            map.put(i,bears[i]);
        }
        Arrays.sort(bears,new descComparator());
        Arrays.sort(sweet);

        for (int i = 0;i<n;i++)
        {
            for(int j = m;j>=0;j--){
                if(sweet[j] != -1 && bears[i].jiezhi-sweet[j]>=0){
                    bears[i].jiezhi -= sweet[j];
                    sweet[j] = -1;
                }
            }
        }
        for (int i = 0;i<n;i++){
            System.out.println(map.get(i).jiezhi);
        }

    }
}
     /**


    public static class Bear {
        int attack; //战斗力
        int hungry; //饥饿值

        public Bear(int attack, int hungry) {
            this.attack = attack;
            this.hungry = hungry;
        }
    }

    //比较器，按战斗力逆序排行
    public static class descComparator implements Comparator<Bear> {
        public int compare(Bear p1, Bear p2) {
            return p1.attack != p2.attack ? p2.attack - p1.attack : p1.hungry - p2.hungry;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Bear[] pandas = new Bear[n];
        int[] sugar = new int[m];
        for (int i = 0; i < m; i++) {
            sugar[i] = sc.nextInt();
        }
        //用哈希表保证最终结果能够不被排序打乱
        HashMap<Integer, Bear> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int attack = sc.nextInt();
            int hungry = sc.nextInt();
            pandas[i] = new Bear(attack, hungry);
            map.put(i, pandas[i]);
        }

        //按战斗力排序熊类数组
        Arrays.sort(pandas, new descComparator());
        //按糖给的能量排序糖类数组
        Arrays.sort(sugar);

        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (sugar[j] != -1 && pandas[i].hungry - sugar[j] >= 0) {
                    pandas[i].hungry -= sugar[j];
                    sugar[j] = -1; //吃完糖将其置为-1
                }
            }
        }
        //打印结果
        for (int i = 0; i < n; i++) {
            System.out.println(map.get(i).hungry);
        }
    }

}
**/