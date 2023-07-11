package company.invoise.core.controller.scan;

import company.invoise.core.controller.InvoiseControllerInterface;
import company.invoise.core.entity.Invoise;
import company.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

//@Component : permet d'indiquer que c'est un component
//@Controller
public class InvoiseControllerScan implements InvoiseControllerInterface {
    @Autowired
    private InvoiseServiceInterface invoiseService;
    @Override
    public void createInvoise() {
        System.out.println( " this is the Scan " );

        String customerName = "Space X";
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
