package cn.haircut.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SerialnumberUtils {  
    /** 
     * 获取现在时间 
     * @return返回字符串格式yyyyMMddHHmmss 
     */  
      public static String getStringDate() {  
             Date currentTime = new Date();  
             SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");  
             String dateString = formatter.format(currentTime);  
             //System.out.println("TIME:::"+dateString);  
             return dateString;  
          }  
      /** 
       * 由年月日时分�?+3位随机数 
       * 生成流水�? 
       * @return 
       */  
      public static String Getnum(){  
          String t = getStringDate();  
          int x=(int)(Math.random()*900)+100;  
          String serial = t + x;  
          return serial;  
      }  
        
      //主方法测�?  
    public static void main(String[] args) {  
        String m= Getnum();  
        System.out.println(m);  
    }  
  
}  