import org.apache.commons.lang3.builder.*;

public class Book implements Comparable<Book>, Cloneable{
  private String title;
  private Date publishDate;
  private String comment;
  
  @override
  public int HashCode(){
    return HashCodeBuilder.reflectionHashCode(this);
  }

  @override
  public boolean equals(Object obj){
    EqualsBuilder.reflectionEquals(this, obj);
  }

  @override
  public int CompareTo(Book o){
    return CompareToBuilder.reflectionCompare(this, o);
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