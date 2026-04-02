class QuoraRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String amit = Quora.validateAndRegister(9988776655L,"amit@123","15-03-1999","Amit Verma","amit_verma");
        System.out.println(amit);

        System.out.println("-- Second time method call --");
        String sneha = Quora.validateAndRegister(9011223344L,"sneha@456","02-08-2000","Sneha Reddy","sneha_reddy");
        System.out.println(sneha);

    }
}