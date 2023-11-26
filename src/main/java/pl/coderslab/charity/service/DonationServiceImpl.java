package pl.coderslab.charity.service;

import org.springframework.stereotype.Service;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.repository.DonationRepository;

@Service
public class DonationServiceImpl implements DonationService {
    private final DonationRepository donationRepository;

    public DonationServiceImpl(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Override
    public int sumOfQuantity() {
        return donationRepository.sumOfQuantity();
    }

    @Override
    public int sumOfDonations() {
        return donationRepository.sumOfDonations();
    }

    @Override
    public void save(Donation donation) {
        donationRepository.save(donation);
    }
}
