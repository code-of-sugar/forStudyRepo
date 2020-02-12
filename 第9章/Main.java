public class copyFile {
  public static void main(String[] args) throws IOException {
    String fileResouce = args[0];
    String copyTo = args[1];
    FileInputStream fis = new FileInputStream(fileResouce);
    FileOutputStream fos = new FileOutputStream(copyTo);
    int i = fis.read();
    while(i != -1){
      fos.write(i);
      i = fis.read();
    }
    fos.flush();
    fos.close();
    fis.close();
    
  }
}