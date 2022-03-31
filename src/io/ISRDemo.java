package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * 转换流
 * 测试读取文本数据
 */
public class ISRDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("osw.txt");
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        /*
            字符流的:
            int read()
            读取1个字符，将对应的char值存入返回的int值的“低16位”上
            00000000 00000000 10101010 10101010
            如果返回的int值为-1，表示读取到了末尾


            osw
            00111100 unicode英文

            00111100 11001100 unicode中文

            UTF-8英文1字节，2进制一定是0开始

            d = isr.read()
            00111100 11100011 10110011 10001100
            ^^^^^^^^

            d:00000000 00000000 00000000 00111100

            d = isr.read()
            00111100 11100011 10110011 10001100
                     ^^^^^^^^ ^^^^^^^^ ^^^^^^^^
                     00111100 11001100
            d:00000000 00000000 00111100 11001100
         */
        int d;
        while((d = isr.read()) != -1) {
            System.out.print((char) d);
        }
        isr.close();

    }
}
