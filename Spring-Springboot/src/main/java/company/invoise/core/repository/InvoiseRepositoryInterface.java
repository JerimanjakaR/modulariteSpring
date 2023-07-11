package company.invoise.core.repository;

import company.invoise.core.entity.Invoise;

import java.util.List;

public interface InvoiseRepositoryInterface {
    void create(Invoise invoise);
    List<Invoise> list();

    Invoise getInvoiseById(String number);
}
