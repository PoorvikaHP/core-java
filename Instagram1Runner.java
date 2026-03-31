class Instagram1Runner {

    public static void main(String[] args) {

        Instagram1 pavi = new Instagram1();
        pavi.login("FaceBook_ID");

        Instagram1 anu = new Instagram1();
        anu.login("username123", "password123");

        Instagram1 bhoomi = new Instagram1();
        bhoomi.login("user@gmail.com", 123456);

        Instagram1 poorvi = new Instagram1();
        poorvi.login(9876543210L, "mypassword");
    }
}