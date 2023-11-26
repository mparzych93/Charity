package pl.coderslab.charity.service;

import pl.coderslab.charity.entity.Donation;

public interface DonationService {
    int sumOfQuantity();
    int sumOfDonations();
    void save(Donation donation);
}
