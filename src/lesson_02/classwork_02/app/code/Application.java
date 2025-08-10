package lesson_02.classwork_02.app.code;

import lesson_02.classwork_02.app.staff.administration.Director;
import lesson_02.classwork_02.app.staff.administration.ProductionChef;
import lesson_02.classwork_02.app.staff.administration.SalesChef;
import lesson_02.classwork_02.app.staff.specialists.Secretary;
import lesson_02.classwork_02.app.staff.specialists.productions.MachineOperator;
import lesson_02.classwork_02.app.staff.specialists.productions.StoreKeeper;
import lesson_02.classwork_02.app.staff.specialists.sales.Merchandiser;
import lesson_02.classwork_02.app.staff.specialists.sales.SalesManager;

public class Application {
    public static void main(String[] args) {

        MachineOperator machineOperator = new MachineOperator();
        StoreKeeper storeKeeper = new StoreKeeper();

        Merchandiser merchandiser = new Merchandiser();
        SalesManager salesManager = new SalesManager();
        Secretary secretary = new Secretary();

        ProductionChef productionChef = new ProductionChef();
        productionChef.setMachineOperator(machineOperator);
        productionChef.setStoreKeeper(storeKeeper);

        SalesChef salesChef = new SalesChef();
        salesChef.setMerchandiser(merchandiser);
        salesChef.setSalesManager(salesManager);

        Director director = new Director();
        director.setSecretary(secretary);
        director.setProductionChef(productionChef);
        director.setSalesChef(salesChef);

        director.manageCompany();
    }
}
