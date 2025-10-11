import java.time.LocalDateTime;

// Base class
class SocialPost {
    protected String author;
    protected String content;
    protected LocalDateTime time;

    public SocialPost(String author, String content, LocalDateTime time) {
        this.author = author;
        this.content = content;
        this.time = time;
    }

    public void display() {
        System.out.println("Post by " + author + " at " + time);
        System.out.println(content);
    }
}

// Instagram post
class InstagramPost extends SocialPost {
    private String hashtags;
    private int likes;

    public InstagramPost(String author, String content, LocalDateTime time, String hashtags, int likes) {
        super(author, content, time);
        this.hashtags = hashtags;
        this.likes = likes;
    }

    @Override
    public void display() {
        System.out.println("Instagram Post by @" + author + " at " + time);
        System.out.println(content);
        System.out.println("Hashtags: " + hashtags);
        System.out.println("Likes: " + likes);
    }
}

// Twitter post
class TwitterPost extends SocialPost {
    private int retweets;

    public TwitterPost(String author, String content, LocalDateTime time, int retweets) {
        super(author, content, time);
        this.retweets = retweets;
    }

    @Override
    public void display() {
        System.out.println("Tweet by @" + author + " at " + time);
        System.out.println(content);
        System.out.println("Characters: " + content.length());
        System.out.println("Retweets: " + retweets);
    }
}

// LinkedIn post
class LinkedInPost extends SocialPost {
    private int connections;

    public LinkedInPost(String author, String content, LocalDateTime time, int connections) {
        super(author, content, time);
        this.connections = connections;
    }

    @Override
    public void display() {
        System.out.println("LinkedIn Post by " + author + " (Connections: " + connections + ") at " + time);
        System.out.println("----- Professional Update -----");
        System.out.println(content);
        System.out.println("------------------------------");
    }
}

// Demo
public class SocialMediaFeedDemo {
    public static void main(String[] args) {
        SocialPost[] feed = new SocialPost[3];
        feed[0] = new InstagramPost("alice", "Enjoying the sunset!", LocalDateTime.now(), "#sunset #relax", 120);
        feed[1] = new TwitterPost("bob", "Java is awesome!", LocalDateTime.now(), 45);
        feed[2] = new LinkedInPost("carol", "Started a new position at TechCorp.", LocalDateTime.now(), 500);

        for (SocialPost post : feed) {
            post.display();
            System.out.println();
        }
    }
}