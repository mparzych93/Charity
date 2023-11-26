package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.coderslab.charity.entity.Category;
import pl.coderslab.charity.entity.Donation;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.CategoryService;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
public class DonationController {

    private final CategoryService categoryService;
    private final InstitutionService institutionService;
    private final DonationService donationService;

    public DonationController(CategoryService categoryService, InstitutionService institutionService, DonationService donationService) {
        this.categoryService = categoryService;
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @ModelAttribute("categories")
    public List<Category> findAllCategories() {
        return categoryService.findAll();
    }

    @ModelAttribute("institutions")
    public List<Institution> findAllInstitutions() {
        return institutionService.findAll();
    }

    @GetMapping("/donation")
    public String showDonationForm(Model model) {
        model.addAttribute("donation", new Donation());
        return "form";
    }

    @PostMapping("/donation")
    public String addDonation(Donation donation) {
/*        System.out.println(donation.getCategories());
        System.out.println(donation.getInstitution());
        System.out.println(donation.getZipCode());
        System.out.println(donation.getCity());
        System.out.println(donation.getStreet());
        System.out.println(donation.getPhone());
        System.out.println(donation.getPickUpDate());
        System.out.println(donation.getPickUpTime());
        System.out.println(donation.getPickUpComment());
        System.out.println(donation.getQuantity());*/
        donationService.save(donation);
        return "redirect:/";
    }
}
