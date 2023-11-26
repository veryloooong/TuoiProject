package server.data;

import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Data
@Accessors(chain = true)
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String title;
  private String description;
  private Date startDate;
  private Date endDate;
  private long currentFund;
  private long goalFund;
}
