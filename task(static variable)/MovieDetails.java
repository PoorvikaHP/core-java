class MovieDetails {

    static String movieName[] = {"KGF","Pushpa","RRR","Bahubali","Leo","Jailer","Salaar","Master"};
static String movieHero[] = {"Yash","Allu Arjun","NTR","Prabhas","Vijay","Rajinikanth","Prabhas","Vijay"};
static float price[] = {250f,220f,300f,280f,260f,240f,320f,230f};
static float rating[] = {4.8f,4.5f,4.7f,4.9f,4.3f,4.4f,4.6f,4.2f};

    public static void getMovieDetails() {
        for(int i = 0; i < movieName.length; i++) {
            System.out.println("Movie Name: " + movieName[i]);
            System.out.println("Movie Hero: " + movieHero[i]);
            System.out.println("Ticket Price: " + price[i]);
            System.out.println("Rating: " + rating[i]);
            System.out.println("  ");
        }
    }
}