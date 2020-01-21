import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Main{
  public static void main(String[] args){
    // 現在の日時を取得
    Date now = new Date();
    Calendar   c = Calendar.getInstance();
    
    // 取得した日時情報をClendarにセット
    c.setTime(now);

    // Clendarから日の数値を取得
    int day = c.get(Calendar.DAY_OF_MONTH);

    // dayに100を足す
    day += 100;
    c.set(Calendar.DAY_OF_MONTH, day);

    // Calendarの日付情報をDate型に変換
    Date future = c.getTime();
    
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}