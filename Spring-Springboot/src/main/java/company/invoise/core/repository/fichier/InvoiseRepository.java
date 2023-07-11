package company.invoise.core.repository.fichier;

import company.invoise.core.entity.Invoise;
import company.invoise.core.repository.InvoiseRepositoryInterface;

import java.util.ArrayList;
import java.util.List;

//@Component : permet d'indiquer que c'est un component
 // @Repository C'est un repository
public class InvoiseRepository implements InvoiseRepositoryInterface {

    List<Invoise> invoises = new ArrayList<>();
    public void create(Invoise invoise){
        invoises.add(invoise);
        System.out.println(" invoise numero : "+ invoise.getNumber() +" and "+ invoise.getCustomerName() +" added in repository ");
    }

    @Override
    public List<Invoise> list() {
        throw new UnsupportedOperationException();
    }
}
