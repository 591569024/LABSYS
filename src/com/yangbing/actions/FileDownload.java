package com.yangbing.actions;
import java.io.InputStream;  
  
  
import org.apache.struts2.ServletActionContext;  
  
  
import com.opensymphony.xwork2.ActionSupport;  
  
//文件下载  
public class FileDownload extends ActionSupport{  
      
    private int number ;  
  
    private String fileName;  
  
    public int getNumber() {  
        return number;  
    }  
  
    public void setNumber(int number) {  
        this.number = number;  
    }  
      
    public String getFileName() {  
        return fileName;  
    }  
  
    public void setFileName(String fileName) {  
        this.fileName = fileName;  
    }  
  
    //返回一个输入流，作为一个客户端来说是一个输入流，但对于服务器端是一个 输出流  
    public InputStream getDownloadFile() throws Exception  
    {  
        if(1 == number)  
        {  
           this.fileName = "struts2.jpg" ;  
           //获取资源路径  
           return ServletActionContext.getServletContext().getResourceAsStream("F:/myEclipse2017/SSH框架/WebRoot/WEB-INF/upload/struts2.jpg") ;  
        }  
          
        else if(2 == number)  
        {  
            this.fileName = "sas9.3-64sid-99CKGN-可用到2018年.txt" ;  
            //解解乱码  
            this.fileName = new String(this.fileName.getBytes("GBK"),"ISO-8859-1");  
            return ServletActionContext.getServletContext().getResourceAsStream("F:/myEclipse2017/SSH框架/WebRoot/WEB-INF/upload/sas9.3-64sid-99CKGN-可用到2018年.txt") ;  
        }  
        else  
           return null ;  
    }  
      
    @Override  
    public String execute() throws Exception {  
          
        return SUCCESS;  
    }  
  
}  