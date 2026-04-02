class StudentDetails {

    static String studentNames[] = {"Aman","Rahul","Priya","Neha","Ravi","Kiran","Sita","Arjun","Pooja","Vikas","Riya","Anil","Meena","Raj","Sneha"};
static int rollNumbers[] = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115};
static boolean passStatus[] = {true,true,true,false,true,true,true,false,true,true,true,false,true,true,true};
static byte sectionNumber[] = {1,1,2,2,1,1,2,2,1,1,2,2,1,2,1};

    public static void main(String[] args) {

        for(int i=0;i<studentNames.length;i++){

            if(i%2!=0){

                System.out.println(studentNames[i]);
                System.out.println(rollNumbers[i]);
                System.out.println(passStatus[i]);
                System.out.println(sectionNumber[i]);

            }
        }
    }
}