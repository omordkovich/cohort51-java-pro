package lesson_02.classwork_02.app.staff.administration;

import lesson_02.classwork_02.app.staff.specialists.productions.MachineOperator;
import lesson_02.classwork_02.app.staff.specialists.productions.StoreKeeper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductionChef {
    @Autowired
    private MachineOperator machineOperator;
    @Autowired
    private StoreKeeper storeKeeper;

    public void giveOrders(){
        machineOperator.work();
        storeKeeper.work();
    }

    public StoreKeeper getStoreKeeper() {
        return storeKeeper;
    }

    public void setStoreKeeper(StoreKeeper storeKeeper) {
        this.storeKeeper = storeKeeper;
    }

    public MachineOperator getMachineOperator() {
        return machineOperator;
    }

    public void setMachineOperator(MachineOperator machineOperator) {
        this.machineOperator = machineOperator;
    }


}
