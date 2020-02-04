// KeyType.java
enum KeyType{ PADLOCK, BUTTON, DIAL, FINGER; }

//Main.java
public class StrageBox<E>{
  private E item;
  private KeyType keyType;
  private long count;

  public StrageBox(KeyType key){
    this.keyType = key;
  }

  public void put(E i){
    this.item = i;
  }

  public E get(){
    this.count ++;
    switch(this.keyType){
      case PADLOCK:
      if(this.count < 1024) return null;
      break;

      case BUTTON:
      if(this.count < 10000) return null;
      break;

      case DIAL:
      if(this.count < 30000) return null;
      break;
      
      case FINGER:
      if(this.count < 1000000) return null;
      break;
    }
    return this.item;

  }
}

