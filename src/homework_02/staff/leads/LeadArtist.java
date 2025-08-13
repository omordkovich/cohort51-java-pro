package homework_02.staff.leads;

import homework_02.staff.specialists.art.CharacterArtist;
import homework_02.staff.specialists.art.LevelArtist;
import org.springframework.beans.factory.annotation.Autowired;

public class LeadArtist {
    @Autowired
    private CharacterArtist characterArtist;
    @Autowired
    private LevelArtist levelArtist;

    public void makeOrders(){
        characterArtist.work();
        levelArtist.work();
    }

    public CharacterArtist getCharacterArtist() {
        return characterArtist;
    }

    public void setCharacterArtist(CharacterArtist characterArtist) {
        this.characterArtist = characterArtist;
    }

    public LevelArtist getLevelArtist() {
        return levelArtist;
    }

    public void setLevelArtist(LevelArtist levelArtist) {
        this.levelArtist = levelArtist;
    }
}
