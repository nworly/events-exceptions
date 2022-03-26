public abstract class Event {
    String title;
    int releaseYear;
    int ageLimit;

    public Event(String title, int releaseYear, int ageLimit) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.ageLimit = ageLimit;
    }

    public String toString() {
        return "[Title: " + title + "] [Release Year: " + releaseYear + "] [Age Limit: " + ageLimit + "]";
    }
}
