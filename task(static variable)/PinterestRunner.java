class PinterestRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String rohit = Pinterest.validateAndRegister(9876543211L,"rohit@123","10-01-2000","Rohit Sharma","rohit_9");
        System.out.println(rohit);

        System.out.println("-- Second time method call --");
        String priya = Pinterest.validateAndRegister(9123456789L,"priya@456","25-06-2001","Priya Singh","priya_86");
        System.out.println(priya);

    }
}