package plaindoll;

public class Welcomer {
    public String sayWelcome() {
        return "Welcome home, good hunter. What is it your desire?";
    }
    
    public String sayFarewell() {
        return "Farewell, good hunter. May you find your worth in waking world.";
    }
    
    public String sayNeedGold() {
        return "Not enough gold";
    }
    
    public String saySome() {
        return "something in the way";
    }
    
    public String sayRandomHunterPhrase() {
        String[] hunterPhrases = {
            "Hunter, your strength knows no bounds.",
            "A hunter must always be prepared.",
            "Hunter, never lose sight of your prey.",
            "The hunter's journey is never easy.",
            "Hunter, may your blade stay sharp."
        };
        int randomIndex = (int) (Math.random() * hunterPhrases.length);
        return hunterPhrases[randomIndex];
    }
}
