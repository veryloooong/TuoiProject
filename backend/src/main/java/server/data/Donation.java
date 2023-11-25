package server.data;

import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Donation {
  private Long donationId;
  private Long userId;
  private Long projectId;
  private Date donationTime;
}
