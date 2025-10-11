// Digital Art Gallery - Downcasting

abstract class Artwork {
    protected String title;
    protected String artist;

    public Artwork(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public void displayInfo() {
        System.out.println("Artwork: " + title + " by " + artist);
    }
}

// Painting class
class Painting extends Artwork {
    private String brushTechnique;
    private String colorPalette;
    private String frameSpec;

    public Painting(String title, String artist, String brushTechnique, String colorPalette, String frameSpec) {
        super(title, artist);
        this.brushTechnique = brushTechnique;
        this.colorPalette = colorPalette;
        this.frameSpec = frameSpec;
    }

    public void showPaintingDetails() {
        System.out.println("Brush Technique: " + brushTechnique);
        System.out.println("Color Palette: " + colorPalette);
        System.out.println("Frame: " + frameSpec);
    }
}

// Sculpture class
class Sculpture extends Artwork {
    private String material;
    private String dimensions;
    private String lighting;

    public Sculpture(String title, String artist, String material, String dimensions, String lighting) {
        super(title, artist);
        this.material = material;
        this.dimensions = dimensions;
        this.lighting = lighting;
    }

    public void showSculptureDetails() {
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Lighting: " + lighting);
    }
}

// DigitalArt class
class DigitalArt extends Artwork {
    private String resolution;
    private String fileFormat;
    private String interactiveElements;

    public DigitalArt(String title, String artist, String resolution, String fileFormat, String interactiveElements) {
        super(title, artist);
        this.resolution = resolution;
        this.fileFormat = fileFormat;
        this.interactiveElements = interactiveElements;
    }

    public void showDigitalArtDetails() {
        System.out.println("Resolution: " + resolution);
        System.out.println("File Format: " + fileFormat);
        System.out.println("Interactive Elements: " + interactiveElements);
    }
}

// Photography class
class Photography extends Artwork {
    private String cameraSettings;
    private String editingDetails;
    private String printSpec;

    public Photography(String title, String artist, String cameraSettings, String editingDetails, String printSpec) {
        super(title, artist);
        this.cameraSettings = cameraSettings;
        this.editingDetails = editingDetails;
        this.printSpec = printSpec;
    }

    public void showPhotographyDetails() {
        System.out.println("Camera Settings: " + cameraSettings);
        System.out.println("Editing Details: " + editingDetails);
        System.out.println("Print Spec: " + printSpec);
    }
}

// Demo class
public class ArtGalleryDemo {
    public static void main(String[] args) {
        Artwork[] gallery = new Artwork[4];
        gallery[0] = new Painting("Sunset Bliss", "Ravi", "Impasto", "Warm Tones", "Ornate Gold");
        gallery[1] = new Sculpture("The Thinker", "Meera", "Bronze", "2m x 1m x 1m", "Spotlight");
        gallery[2] = new DigitalArt("Neon Dreams", "Arjun", "4K", "PNG", "Touch Responsive");
        gallery[3] = new Photography("Urban Shadows", "Priya", "ISO 400, f/2.8", "HDR, Color Grading", "Matte 12x18");

        for (Artwork art : gallery) {
            art.displayInfo();
            // Downcasting for curator-specific details
            if (art instanceof Painting) {
                ((Painting) art).showPaintingDetails();
            } else if (art instanceof Sculpture) {
                ((Sculpture) art).showSculptureDetails();
            } else if (art instanceof DigitalArt) {
                ((DigitalArt) art).showDigitalArtDetails();
            } else if (art instanceof Photography) {
                ((Photography) art).showPhotographyDetails();
            }
            System.out.println();
        }
    }
}