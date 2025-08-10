package lesson_02.homework_02.staff.leads;

import lesson_02.homework_02.staff.GameDesigner;
import org.springframework.beans.factory.annotation.Autowired;

public class Producer {
    @Autowired
    private LeadArtist leadArtist;
    @Autowired
    private LeadProgrammer leadProgrammer;
    @Autowired
    private GameDesigner gameDesigner;

public void gameProduction(){
    gameDesigner.work();
    leadArtist.makeOrders();
    leadProgrammer.makeOrders();
}

    public LeadArtist getLeadArtist() {
        return leadArtist;
    }

    public void setLeadArtist(LeadArtist leadArtist) {
        this.leadArtist = leadArtist;
    }

    public LeadProgrammer getLeadProgrammer() {
        return leadProgrammer;
    }

    public void setLeadProgrammer(LeadProgrammer leadProgrammer) {
        this.leadProgrammer = leadProgrammer;
    }

    public GameDesigner getGameDesigner() {
        return gameDesigner;
    }

    public void setGameDesigner(GameDesigner gameDesigner) {
        this.gameDesigner = gameDesigner;
    }
}
