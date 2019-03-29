package Test_0329;

/*
游戏任务标记
题目描述
游戏里面有很多各式各样的任务，其中有一种任务玩家只能做一次，这类任务一共有1024个，任务ID范围[1,1024]。
请用32个unsigned int类型来记录着1024个任务是否已经完成。初始状态都是未完成。
 输入两个参数，都是任务ID，需要设置第一个ID的任务为已经完成；并检查第二个ID的任务是否已经完成。
  输出一个参数，如果第二个ID的任务已经完成输出1，如果未完成输出0。如果第一或第二个ID不在[1,1024]范围，则输出-1。
输入描述:
输入包括一行,两个整数表示人物ID.
输出描述:
输出是否完成
示例1
输入
1024 1024
输出
1
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        System.out.println(taskFlag());
//    }
//    public static int taskFlag(){
//        Scanner sc = new Scanner(System.in);
//        int ID1 = sc.nextInt();
//        int ID2 = sc.nextInt();
//        if(ID1<1 || ID1>1024 ||ID2<1||ID2>1024){
//            return -1;
//        }
//        if(ID1 == ID2){
//            return 1;
//        }else{
//            return 0;
//        }
//    }
//}
/*
网格走法数目
题目描述
有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。请设计一个算法，计算小团有多少种走法。给定两个正整数int x,int y，请返回小团的走法数目。
输入描述:
输入包括一行，逗号隔开的两个正整数x和y，取值范围[1,10]。
输出描述:
输出包括一行，为走法的数目。
示例1
输入
3 2
输出
10
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        System.out.println(solution());
//    }
//    public static int solution(){
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        int[][]grids = new int[x+1][y+1];
//        for(int i=0; i<=x; i++){
//            for(int j=0; j<=y; j++){
//                if(i==0 || j==0){
//                    grids[i][j] = 1;
//                }else{
//                    grids[i][j] =  grids[i][j-1]+ grids[i-1][j];
//                }
//            }
//        }
//        return grids[x][y];
//    }
//}
/*
解救小易
题目描述
有一片1000*1000的草地，小易初始站在(1,1)(最左上角的位置)。小易在每一秒会横向或者纵向移动到相邻的草地上吃草(小易不会走出边界)。大反派超超想去捕捉可爱的小易，他手里有n个陷阱。第i个陷阱被安置在横坐标为xi ，纵坐标为yi 的位置上，小易一旦走入一个陷阱，将会被超超捕捉。你为了去解救小易，需要知道小易最少多少秒可能会走入一个陷阱，从而提前解救小易。
输入描述:
第一行为一个整数n(n ≤ 1000)，表示超超一共拥有n个陷阱。
第二行有n个整数xi，表示第i个陷阱的横坐标
第三行有n个整数yi，表示第i个陷阱的纵坐标
保证坐标都在草地范围内。
输出描述:
输出一个整数,表示小易最少可能多少秒就落入超超的陷阱
示例1
输入
3
4 6 8
1 2 1
输出
3
 */
//import java.util.Scanner;
//public class Main{
//    public static void main(String[] args){
//        System.out.println(solution());
//    }
//    public static int solution(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] xi = new int[n];
//        int[] yi = new int[n];
//        for(int i =0; i<n; i++){
//            xi[i] = sc.nextInt();
//        }
//        for(int i =0; i<n; i++){
//            yi[i] = sc.nextInt();
//        }
//        int min = 2000;
//        for(int i=0; i<n; i++){
//            int d = xi[i] + yi[i]-2;
//            if(min > d){
//                min = d;
//            }
//        }
//        return min;
//    }
//}
/*
幸运数
 题目描述
小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。小明同学知道，在日常生活中我们最常用的是十进制数，而在计算机中，二进制数也很常用。现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。 f(x)表示把x这个数用十进制写出后各个数位上的数字之和。如f(123)=1+2+3=6。 g(x)表示把x这个数用二进制写出后各个数位上的数字之和。如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，现在他想知道，大于0且小于等于n的幸运数有多少个？
输入描述:
每组数据输入一个数n(n<=100000)
输出描述:
每组数据输出一行，小于等于n的幸运数个数。
示例1
输入
21
输出
3
 */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println(lucklyNum());
    }
    public static int lucklyNum(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for(int i=1; i<=n; i++){
            int a10 = 0;
            int t = i;
            while(t!=0){
                a10 += t%10;
                t /= 10;
            }
            int a2 = 0;
            t = i;
            for(int j=0; j<17; j++){
                if(((t>>j) & 1) == 1){
                    a2++;
                }
            }
            if(a2 == a10){
                c++;
            }
        }
        return c;
    }
}