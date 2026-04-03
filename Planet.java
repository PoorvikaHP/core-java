class Planet {

    static int solarSystemPlanets = 8;  
    String name;
    double mass;      
    double radius;    
    int moons;
    boolean hasRings;

    public Planet() {

    }

    public Planet(String name, double mass, double radius, int moons, boolean hasRings) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
        this.moons = moons;
        this.hasRings = hasRings;
    }

    public void displayDetails() {
        System.out.println("Planet Name: " + name);
        System.out.println("Mass: " + mass);
        System.out.println("Radius: " + radius + " km");
        System.out.println("Number of Moons: " + moons);
        System.out.println("Has Rings: " + hasRings);
        System.out.println("Planets in Solar System: " + solarSystemPlanets);
    }
}