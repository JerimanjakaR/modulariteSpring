package company.invoise.core.service;

import company.invoise.core.entity.Invoise;

import java.util.List;

public interface InvoiseServiceInterface {
     void createInvoise(Invoise invoise);
     List<Invoise> listInvoise();

     Invoise getInvoiseById(String number);
}
