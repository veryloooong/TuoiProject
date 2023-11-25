package server.data;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Course {
  private Long id;

  private String title;
  private String description;
  private long price;
}
