class CarDetails{

    static String carsNames[] = {"Alto","Baleno","City","Creta","Fortuner","Innova","i20","Swift","Scorpio","Verna","Thar","Nexon","Harrier","Seltos","Venue"};
static long carnumber[] = {1023345,4587578,739771,267648,6779150,7883476,5878802,6990914,8788231,7468712,5678921,4567812,3456712,2345612,1234512};
static char code[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o'};
static float Prize[] = {50000f,60000f,30000f,60000f,40000f,56000f,70000f,89000f,34000f,79000f,45000f,23000f,67000f,52000f,61000f};

    public static void main(String[] args) {

        for(int index = 0; index < carsNames.length; index++) {

            if(index % 2 != 0) {

                System.out.println(carsNames[index]);
                System.out.println(carnumber[index]);
                System.out.println(code[index]);
                System.out.println(Prize[index]);

            }
        }
    }
}