public class Main {
    public static void main(String[] args) {
        for (Event event : getMovies()) {
            validateEvent(event);
        }
        for (Event event : getTheatres()) {
            validateEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Adaptation", 2002, 16),
                new Movie("Wayne", 2019, 0),
                new Movie("The Matrix", 1999, 16)

        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Look Back in Anger", 1956, 18),
                new Theatre("The Bald Soprano", 1950, 18),
                new Theatre("Machinal", 1928, 18)

        };
    }

    public static void validateEvent(Event event) {
        if (event.title == null || event.ageLimit == 0 || event.releaseYear == 0) {
            throw new RuntimeException("Некорректно заполнены поля в событии: " + event);
        }
    }
}
