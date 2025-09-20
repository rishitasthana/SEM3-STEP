class Instrument {
    protected String name;
    protected String material;

    public Instrument(String name, String material) {
        this.name = name;
        this.material = material;
    }

    public void displayInfo() {
        System.out.println("Instrument: " + name);
        System.out.println("Material: " + material);
    }
}

class Piano extends Instrument {
    private int keys;

    public Piano(String name, String material, int keys) {
        super(name, material);
        this.keys = keys;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Keys: " + keys);
    }
}

class Guitar extends Instrument {
    private int strings;

    public Guitar(String name, String material, int strings) {
        super(name, material);
        this.strings = strings;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Strings: " + strings);
    }
}

class Drum extends Instrument {
    private String type;

    public Drum(String name, String material, String type) {
        super(name, material);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Drum Type: " + type);
    }
}

public class MusicalInstruments {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Piano("Grand Piano", "Wood", 88);
        instruments[1] = new Guitar("Acoustic Guitar", "Wood", 6);
        instruments[2] = new Drum("Bass Drum", "Metal", "Percussion");

        for (Instrument inst : instruments) {
            inst.displayInfo();
            System.out.println();
        }
    }
}