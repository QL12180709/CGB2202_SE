package io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/**
 * 缓冲字符流
 * java.io.BufferedWriter和BufferedReader
 * 缓冲字符流是一对高级的字符流，作用是块写文本数据加速的。
 *
 * java.io.PrintWriter具有自动行刷新的缓冲字符输出流，内部总是连接BufferedWriter
 * 更常用。
 */
public class PWDemo1 {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        //向文件pw.txt中写入文本数据
        /*
            对文件直接做操作的构造器:
            PrintWriter(String path)
            PrintWriter(File file)

         */
        PrintWriter pw = new PrintWriter("pw.txt", "UTF-8");
        pw.println("让我掉下眼泪的，不是昨夜的酒。");
        pw.println("让我依依不舍得，不是你的温柔。");
        System.out.println("写出完毕!");
        pw.close();
    }
}






