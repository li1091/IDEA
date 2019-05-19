package IO;

import java.io.*;

public class zhuanhuanliu {
    public static void main(String[] args){
        InputStream is=System.in;
        InputStreamReader in=new InputStreamReader(is);
        BufferedReader br=new BufferedReader(in);
        try {
            BufferedWriter wr=new BufferedWriter(new FileWriter(new File("F:\\test\\o.txt")));
            String str = br.readLine();
            while (!str.equals("stop")){
                wr.write(str);
                wr.newLine();
                str=br.readLine();
            }
            wr.close();
            br.close();
            in.close();
            is.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
