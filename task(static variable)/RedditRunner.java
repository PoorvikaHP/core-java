class RedditRunner {

    public static void main(String[] args) {

        System.out.println("-- First time method call --");
        String arjun = Reddit.validateAndRegister(9456783210L,"arjun@123","18-07-2001","Arjun Reddy","arjun_reddy");
        System.out.println(arjun);

        System.out.println("-- Second time method call --");
        String sneha = Reddit.validateAndRegister(9012345678L,"sneha@456","11-12-2002","Sneha Patil","sneha_patil");
        System.out.println(sneha);

    }
}