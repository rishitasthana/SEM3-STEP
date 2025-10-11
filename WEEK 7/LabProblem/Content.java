// Movie Streaming Platform - Downcasting

abstract class Content {
    protected String title;

    public Content(String title) {
        this.title = title;
    }

    public void showInfo() {
        System.out.println("Now Playing: " + title);
    }
}

// Movie class
class Movie extends Content {
    private String rating;
    private int duration; // in minutes
    private boolean subtitles;

    public Movie(String title, String rating, int duration, boolean subtitles) {
        super(title);
        this.rating = rating;
        this.duration = duration;
        this.subtitles = subtitles;
    }

    public void showMovieDetails() {
        System.out.println("Rating: " + rating);
        System.out.println("Duration: " + duration + " min");
        System.out.println("Subtitles: " + (subtitles ? "Available" : "Not available"));
    }
}

// TV Series class
class TVSeries extends Content {
    private int seasons;
    private int episodes;
    private String nextEpisode;

    public TVSeries(String title, int seasons, int episodes, String nextEpisode) {
        super(title);
        this.seasons = seasons;
        this.episodes = episodes;
        this.nextEpisode = nextEpisode;
    }

    public void showSeriesDetails() {
        System.out.println("Seasons: " + seasons);
        System.out.println("Episodes: " + episodes);
        System.out.println("Next Episode: " + nextEpisode);
    }
}

// Documentary class
class Documentary extends Content {
    private String[] tags;
    private String relatedContent;

    public Documentary(String title, String[] tags, String relatedContent) {
        super(title);
        this.tags = tags;
        this.relatedContent = relatedContent;
    }

    public void showDocumentaryDetails() {
        System.out.print("Tags: ");
        for (String tag : tags) {
            System.out.print(tag + " ");
        }
        System.out.println();
        System.out.println("Related Content: " + relatedContent);
    }
}

// Demo class
public class StreamingDemo {
    public static void main(String[] args) {
        Content[] playlist = new Content[3];
        playlist[0] = new Movie("Inception", "PG-13", 148, true);
        playlist[1] = new TVSeries("Stranger Things", 4, 34, "S5E1");
        playlist[2] = new Documentary("Our Planet", new String[]{"Nature", "Wildlife"}, "Blue Planet");

        for (Content c : playlist) {
            c.showInfo();
            // Downcasting for specific features
            if (c instanceof Movie) {
                ((Movie) c).showMovieDetails();
            } else if (c instanceof TVSeries) {
                ((TVSeries) c).showSeriesDetails();
            } else if (c instanceof Documentary) {
                ((Documentary) c).showDocumentaryDetails();
            }
            System.out.println();
        }
    }
}