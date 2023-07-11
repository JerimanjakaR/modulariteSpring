package company.invoise.core.controller.console;

import company.invoise.core.controller.InvoiseControllerInterface;
import company.invoise.core.entity.Invoise;
import company.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Scanner;

//@Component : permet d'indiquer que c'est un component
//@Controller
public class InvoiseControllerConsole implements InvoiseControllerInterface {
    @Autowired
    private InvoiseServiceInterface invoiseService;
    public void createInvoise(){
        System.out.println( "what is a customeName !" );

        Scanner sc = new Scanner(System.in);
        String customerName = sc.nextLine();
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
}
