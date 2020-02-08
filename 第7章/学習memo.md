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
  