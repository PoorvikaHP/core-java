 class VideoGameRunner {
    public static void main(String[] args) {

        VideoGame g1 = new VideoGame("God of War", "Action", "PS5", 2018, true);
        VideoGame g2 = new VideoGame("FIFA 23", "Sports", "PS5", 2022, true);
        VideoGame g3 = new VideoGame("Minecraft", "Sandbox", "PC", 2011, true);
        VideoGame g4 = new VideoGame("Fortnite", "Battle Royale", "PC", 2017, true);
        VideoGame g5 = new VideoGame("Zelda: BOTW", "Adventure", "Switch", 2017, false);
        VideoGame g6 = new VideoGame("Cyberpunk 2077", "RPG", "PC", 2020, false);
        VideoGame g7 = new VideoGame("Among Us", "Party", "Mobile", 2018, true);
        VideoGame g8 = new VideoGame("Call of Duty", "FPS", "PS5", 2021, true);
        VideoGame g9 = new VideoGame("Hollow Knight", "Platformer", "Switch", 2017, false);
        VideoGame g10 = new VideoGame("Overwatch", "FPS", "PC", 2016, true);

        g1.displayDetails();
        g2.displayDetails();
        g3.displayDetails();
        g4.displayDetails();
        g5.displayDetails();
        g6.displayDetails();
        g7.displayDetails();
        g8.displayDetails();
        g9.displayDetails();
        g10.displayDetails();
    }
}