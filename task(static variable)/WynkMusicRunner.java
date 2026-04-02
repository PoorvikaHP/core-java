class WynkMusicRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String saurabh = WynkMusic.validateAndRegister(9988991122L,"saurabh@123","05-05-2000","Saurabh","saurabh_j");
        System.out.println(saurabh);

        System.out.println("-- Second time method call --");
        String ritu = WynkMusic.validateAndRegister(9011002233L,"ritu@456","18-11-2001","Ritushree","ritu_shree");
        System.out.println(ritu);

    }
}