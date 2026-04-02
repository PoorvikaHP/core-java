class TwitterRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String rakesh = Twitter.validateAndRegister(9876543210L,"rakesh@123","15-05-2001","Rakesh Kumar","rakesh_k");
                
        System.out.println(rakesh);

        System.out.println("-- Second time method call --");
        String manoj = Twitter.validateAndRegister(9988776655L,"manoj@789","10-03-2000","Manoj Verma","manoj_v");
        
        System.out.println(manoj);

    }
}