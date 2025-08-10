package lesson_02.classwork_02.app.config;

import lesson_02.classwork_02.app.staff.administration.Director;
import lesson_02.classwork_02.app.staff.administration.ProductionChef;
import lesson_02.classwork_02.app.staff.administration.SalesChef;
import lesson_02.classwork_02.app.staff.specialists.Secretary;
import lesson_02.classwork_02.app.staff.specialists.productions.MachineOperator;
import lesson_02.classwork_02.app.staff.specialists.productions.StoreKeeper;
import lesson_02.classwork_02.app.staff.specialists.sales.Merchandiser;
import lesson_02.classwork_02.app.staff.specialists.sales.SalesManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.crypto.Mac;

@Configuration
public class AppConfig {

    @Bean
    public Director getDirector(){
    return new Director();
    }

    @Bean
    public ProductionChef getProductionChef(){
        return new ProductionChef();
    }
    @Bean
    public SalesChef getSalesChef(){
        return new SalesChef();
    }
    @Bean
    public Secretary getSecretary(){
        return new Secretary();
    }

    @Bean
    public MachineOperator getMachineOperator(){
        return new MachineOperator();
    }

    @Bean
    public StoreKeeper getStoreKeeper(){
        return new StoreKeeper();
    }

    @Bean
    public Merchandiser getMerchandiser(){
        return new Merchandiser();
    }

    @Bean
    public SalesManager getSalesManager(){
        return new SalesManager();
    }

}
