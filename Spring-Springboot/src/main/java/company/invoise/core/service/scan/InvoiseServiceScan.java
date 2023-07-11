package company.invoise.core.service.scan;

import company.invoise.core.entity.Invoise;
import company.invoise.core.repository.InvoiseRepositoryInterface;
import company.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

//@Service
public class InvoiseServiceScan implements InvoiseServiceInterface {

    @Value("OL")
    private Long lastNumber;
    @Autowired
    private InvoiseRepositoryInterface invoiseRepository;

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    @Override
    public void createInvoise(Invoise invoise) {
        invoise.setNumber("2000_"+String.valueOf(++lastNumber));
        invoiseRepository.create(invoise);
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
