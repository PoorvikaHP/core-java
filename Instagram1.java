class Instagram1{

    public void login(String faceBook){
        System.out.println("Invoking login Using faceBook :"+faceBook);
    }

    public void login(String userName,String psw){
        System.out.println("Invoking login using User name:"+userName+" and psw :"+psw);
    }

    public void login(String email,long psw){
        System.out.println("Invoking login using email Id:"+email+" and psw :"+psw);
    }
	public void login( long pnum,String psw){
        System.out.println("Invoking login using phone number:"+pnum+"and psw:"+psw);
    }
}