class MusicBandRunner {
    public static void main(String[] args) {

        MusicBand b1 = new MusicBand("Coldplay", "Rock", "Chris Martin", 9, "London");
        MusicBand b2 = new MusicBand("Maroon 5", "Pop Rock", "Adam Levine", 7, "Los Angeles");
        MusicBand b3 = new MusicBand("Imagine Dragons", "Alternative", "Dan Reynolds", 5, "Las Vegas");
        MusicBand b4 = new MusicBand("Linkin Park", "Nu Metal", "Chester Bennington", 6, "California");
        MusicBand b5 = new MusicBand("BTS", "K-Pop", "RM", 4, "Seoul");
        MusicBand b6 = new MusicBand("Queen", "Rock", "Freddie Mercury", 15, "London");
        MusicBand b7 = new MusicBand("OneRepublic", "Pop Rock", "Ryan Tedder", 6, "Colorado");
        MusicBand b8 = new MusicBand("The Beatles", "Rock", "John Lennon", 12, "Liverpool");
        MusicBand b9 = new MusicBand("Arctic Monkeys", "Indie Rock", "Alex Turner", 6, "Sheffield");
        MusicBand b10 = new MusicBand("Foo Fighters", "Rock", "Dave Grohl", 10, "Seattle");

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
        b4.displayDetails();
        b5.displayDetails();
        b6.displayDetails();
        b7.displayDetails();
        b8.displayDetails();
        b9.displayDetails();
        b10.displayDetails();
    }
}