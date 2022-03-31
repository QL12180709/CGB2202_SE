package io;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * 自行完成流连接创建PrintWriter
 *
 * 简易记事本工具
 * 程序启动后，将用户在控制台上输入的每一行字符串都按行写入到文件note.txt中
 * 单独输入exit时，程序退出。
 *
 */
public class PWDemo2 {
    public static void main(String[] args) throws FileNotFoundException {
        //创建文件流时可以使用追加模式
        FileOutputStream fos = new FileOutputStream("pw2.txt",true);
        //创建转换流时指定字符集
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        BufferedWriter bw = new BufferedWriter(osw);
        /*
            PrintWriter提供的构造方法中如果第一个参数是一个流，那么就可以再传入
            一个boolean值的参数用于指定是否打开自动行刷新功能(默认是false不打开)
            当该值为true时就打开了自动行刷新功能。
            每当我们调用println方法写出一行字符串后就会自动flush一次。
         */
        PrintWriter pw = new PrintWriter(bw,true);

        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            if("exit".equalsIgnoreCase(line)){
//            if("exit".equals(line)){
                break;
            }
            pw.println(line);
        }
        System.out.println("再见！");
        pw.close();
    }
}
