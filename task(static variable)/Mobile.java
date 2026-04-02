class Mobile{

static String mobileNames[]={"Samsung","Apple","Vivo","Oppo","Realme","OnePlus","Nokia","Motorola","Redmi","Poco","Infinix","Lava","Sony","Asus","Honor"};
static int modelNo[]={201,202,203,204,205,206,207,208,209,210,211,212,213,214,215};
static boolean stock[]={true,false,true,true,true,true,false,true,true,false,true,true,false,true,true};
static byte warranty[]={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

public static void main(String[] args){

for(int i=0;i<mobileNames.length;i++){

if(i%2!=0){

System.out.println(mobileNames[i]);
System.out.println(modelNo[i]);
System.out.println(stock[i]);
System.out.println(warranty[i]);

}
}
}
}