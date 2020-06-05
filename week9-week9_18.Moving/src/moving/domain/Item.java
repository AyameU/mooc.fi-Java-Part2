package moving.domain;

public class Item implements Thing, Comparable<Item>{
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public int compareTo(Item o) {
        if(this.volume > o.getVolume()) {
            return 1;
        }
        if(this.volume < o.getVolume()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
