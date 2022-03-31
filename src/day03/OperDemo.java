package day03;

public class OperDemo {
    public static void main(String[] args) {
        /*int q=1,w=1;
        q++;
        w++;
        System.out.println(q);
        System.out.println(w);
        int a=5,b=5;
        int c =a++;//1)保存a++的值5  2）a自增1变为6  3）将第一步保存的值5赋给c
        int d=++b;
        System.out.println("a="+a);//6
        System.out.println("b="+b);//6
        System.out.println("c="+c);//5
        System.out.println("d="+d);//6
*//*a++,++a单独运算时都加1
* 参与运算时a++=a , ++a=a+1,但a的值都+1了*/

//        int a= 5,b=10,c=5;
//        boolean b1=a>b&&c++<b;
//        System.out.println("b1="+b1);
//        System.out.println("c="+c);
//        boolean b2=a<b||c++>b;
//        System.out.println("b2="+b2);
//        System.out.println("c="+c);
//        boolean b3=a<b&&c++>a;
//        System.out.println("b3="+b3);
//        System.out.println("c="+c);

        int a=5;
        a=a+10;
        short b = 5;
//        b=b+10;
        b+=10;//+=,-=...自带强转
        b+=10;

        int c=6;
        int d=5;
        int max=c>d?c:d;
        System.out.println(max);


    }
}
