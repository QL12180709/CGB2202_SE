package socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/*
 * 聊天室客户端
 *
 * */
public class Client {
    /*0.0000000000000000000000000000000000000000000000000000000000000000000
     *  java.net.Socket
     *  Socket封装了TCP协议的通讯细节，使用它可以和服务端建立TCP连接，并基于两个流的
     *  读写完成数据交换。
     *
     * */
    private Socket socket;


    /*
     * 构造方法：用于初始化客户端
     * */
    public Client() {
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

//            本机IP地址：localhost
            System.out.println("正在连接服务端...");
            socket = new Socket("10.1.188.86", 8088);
//            socket = new Socket("10.1.188.98", 8088);
//            socket = new Socket("10.1.188.103", 8080);
            System.out.println("与服务端建立连接了！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 客户端开始的方法
     * */
    public void start() {
        try {
            OutputStream out = socket.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(out, StandardCharsets.UTF_8);//转换流
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, true);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                String s = scanner.nextLine();
                if ("exit".equalsIgnoreCase(s)) {
                    break;
                }
                pw.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                /*
                * Socket提供了close()方法，可以与远端计算机断开连接。
                * 该方法调用时，也会自动关闭通过它获取的输入流和输出流。
                * */
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.start();
    }
}
