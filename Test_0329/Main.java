package Test_0329;

/*
��Ϸ������
��Ŀ����
��Ϸ�����кܶ��ʽ����������������һ���������ֻ����һ�Σ���������һ����1024��������ID��Χ[1,1024]��
����32��unsigned int��������¼��1024�������Ƿ��Ѿ���ɡ���ʼ״̬����δ��ɡ�
 ����������������������ID����Ҫ���õ�һ��ID������Ϊ�Ѿ���ɣ������ڶ���ID�������Ƿ��Ѿ���ɡ�
  ���һ������������ڶ���ID�������Ѿ�������1�����δ������0�������һ��ڶ���ID����[1,1024]��Χ�������-1��
��������:
�������һ��,����������ʾ����ID.
�������:
����Ƿ����
ʾ��1
����
1024 1024
���
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
�����߷���Ŀ
��Ŀ����
��һ��X*Y������С��Ҫ�ڴ������ϴ����Ͻǵ����½ǣ�ֻ���߸����ֻ�����һ������ߡ������һ���㷨������С���ж������߷�����������������int x,int y���뷵��С�ŵ��߷���Ŀ��
��������:
�������һ�У����Ÿ���������������x��y��ȡֵ��Χ[1,10]��
�������:
�������һ�У�Ϊ�߷�����Ŀ��
ʾ��1
����
3 2
���
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
���С��
��Ŀ����
��һƬ1000*1000�Ĳݵأ�С�׳�ʼվ��(1,1)(�����Ͻǵ�λ��)��С����ÿһ��������������ƶ������ڵĲݵ��ϳԲ�(С�ײ����߳��߽�)�����ɳ�����ȥ��׽�ɰ���С�ף���������n�����塣��i�����屻�����ں�����Ϊxi ��������Ϊyi ��λ���ϣ�С��һ������һ�����壬���ᱻ������׽����Ϊ��ȥ���С�ף���Ҫ֪��С�����ٶ�������ܻ�����һ�����壬�Ӷ���ǰ���С�ס�
��������:
��һ��Ϊһ������n(n �� 1000)����ʾ����һ��ӵ��n�����塣
�ڶ�����n������xi����ʾ��i������ĺ�����
��������n������yi����ʾ��i�������������
��֤���궼�ڲݵط�Χ�ڡ�
�������:
���һ������,��ʾС�����ٿ��ܶ���������볬��������
ʾ��1
����
3
4 6 8
1 2 1
���
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
������
 ��Ŀ����
С��ͬѧѧϰ�˲�ͬ�Ľ���֮��������һЩ������������Ϸ��С��ͬѧ֪�������ճ�������������õ���ʮ�����������ڼ�����У���������Ҳ�ܳ��á����ڶ���һ������x��С��ͬѧ���������������f(x)��g(x)�� f(x)��ʾ��x�������ʮ����д���������λ�ϵ�����֮�͡���f(123)=1+2+3=6�� g(x)��ʾ��x������ö�����д���������λ�ϵ�����֮�͡���123�Ķ����Ʊ�ʾΪ1111011����ô��g(123)=1+1+1+1+0+1+1=6�� С��ͬѧ���ֶ���һЩ������x����f(x)=g(x)��������������Ϊ����������������֪��������0��С�ڵ���n���������ж��ٸ���
��������:
ÿ����������һ����n(n<=100000)
�������:
ÿ���������һ�У�С�ڵ���n��������������
ʾ��1
����
21
���
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