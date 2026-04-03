 class PlanetRunner {
    public static void main(String[] args) {

        Planet p1 = new Planet("Mercury", 0.33, 2439.7, 0, false);
        Planet p2 = new Planet("Venus", 4.87, 6051.8, 0, false);
        Planet p3 = new Planet("Earth", 5.97, 6371.0, 1, false);
        Planet p4 = new Planet("Mars", 0.642, 3389.5, 2, false);
        Planet p5 = new Planet("Jupiter", 1898, 69911, 79, true);
        Planet p6 = new Planet("Saturn", 568, 58232, 82, true);
        Planet p7 = new Planet("Uranus", 86.8, 25362, 27, true);
        Planet p8 = new Planet("Neptune", 102, 24622, 14, true);
        Planet p9 = new Planet("Pluto", 0.013, 1188.3, 5, false);
        Planet p10 = new Planet("Kepler-22b", 36, 15000, 0, false);

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
        p4.displayDetails();
        p5.displayDetails();
        p6.displayDetails();
        p7.displayDetails();
        p8.displayDetails();
        p9.displayDetails();
        p10.displayDetails();
    }
}