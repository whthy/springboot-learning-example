package org.spring.springboot.domain;

import jdk.internal.org.objectweb.asm.TypeReference;

import java.io.*;

/**
 * @program: springboot-learning-example
 * @description:
 * @create: 2021-05-28 17:11
 **/
public class IOtest {
    public static void main(String[] args) throws IOException {

        File fl = new File("C:\\Users\\ecidi\\Desktop\\echarts\\微信图片_20210527193605.jpg");
        File fl2 = new File("C:\\Users\\ecidi\\Desktop\\echarts\\微信图片_20210525.jpg");
        FileInputStream fis = new FileInputStream(fl);
        FileOutputStream fos = new FileOutputStream(fl2);
        //创建缓冲区，对输入流进行包装
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
/*        int b;
        while ( (b = bis.read()) != -1) {
            bos.write(b);
            bos.flush();
        }*/
        //关闭输入流缓冲区
//        bis.close();
        //关闭输出流缓存区
//        bos.close();

            byte[] buffer = new byte[1024*1024];
        try {
            int len=0;
            while((len=bis.read(buffer))>0){
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            //
            bos.close();
        }
    }
}
