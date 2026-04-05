class Employee1{
    static int empId = 001;
    static String empName = "Rahul";

    public static void showEmpId() {
        System.out.println("Employee ID: " + empId);
    }

    public static void showEmpId(int empId) {
        System.out.println("Employee ID (parameter): " + empId);
    }

    public static String showEmpName() {
        System.out.println("Employee Name: " + empName);
        return empName;
    }

    public static String showEmpName(String empName) {
        System.out.println("Employee Name (parameter): " + empName);
        return empName;
    }
}