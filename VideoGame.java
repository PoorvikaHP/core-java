class VideoGame {

    static int maxPlayers = 4; 
    String title;
    String genre;
    String platform;
    int releaseYear;
    boolean isMultiplayer;

    public VideoGame() {

    }

    public VideoGame(String title, String genre, String platform, int releaseYear, boolean isMultiplayer) {
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.releaseYear = releaseYear;
        this.isMultiplayer = isMultiplayer;
    }

    public void displayDetails() {
        System.out.println("Game Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Platform: " + platform);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Multiplayer: " + isMultiplayer);
        System.out.println("Max Players: " + maxPlayers);
    }
}