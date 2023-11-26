package server.data;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Course {
  private long id;

  private String title;
  private String description;
  private long price;

  public Course(String title, String description, long price) {
    this.setTitle(title);
    this.setDescription(description);
    this.setPrice(price);
  }
}
