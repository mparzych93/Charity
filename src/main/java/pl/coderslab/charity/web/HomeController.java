package pl.coderslab.charity.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.entity.Institution;
import pl.coderslab.charity.service.DonationService;
import pl.coderslab.charity.service.InstitutionService;

import java.util.List;

@Controller
public class HomeController {

    private final InstitutionService institutionService;
    private final DonationService donationService;

    public HomeController(InstitutionService institutionService, DonationService donationService) {
        this.institutionService = institutionService;
        this.donationService = donationService;
    }

    @ModelAttribute("institutions")
    public List<Institution> findAllInstitutions() {
        return institutionService.findAll();
    }
    @ModelAttribute("sumOfQuantity")
    public int showSumOfQuantity() {
        return donationService.sumOfQuantity();
    }
    @ModelAttribute("sumOfDonations")
    public int showSumOfDontations() {
        return donationService.sumOfDonations();
    }
    @RequestMapping("/")
    public String homeAction(Model model){
        return "index";
    }
    @GetMapping("/about")
    @ResponseBody
    public String about() { return "Here you can find some details for logged users"; }
}
