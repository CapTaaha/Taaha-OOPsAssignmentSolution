public class Driver {
    public static void main(String[] args) {
        AdminDept adminDept = new AdminDept("Welcome to Admin Department", "Complete your documents submission",
                "Complete by EOD");
        System.out.println(adminDept);

        HRDept hRDept = new HRDept("Welcome to HR Department", "Fill today’s timesheet and mark your attendance",
                "Complete by EOD", "Team Lunch");
        System.out.println(hRDept);

        TechDept techDept = new TechDept("Welcome to Tech Department", "Complete coding of Module 1", "Complete by EOD",
                "Core Java");
        System.out.println(techDept);
    }
}
