class ThreadsRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String aditya = Threads.validateAndRegister(9876543212L,"aditya@123","14-04-2001","Aditya Sharma","aditya_sharma");
        System.out.println(aditya);

        System.out.println("-- Second time method call --");
        String kavya = Threads.validateAndRegister(9123456781L,"kavya@456","09-09-2002","Kavya Reddy","kavya_reddy");
        System.out.println(kavya);

    }
}