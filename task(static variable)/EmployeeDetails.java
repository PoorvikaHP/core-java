class EmployeeDetails {

 static String employeeNames[] = {"John","David","Robert","Michael","James","Daniel","Thomas","Joseph","Charles","Henry","William","Edward","Jack","Harry","George"};
static long employeeID[] = {1001,1002,1003,1004,1005,1006,1007,1008,1009,1010,1011,1012,1013,1014,1015};
static char departmentCode[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'};
static double salary[] = {45000,52000,48000,50000,47000,53000,46000,54000,49000,55000,51000,56000,52000,57000,58000};

    public static void main(String[] args) {

        for(int i=0;i<employeeNames.length;i++){

            if(i%2==0){

                System.out.println(employeeNames[i]);
                System.out.println(employeeID[i]);
                System.out.println(departmentCode[i]);
                System.out.println(salary[i]);

            }
        }
    }
}