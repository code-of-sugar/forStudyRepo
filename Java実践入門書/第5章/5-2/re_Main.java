  enum keyType{ PADLOCK, BUTTON, DIAL, FINGER; }

public class StrageBox<E>{
  private KeyType keyType; 
  private E item;
  private long count;
  public void put(E i){
    this.item = i;
  }

  public E get(){
    this.count++;
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