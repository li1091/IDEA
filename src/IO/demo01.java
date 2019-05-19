package IO;

import java.io.*;

public class demo01 {
    public static void main(String[] args){
        File file=new File("F:\\IDEA");
        File[] list=file.listFiles();
        int level=0;
        //sore(list,level);
        //copy("F:\\test\\4.4CustomerList测试.mp4","F:\\test\\copy.mp4");
        charIo("F:\\test\\i.txt","F:\\test\\o.txt");

    }
    //字符IO流，COPY文件
    private static void charIo(String i,String o){
        try {
                FileInputStream f=new FileInputStream(i);
                FileOutputStream out=new FileOutputStream(o);
                Reader reader=new InputStreamReader(f);
                Writer writer = new OutputStreamWriter(out,"utf-16");
                char[] chars = new char[10];
                int len = -1;
                while ((len = reader.read(chars)) != -1) {
                    writer.write(chars, 0, len);
                }
                close(reader, writer);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //字节流复制文件
    private static void copy(String file,String outfile){
        try {
            InputStream in=new FileInputStream(new File(file));
            OutputStream out=new FileOutputStream(new File(outfile));
            byte[] bytes=new byte[1024];
            int len=-1;
            while ((len=in.read(bytes)) !=-1){
                out.write(bytes,0,len);
            }

            in.close();
            out.close();
            System.out.println("复制成功");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //目录遍历
    private static void sore(File[] li,int level){
        for(File f:li){
            for (int i=0;i<level;i++){
                System.out.print("-");
            }
            if (f.isDirectory()){
                System.out.println(f);
                sore(f.listFiles(),level+1);
            }else {
                System.out.println(f);
            }
        }
    }

    public static void close(Closeable... clo){
        for(Closeable c:clo){
            try {
                c.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
