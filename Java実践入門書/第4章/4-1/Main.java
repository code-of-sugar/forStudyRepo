import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;
  
  @override
  int HashCode(){
    int r = 1;
    r = r * 31 + title.HashCode();
    r = r * 31 + publishDate.HashCode();
    return r;
  }

  @override
  public boolean equals(Object obj){
    if(this == o){
      return true;
    }
    if(this == null){
      return false;
    }
    if(!(this instanceof Book)){
      return false;
    }
    Book b = (Book) obj
    if(!title.equals(b.title)){
      return false;
    }
    if(!publishDate.equals(b.publishDate)){
      return false;
    }
    return true;
  }

  @override
  public int CompareTo(Book o){
    return this.publishDate.CompareTo(o.publishDate);
  }

  @override
  public Book Clone(){
    Book b = new Book();
    b.title = this.title;
    b.comment = this.comment;
    b.publishDate = (Date) this.publishDate.clone();
    return b;
  }

}