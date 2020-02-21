import java.io.*;
import java.util.zip.GZIPOutputStream;

public class copyFile {
  public static void main(String[] args) throws IOException {
    String fileResouce = args[0];
    String copyTo = args[1];
    FileInputStream fis = null;
    GZIPOutputStream gzos = null;
    try {
     fis = new FileInputStream(fileResouce);
     FileOutputStream fos = new FileOutputStream(copyTo);
     BufferedOutputStream bos = new BufferedOutputStream(fos);
     gzos = new GZIPOutputStream(bos);
    
      int i = fis.read();
      while(i != -1){
        fos.write(i);
        i = fis.read();
      }
      fos.flush();
      fos.close();
      fis.close();
    } catch (Exception e) {]
      System.err.println("ファイル操作に失敗しました");
      try {
        if(fis != null){
          fis.close();
        }
        if(gzos != null){
          gzos.close();
        }
      } catch(IOException ee){}
    }
  }
}