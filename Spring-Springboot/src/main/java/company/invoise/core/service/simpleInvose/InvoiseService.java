package company.invoise.core.service.simpleInvose;

import company.invoise.core.entity.Invoise;
import company.invoise.core.repository.InvoiseRepositoryInterface;
import company.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service
public class InvoiseService  implements InvoiseServiceInterface {

    @Value("112L")
    private Long lastNumber;

    @Autowired
    private InvoiseRepositoryInterface invoiseRepository;
    public void createInvoise(Invoise invoise){
        invoise.setNumber(String.valueOf(++lastNumber));
        invoiseRepository.create(invoise);
    }

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    @Override
    public List<Invoise> listInvoise() {
        return invoiseRepository.list();
    }

    @Override
    public Invoise getInvoiseById(String number) {
        return invoiseRepository.getInvoiseById(number);
    }
}
