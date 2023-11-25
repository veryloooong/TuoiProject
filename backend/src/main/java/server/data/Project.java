package server.data;

import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Project {
  private Long id;

  private String title;
  private String description;
  private Date startDate;
  private Date endDate;
  private Long currentFund;
  private Long goalFund;
}
