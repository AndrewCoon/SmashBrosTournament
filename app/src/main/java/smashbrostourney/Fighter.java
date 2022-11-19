package smashbrostourney;

public class Fighter {
    private String fighterName;

    public Fighter() {
        this("Mario");
    }

    public Fighter(String _fighter) {
        this.fighterName = _fighter;
    }

    public String name() {
        return fighterName;
    }
}
