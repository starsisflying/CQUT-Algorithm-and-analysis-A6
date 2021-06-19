package joker;

import java.util.ArrayList;

public class fun {
    static boolean[] used=new boolean[10];
    static int[][] number=new int[3][3];
    static ArrayList<Integer> append=new ArrayList<Integer>();
    static int flag=0;
    public static void deal() {
            for (int i=0;i<10;++i){//初始化数组
                used[i]=true;
            }
            dfs(0);
        }
      public static void dfs(int step){//深度优先遍历
            if(step==9) {//九个格子都赋值完毕
                if (check() == true) {
                    for (int i = 0; i < 3; ++i) {
                        for (int j = 0; j < 3; ++j) {
                            System.out.print(number[i][j] + " ");
                            append.add(number[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("===========");
                }
            }
            for(int i=1;i<=9;++i){//遍历情况
                if(used[i]==true){
                    used[i]=false;
                    number[step/3][step%3]=i;
                    dfs(step+1);
                    //System.out.println(number[2][2]);
                    used[i]=true;
                }
            }
          //System.out.println(flag);
        }
        public static boolean check() {//检查当前的取值是否符合题目要求(各行各列各对角线)
            int[] sum_i=new int[3];
            for(int i=0;i<3;++i){//初始化数组
                sum_i[i]=0;
                for(int j=0;j<3;++j){//合并各行的值
                    sum_i[i]+=number[i][j];
                }
            }
            if(sum_i[0]!=sum_i[1] || sum_i[1]!=sum_i[2] || sum_i[0]!=sum_i[2]) //检测行方向的值是否符合要求
                return false;

            int[] sum_j=new int[3];
            for(int j=0;j<3;++j){
                sum_j[j]=0;
                for(int i=0;i<3;++i){//合并各列的值
                    sum_j[j]+=number[i][j];
                }
            }
            if(sum_j[0]!=sum_j[1] || sum_j[1]!=sum_j[2] || sum_j[0]!=sum_j[2]) //检测列方向的值是否符合要求
                return false;

            int sum1=number[0][0]+number[1][1]+number[2][2];//正斜线
            if(sum_i[0]!=sum1)
                return false;
            int sum2=number[1][1]+number[0][2]+number[2][0];//副斜线
            if(sum_i[0]!=sum2)
                return false;
            return true;
        }
    }