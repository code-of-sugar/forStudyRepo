import java.lang.reflect;

public class Luncher {
  public static void main(String[] args) {
    String fqcn = args[0];
    String howStart = args[1];

    showEatingMemory_mb();
    try{
      Class<?> clazz = Class.forName(fqcn);
      showMethods(Class<?> clazz);
      if(howStart.equals("E")){
        launchExternal(clazz);
      } else if(howStart.equals("I")){
        launchInternal("I");
      } else {
        throw new IlligalArgumentException(
            "起動方法が不正です");
      }
    }catch (Exception e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
      System.exit(1);
    }
  }

  public static void showEatingMemory_mb(){
    long free = Runtime.getRuntime().freeMemory();
    long total = Runtime.getRuntime().totalMemory();
    long usage = (total - free) / 1024 / 1024;

    System.out.println("現在の使用メモリ量:" + usage + "MB");
  }

  public static void showMethods(Class<?> clazz){
    System.out.println("メソッド一覧の表示")
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
}