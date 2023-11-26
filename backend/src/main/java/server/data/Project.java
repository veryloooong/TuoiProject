package server.data;

import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Project {
  private long id;

  private String title;
  private String description;
  private Date startDate;
  private Date endDate;
  private long currentFund;
  private long goalFund;

  public Project(String title, String description, Date startDate, Date endDate, long goalFund) {
    this.setTitle(title);
    this.setDescription(description);
    this.setStartDate(startDate);
    this.setEndDate(endDate);
    this.setCurrentFund(0);
    this.setGoalFund(goalFund);
  }
}
