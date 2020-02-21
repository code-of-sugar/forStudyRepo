import java.util.*;

public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;

  @override
  public int hashCode(){
    int r = 1;
    r = r * 31 + title.hashCode();
    r = r * 31 + publishDate.hashCode();
    return r;
  }

  @override
  public boolean equals(Object obj){
    if(this == obj){
      return true;
    }
    if (o == null){
      return false;
    }
    if(!(o instanceof Book)){
      return false;
    }
    Book b = (Book) o;
    if(!publishDate.equals(b.publishDate)){
      return false;
    }
    if(!title.equals(b.title)){
      return false;
    }
    return true;
  }
  
  @override
  public int compareTo(Book obj){
    if(this.publishDate < obj.publishDate){
      return -1;
    }
    if(this.publishDate > obj.publishDate){
      return 1;
    }
    return 0;
  }

  @override
  public Book clone(){
    Book b = new Book();
    b.title = this.title;
    b.comment = this.comment;
    b.publishDate = this.publishDate.clone();
    return b;
  }
}