public class AdminDept extends SuperDept {
    private String departmentName;
    private String getTodaysWork;
    private String getWorkDeadline;

    public AdminDept(String departmentName, String getTodaysWork, String getWorkDeadline) {
        this.departmentName = departmentName;
        this.getTodaysWork = getTodaysWork;
        this.getWorkDeadline = getWorkDeadline;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getGetTodaysWork() {
        return getTodaysWork;
    }

    public void setGetTodaysWork(String getTodaysWork) {
        this.getTodaysWork = getTodaysWork;
    }

    public String getGetWorkDeadline() {
        return getWorkDeadline;
    }

    public void setGetWorkDeadline(String getWorkDeadline) {
        this.getWorkDeadline = getWorkDeadline;
    }

    @Override
    public String toString() {
        return departmentName + "\n" + getTodaysWork + "\n" + getWorkDeadline + "\n" + isTodayAHoliday + "\n";
    }

}
