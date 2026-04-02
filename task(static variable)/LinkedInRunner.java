class LinkedInRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String karan = LinkedIn.validateAndRegister(9345678901L,"karan@123","12-08-2001","Karan ","karan_01");
        System.out.println(karan);

        System.out.println("-- Second time method call --");
        String neha = LinkedIn.validateAndRegister(9871234560L,"neha@456","05-02-2002","Neha","neha_87");
        System.out.println(neha);

    }
}