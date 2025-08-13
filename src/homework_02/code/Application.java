package homework_02.code;

import homework_02.staff.GameDesigner;
import homework_02.staff.leads.LeadArtist;
import homework_02.staff.leads.LeadProgrammer;
import homework_02.staff.leads.Producer;
import homework_02.staff.specialists.art.CharacterArtist;
import homework_02.staff.specialists.art.LevelArtist;
import homework_02.staff.specialists.programming.GameplayProgrammer;
import homework_02.staff.specialists.programming.UiProgrammer;

public class Application {
    public static void main(String[] args) {
        GameDesigner gameDesigner = new GameDesigner();
        LevelArtist levelArtist = new LevelArtist();
        CharacterArtist characterArtist = new CharacterArtist();
        GameplayProgrammer gameplayProgrammer = new GameplayProgrammer();
        UiProgrammer uiProgrammer = new UiProgrammer();

        LeadArtist leadArtist = new LeadArtist();
        leadArtist.setCharacterArtist(characterArtist);
        leadArtist.setLevelArtist(levelArtist);

        LeadProgrammer leadProgrammer = new LeadProgrammer();
        leadProgrammer.setGameplayProgrammer(gameplayProgrammer);
        leadProgrammer.setUiProgrammer(uiProgrammer);

        Producer producer = new Producer();
        producer.setGameDesigner(gameDesigner);
        producer.setLeadArtist(leadArtist);
        producer.setLeadProgrammer(leadProgrammer);

        producer.gameProduction();
    }


}
