package guojihua;

import sun.plugin2.message.Message;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18Ndemo {
    public static void main(String[] args){
        Locale us=new Locale("en","US");
        //自动获取当前系统默认语言
        Locale locale=Locale.getDefault();

        Scanner s=new Scanner(System.in);
        //关联配置文件
        //如果传入指定语言环境，会寻找和当前系统语言环境匹配的配置文件
        ResourceBundle bundle=ResourceBundle.getBundle("guojihua.info");
        System.out.println(bundle.getString("system.name"));
        System.out.println(bundle.getString("input.username"));
        String username=s.next();
        System.out.println(bundle.getString("input.password"));
        String pwd=s.next();

        if ("admin".equals(username) && "123".equals(pwd)){
            System.out.println(bundle.getString("login.success"));
            String welcome=bundle.getString("welcome");
            //动态文本{0}为占位符，{里面可以填入任何文本}
            welcome= MessageFormat.format(welcome,username);
            System.out.println(welcome);
        }else {
            System.out.println(bundle.getString("login.error"));
        }


    }
}
