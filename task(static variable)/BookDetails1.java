class BookDetails {

    static String bookNames[] = {"Java","Python","C++","HTML","CSS","JavaScript","SQL","DBMS","AI","ML","Data Science","Cloud","Networking","Cyber Security","Blockchain"};
static int bookID[] = {201,202,203,204,205,206,207,208,209,210,211,212,213,214,215};
static char sectionCode[] = {'J','P','C','H','S','J','Q','D','A','M','D','C','N','Y','B'};
static float price[] = {50.0f,45.0f,60.0f,30.0f,35.0f,55.0f,40.0f,65.0f,70.0f,75.0f,80.0f,90.0f,85.0f,95.0f,100.0f};
.
    public static void main(String[] args) {

        for(int i=0;i<bookNames.length;i++){

            if(i%2==0){

                System.out.println(bookNames[i]);
                System.out.println(bookID[i]);
                System.out.println(sectionCode[i]);
                System.out.println(price[i]);

            }
        }
    }
}