class GaanaRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String yash = Gaana.validateAndRegister(9871122334L,"yash@123","22-09-2001","Yash Raj","yash_raj");
        System.out.println(yash);

        System.out.println("-- Second time method call --");
        String anika = Gaana.validateAndRegister(9122334455L,"anika@456","30-12-2002","Anika Sharma","anika_sharma");
        System.out.println(anika);

    }
}