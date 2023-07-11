package company.invoise.controller.web;

import company.invoise.core.controller.InvoiseControllerInterface;
import company.invoise.core.entity.Invoise;
import company.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@Component : permet d'indiquer que c'est un component
@Controller
@RequestMapping("/invoise")
public class InvoiseControllerWeb implements InvoiseControllerInterface {

    @Autowired
    private InvoiseServiceInterface invoiseService;
    public void createInvoise(){
        System.out.println( " this is the web interface " );

        String customerName = "Tesla";
        Invoise invoise = new Invoise();
        invoise.setCustomerName(customerName);


        invoiseService.createInvoise(invoise);
    }

    public InvoiseServiceInterface getInvoiseService() {
        return invoiseService;
    }

    public void setInvoiseService(InvoiseServiceInterface invoiseService) {
        this.invoiseService = invoiseService;
    }

    @RequestMapping("/home")
    public String displayInvoise(Model model){
        System.out.println(" Afficher la liste des facturations existants ");

        List<Invoise> invoises = invoiseService.listInvoise();

        model.addAttribute("invoises",invoises);

        return "invoise-home";
    }

    @RequestMapping("/detail/{id}")
    public  String displayDetailsInvoise(@PathVariable("id") String number, Model model){
        System.out.println(" Afficher le details de facturations existants ");

        Invoise invoise = invoiseService.getInvoiseById(number);
        model.addAttribute("invoise", invoise);

        return "invoise-detail.html";
    }
}
