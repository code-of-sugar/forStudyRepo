# 問題集1週目思考ノート
 * コマンドライン引数から情報を受け取る←どのようにして受け取れば良いのか？
 * 起動すべきクラスのfqcn←fqcnとは？？？
 * 現在のメモリ使用量を表示←totalMemory()とfreeMemory()の差額で求まる？
 * リフレクションでmainメソッドを呼び出す←mainメソッドを呼び出すとは？
 
# 学習したこと
 ## コマンドライン引数の取得
  public static void main(String[], **args**)のargsで指定した部分で受け取っている？
  args[0], args[1], ...
  のように第一引数第二引数を受け取れる。

 ## FQCN
  完全限定クラス名の略称。パッケージ名.クラス名のことをさす。
  ArrayListならjava.util.ArrayListがFQCN。

 ## リフレクションAPI
  プログラム動作中に型情報を取得、利用できるAPI。

 ## 型情報の取得
 Class インスタンスの取得方法
 1. Class<?> cinfo = Class.forName(FQCN);
 2. Class<?> cinfo = クラス名.class;
 3. Class<?> cinfo = 変数名.getClass();

 class は予約語とされてるからclassを変数名としたいときはclazz,clsなんかを使うのが一般的。
 ## 例外処理
   予期しないエラーに対する処理。
  ### Javaに関する例外の種類
   + Error:システム上重大な回復不能な異常な事象。メモリ不足、スタックオーバーフロー、JREの不具合
   + RuntimeException:実行時に起こった例外で必ずしも対処しなくても良い事象。例外処理をしなくてもいいが、バグの可能性が残るので例外処理するのが良いこともある。
   + Exception:上の二つ以外の例外。例外処理をする必要がある。
 ## 例外処理を行う方法
  try – catch – finally構文を使う。
  メソッドのシグニチャにthrows句を用いることで、メソッドの呼び出し元に例外を投げることが可能。
  ```
  import java.io.FileNotFoundException;
  import java.io.FileReader;
  
  public class Main {
  
      public static void main(String[] args) {
          String fileName = "test.txt";
  
          try {
              throwsSample(fileName);
          } catch (FileNotFoundException e) {
              System.out.println(fileName + "を読み込みませんでした");
          }
          System.out.println("処理が終了しました");
      }
  
      public static void throwsSample(String fileName) throws FileNotFoundException {
          FileReader r = new FileReader(fileName);
          System.out.println(fileName + "を読み込みました");
      }
  
  }
  ```
