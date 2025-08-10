package lesson_02.classwork_02.app.staff.administration;

import lesson_02.classwork_02.app.staff.specialists.sales.Merchandiser;
import lesson_02.classwork_02.app.staff.specialists.sales.SalesManager;
import org.springframework.beans.factory.annotation.Autowired;

public class SalesChef {
    @Autowired
    private Merchandiser merchandiser;
    @Autowired
    private SalesManager salesManager;

    public void giveOrders(){
        merchandiser.work();
        salesManager.work();
    }

    public Merchandiser getMerchandiser() {
        return merchandiser;
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public SalesManager getSalesManager() {
        return salesManager;
    }

    public void setSalesManager(SalesManager salesManager) {
        this.salesManager = salesManager;
    }
}
