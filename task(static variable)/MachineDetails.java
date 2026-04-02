class MachineDetails {

    static String machineName[] = {"Lathe","Drill","Milling","Grinding","Shaper","Slotting","Boring","CNC"};
    static String machineBrand[] = {"Tata","Bosch","Makita","Hitachi","Kirloskar","Stanley","DeWalt","Siemens"};
    static float price[] = {50000f,30000f,70000f,45000f,40000f,38000f,60000f,120000f};
   static int power[] = {5,3,6,4,4,3,5,8};

    public static void getMachineDetails() {
        for(int i = 0; i < machineName.length; i++) {
            System.out.println("Machine Name: " + machineName[i]);
            System.out.println("Machine Brand: " + machineBrand[i]);
            System.out.println("Price: " + price[i]);
            System.out.println("Power: " + power[i] + " HP");
            System.out.println("   ");
        }
    }
}