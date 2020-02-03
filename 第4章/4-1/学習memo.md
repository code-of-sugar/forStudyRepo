#問題集2週目思考ノート
  * 署名と発行日が同じであれば等価と判定・・・toEquals()のオーバーライドが必要？
  * HashSetに格納しても正しく利用できる・・・HashSetはHashCode()で得られる値を用いてる？
  * clone()でコピーできる・・・clone()のオーバーライド必須
  * collections.sort()・・・内部動作を忘れてる。**要復習**。

#２週目復習まとめ
  ##Collections.sort()について
    配列などの、ある対象の要素とその次の要素の大きさをcompareTo()メソッドを使って比較する。
    次の要素の方が大きい時は負の数、小さい場合は正の数、同じ場合は0をreturnする。

    implements Comparable<>でcompareToのオーバーライドを強制している。
    ↓
  ```

    public class Account implements Comparable<Account>
      int number;
    
      ..

      public int compareTo(Account obj){
        if(this.number < obj.number){
          return -1; // 自身の方が小さいので-1
        }

        if(this.number > obj.number){
          return 1;  // 自身の方が大きいので1
        }
        return 0; //それ以外だと値は一緒なので0
      }

  ```

###疑問点
* re_Main.java、38行目。  
  public int CompareTo(Book o){
    return this.publishDate.CompareTo(o.publishDate);
  }
  でいけるらしい？