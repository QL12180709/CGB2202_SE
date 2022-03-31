package ooday01;

public class OverLoadDeno {
    public static void main(String[] args) {
        System.out.println(-12%-5);
        Aoo o = new Aoo();
        o.show();
        o.show("ll");
        o.show("ll",25);
        o.show(25,"kk");

       /* byte b1=1,b2=2,b3,b6,b8;
        final byte b4=4,b5=6,b7;
        b3=(b1+b2);  *//*语句1*//*
        b6=b4+b5;    *//*语句2*//*
        b8=(b1+b4);  *//*语句3*//*
        b7=(b2+b5);  *//*语句4*//*
        System.out.println(b3+b6);*/
    }
}
