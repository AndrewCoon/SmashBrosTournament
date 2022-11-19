package smashbrostourney;

import java.util.ArrayList;

public class Player {
    private static int count = 1;
    private int id = 10000000 + count;
    private String name;
    private int seed;
    private Record record;
    private Fighter mFighter;
    private ArrayList<Fighter> fighters = new ArrayList<>();

    public Player() {
        this("John Doe", 0, new Record(), new Fighter());
    }

    public Player(String _name) {
        this.name = _name;
    }

    public Player(String _name, int _seed) {
        this.name = _name;
        this.seed = _seed;
    }

    public Player(String _name, Record _r) {
        this.name = _name;
        this.record = _r;
    }

    public Player(String _name, int _seed, Record _r) {
        this.name = _name;
        this.seed = _seed;
        this.record = _r;
    }

    public Player(String _name, int _seed, Record _r, Fighter _fighter) {
        this.name = _name;
        this.seed = _seed;
        this.record = _r;
        this.mFighter = _fighter;
    }

    public int id() {
        return id;
    }

    public int seed() {
        return seed;
    }

    public String name() {
        return name;
    }

    public Record record() {
        return record;
    }

    public Fighter main() {
        return mFighter;
    }

    public ArrayList<Fighter> used() {
        return fighters;
    }
}
