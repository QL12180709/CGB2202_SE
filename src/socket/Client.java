package socket;

import java.io.IOException;
import java.net.Socket;

/*
* 聊天室客户端
*
* */
public class Client {
    /*
    *  java.net.Socket
    *  Socket封装了TCP协议的通讯细节，使用它可以和服务端建立TCP连接，并基于两个流的
    *  读写完成数据交换。
    *
    * */
    private Socket socket;


    /*
    * 构造方法：用于初始化客户端
    * */
    public Client(){
        try {
            /*
            * 实例化Socket时常用的构造方法
            * Socket(String host,int port)
            * 这个构造器实例化Socket的过程就是与服务器建立连接的过程。
            * 参数1：服务器的IP地址
            * 参数2：服务端开启的服务端口
            * 我们通过服务端的IP可以找到网络上服务端所在的计算机。通过端口号可以找到该机器上的
            *该机器上的服务端应用程序从而与之建立连接。
            */
            socket=new Socket("locahost",8080);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
    * 客户端开始的方法
    * */
    public void start(){

    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();

    }
}
