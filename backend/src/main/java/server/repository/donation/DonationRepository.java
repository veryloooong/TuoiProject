package server.repository.donation;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.data.pojo.Donation;

import java.util.List;

@Repository
public interface DonationRepository extends JpaRepository<Donation,Long> {
    public Donation findDonationById(long DonationId);
    public List<Donation> findDonationByUserId(Long userId);
    public List<Donation> findDonationByProjectId(Long projectId);
    public Donation save();
    public Donation update();
    public Donation delete();
    public List<Donation> findAll();
}
