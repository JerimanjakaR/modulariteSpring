package company.invoise.core.service.web;

import company.invoise.core.entity.Invoise;
import company.invoise.core.repository.InvoiseRepositoryInterface;
import company.invoise.core.service.InvoiseServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiseServiceWeb  implements InvoiseServiceInterface {

    @Value("${invoise.lastNumber}")
    private Long lastNumber;
    @Value("${invoise.prefix}")
    private String prefix;

    @Autowired
    private InvoiseRepositoryInterface invoiseRepository;
    public void createInvoise(Invoise invoise){
        invoise.setNumber(prefix+String.valueOf(++lastNumber));
        invoiseRepository.create(invoise);
    }

    public InvoiseRepositoryInterface getInvoiseRepository() {
        return invoiseRepository;
    }

    public void setInvoiseRepository(InvoiseRepositoryInterface invoiseRepository) {
        this.invoiseRepository = invoiseRepository;
    }

    public Long getLastNumber() {
        return lastNumber;
    }

    public void setLastNumber(Long lastNumber) {
        this.lastNumber = lastNumber;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public List<Invoise> listInvoise() {
        return invoiseRepository.list();
    }
}
