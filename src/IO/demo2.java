package IO;

import java.io.*;

//文件夹复制
public class demo2 {
    public static void main(String[] args){
        try {
            copy(new File("F:\\新建文件夹 (2)"),new File("f:\\test"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(File file,File flle2) throws IOException {
        if (!flle2.exists()){
            flle2.mkdirs();
        }
        File[] files=file.listFiles();
        for (File f:files){
            if (f.isDirectory()){
                copy(new File(file+"/"+f.getName()),new File(flle2+"/"+f.getName()));
            }else {
                copyfile(new File(file+"/"+f.getName()),new File(flle2+"/"+f.getName()));
            }
        }

    }

    private static void copyfile(File file,File file2){
        try {
            InputStream in=new FileInputStream(file);
            OutputStream out=new FileOutputStream(file2);
            BufferedInputStream bin=new BufferedInputStream(in);
            BufferedOutputStream bot=new BufferedOutputStream(out);
            byte[] bytes=new byte[1024];
            int len=-1;
            while ((len=bin.read(bytes)) !=-1){
                bot.write(bytes,0,len);
            }
          bin.close();
          bot.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
