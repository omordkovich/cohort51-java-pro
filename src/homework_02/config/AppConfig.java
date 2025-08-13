package homework_02.config;

import homework_02.staff.GameDesigner;
import homework_02.staff.leads.LeadArtist;
import homework_02.staff.leads.LeadProgrammer;
import homework_02.staff.leads.Producer;
import homework_02.staff.specialists.art.CharacterArtist;
import homework_02.staff.specialists.art.LevelArtist;
import homework_02.staff.specialists.programming.GameplayProgrammer;
import homework_02.staff.specialists.programming.UiProgrammer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Producer producer(){
        return new Producer();
    }

    @Bean
    public LeadProgrammer leadProgrammer(){
        return new LeadProgrammer();
    }

    @Bean
    public LeadArtist leadArtist(){
        return new LeadArtist();
    }

    @Bean
    public GameDesigner gameDesigner(){
        return new GameDesigner();
    }

    @Bean
    public CharacterArtist characterArtist(){
        return new CharacterArtist();
    }

    @Bean
    public LevelArtist levelArtist(){
        return new LevelArtist();
    }

    @Bean
    public GameplayProgrammer gameplayProgrammer(){
        return new GameplayProgrammer();
    }

    @Bean
    public UiProgrammer uiProgrammer(){
        return new UiProgrammer();
    }
}
