class MusicBand {

    static int maxMembers = 10; 
    String name;
    String genre;
    String leadSinger;
    int albumsReleased;
    String originCity;

    public MusicBand() {

    }

    public MusicBand(String name, String genre, String leadSinger, int albumsReleased, String originCity) {
        this.name = name;
        this.genre = genre;
        this.leadSinger = leadSinger;
        this.albumsReleased = albumsReleased;
        this.originCity = originCity;
    }

    public void displayDetails() {
        System.out.println("Band Name: " + name);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Singer: " + leadSinger);
        System.out.println("Albums Released: " + albumsReleased);
        System.out.println("Origin City: " + originCity);
        System.out.println("Max Members: " + maxMembers);
    }
}