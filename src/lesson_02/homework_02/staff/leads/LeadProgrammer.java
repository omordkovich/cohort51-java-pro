package lesson_02.homework_02.staff.leads;

import lesson_02.homework_02.staff.specialists.programming.GameplayProgrammer;
import lesson_02.homework_02.staff.specialists.programming.UiProgrammer;
import org.springframework.beans.factory.annotation.Autowired;

public class LeadProgrammer {
    @Autowired
    private GameplayProgrammer gameplayProgrammer;
    @Autowired
    private UiProgrammer uiProgrammer;

public void makeOrders(){
    gameplayProgrammer.work();
    uiProgrammer.work();
}

    public GameplayProgrammer getGameplayProgrammer() {
        return gameplayProgrammer;
    }

    public void setGameplayProgrammer(GameplayProgrammer gameplayProgrammer) {
        this.gameplayProgrammer = gameplayProgrammer;
    }

    public UiProgrammer getUiProgrammer() {
        return uiProgrammer;
    }

    public void setUiProgrammer(UiProgrammer uiProgrammer) {
        this.uiProgrammer = uiProgrammer;
    }
}
