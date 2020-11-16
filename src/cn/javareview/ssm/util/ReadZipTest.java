package cn.javareview.ssm.util;

import java.io.BufferedInputStream;  
import java.io.BufferedOutputStream;
import java.io.BufferedReader;  
import java.io.File;
import java.io.FileInputStream;  
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;  
import java.io.InputStreamReader;  
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;  
import java.util.zip.ZipFile;  
import java.util.zip.ZipInputStream;  

import cn.javareview.ssm.po.ZipCSVUser;


public class ReadZipTest {

    public static void main(String[] args) throws Exception {
        try {  
               readZipFile("D:\\1111.zip");  
           } catch (Exception e) {  
               // TODO Auto-generated catch block  
               e.printStackTrace();  
           }  
    }
    
    public static ZipCSVUser readZipFile(String file) throws Exception {  
           ZipFile zf = new ZipFile(file);  
           InputStream in = new BufferedInputStream(new FileInputStream(file));
           
           //创建保存wav文件
           SimpleDateFormat myFmt2=new SimpleDateFormat("yyyyMMddHHmmss");
           Date date = new Date();
           File newFile = new File("/Java_Review2016/Materials/"+myFmt2.format(date)+".wav");
           if (!newFile.getParentFile().exists()) {  
               if (!newFile.getParentFile().mkdirs()) {  
               }  
           }    
           if(!newFile.exists()) {  
               try {  
            	   newFile.createNewFile();
               } catch (IOException e) {  
                   e.printStackTrace();  
               }  
           }
           
           OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(newFile));
           ZipInputStream zin = new ZipInputStream(in);  
           ZipEntry ze;
           ZipCSVUser zipCSVUser =  new ZipCSVUser();
           
           while ((ze = zin.getNextEntry()) != null) {  
               if (ze.isDirectory()) {
               } else {  
                   System.err.println("file - " + ze.getName() + " : "
                           + ze.getSize() + " bytes");
                   
                   if(ze.getName().endsWith(".wav")){
                	   long size = ze.getSize();
                       if (size > 0) {  
                           BufferedReader br = new BufferedReader(  
                                   new InputStreamReader(zf.getInputStream(ze),"gbk"));  
                           int len;  
                           char c[] = new char[1024];
                           byte b[] = new byte[1024];
                           while ((len = br.read(c)) != -1) {
                               outputStream.write(b, 0, len);
                           }
                           outputStream.close();
                           br.close();
                       }
                       System.out.println();
                   }
                   
                   if(ze.getName().endsWith(".csv")){
                	   long size = ze.getSize();
                       if (size > 0) {  
                           BufferedReader br = new BufferedReader(  
                                   new InputStreamReader(zf.getInputStream(ze),"gbk"));
                           String len;
                           while ((len = br.readLine()) != null) {
                        	   if(len.startsWith("name:")){
                        		   zipCSVUser.setName(len.substring(6));
                        	   }
                        	   if(len.startsWith("number:")){
                        		   zipCSVUser.setNumber(len.substring(8));
                        	   }
                           }
                           br.close();
                       }
                   }
               }
           }
           zin.closeEntry();
           return zipCSVUser;
       }
}
