package company.invoise.core.repository.Database;

import company.invoise.core.entity.Invoise;
import company.invoise.core.repository.InvoiseRepositoryInterface;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Component : permet d'indiquer que c'est un component
@Repository
public class InvoiseRepositoryDatabase implements InvoiseRepositoryInterface {
    public void create(Invoise invoise){
        System.out.println(" invoise numero : "+ invoise.getNumber() +" and "+ invoise.getCustomerName() +" added in repository ");
    }

    @Override
    public List<Invoise> list() {
        List<Invoise> lists = new ArrayList<>();
        Invoise invoise1 = new Invoise();
        invoise1.setNumber("NUM_112");
        invoise1.setCustomerName("JIRAMA");
        lists.add(invoise1);

        Invoise invoise2 = new Invoise();
        invoise2.setNumber("ORA_123");
        invoise2.setCustomerName("TELMA");
        lists.add(invoise2);
        return lists;
    }
}
