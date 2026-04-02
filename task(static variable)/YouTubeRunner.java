class YouTubeRunner{

    public static void main(String []search){

        YouTube tube=new YouTube();
        
        String msg=tube.search("Devil","Darshan");
        System.out.println(msg);

        boolean login=tube.login("Poorvika HP","abc@123");
        System.out.println(login);
        
        String login2=tube.login("abcsa@gmail.com","abc","abc");
        System.out.println(login2);

    }
}