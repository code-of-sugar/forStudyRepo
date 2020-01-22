# 文字列操作

## StringBuilderクラス
  文字列連結をする時は+演算子を使うのではなく、**StringBuilderクラス**を用いる。
  ```
    //hogefugaを表示する

    //+演算子
    String s1 = hoge;
    s1 = s1 + fuga;

    System.out.println(s1);

    //StringBuilder
    StringBuilder s2 = new StringBuilder(); 
    
    s2.add("hoge");
    s2.add("fuga");

    System.out.println(s2);

  ```

  ### +演算子とStringBuilderの違い
    +演算子は連結するたびに連結前の内容が入ったインスタンスが削除されて、連結後の内容が入ったインスタンスを生成する。
  膨大な回数の連結を行おうとすると、連結するたびにインスタンスが再生成されるので、動作が低速。

    StringBuilderはインスタンスに連結内容を格納するためのバッファを持っていて、
  新たにインスタンスの生成が起きない設計になっており、動作が高速。

  少ない回数の連結→+演算子
  膨大な回数の連結→StringBuilderクラス
  で使い分ける。

## StringBufferクラス
  StringBuilderクラスと用途はほぼ一緒。スレッドを利用する場合で使う。

### 疑問に思ったこと,今後深く勉強したいこと
  *  可変長引数をうまく利用できる気がしないので、しっかりと調べて勉強する。
  *  スレッドとは？少しでも内容を理解しておく。