import java.lang.*;

public class Luncher{
  public static void main(String[] args){
    String fqcn = args[0];
    String howToStart =  args[1];

    showEatingMemory_mb();
    try{
      Class<?> clazz = Class.forName(fqcn);
      showMethodList(Class<?> clazz);
      if(howToStart.equals("E")){
        launchExternal(clazz);
      }else if(howToStart.equals("I")){
        launchInternal(clazz);
      } else {
        throw new IllegalArgumentException("起動方法の指定が不正です");
      } catch(Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
        System.exit(1);
      }
      showEatingMemory_mb();
      System.exit(0);
    }
  }

  public static void showEatingMemory_mb(){
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    long usage = (total - free) / 1024 / 1024;

    System.out.println("メモリ使用量:" + usage + "MB");
  }
  
  public static void showMethodList(Class<?> clazz){
    System.out.println("メソッドの一覧を表示")
    Method[] methods = clazz.getDeclaredMethods();
    methods.stream().forEach(e -> System.out.println(e.getName()));
  }

  public static void launchExternal(Class<?> clazz) throws Exception{
    ProcessBuilder pb = new ProcessBuilder(
      "java", clazz.getName();
    )
    Process proc = pb.start();
    proc.waitFor();
  }

  public static void launchInternal(Class<?> clazz) throws Exception{
    Method m = clazz.getMethod("main", String[].class);
    String[] args = {};
    m.invoke(null, (Object) args);
  }
}