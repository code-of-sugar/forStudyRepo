import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;

  public int HashCode(){
    int r = 1;
    r = 31 * r + publishDate.HashCode();
    r = 31 * r + title.HashCode();

    return r;
  }

  public boolean equals(Object o) {
    if(this == o){
      return true;
    }
    if(this == null){
      return false;
    }
    if(!(o instance of Book)){
      return flase;
    }
    Book b = (Book)o;
    if(!publishDate.equals(b.publishDate)){
      
    }
  }
}