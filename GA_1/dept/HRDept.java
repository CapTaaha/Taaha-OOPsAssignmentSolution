public class HRDept extends SuperDept {
    private String departmentName;
    private String getTodaysWork;
    private String getWorkDeadline;
    private String doActivity;

    public HRDept(String departmentName, String getTodaysWork, String getWorkDeadline, String doActivity) {
        this.departmentName = departmentName;
        this.getTodaysWork = getTodaysWork;
        this.getWorkDeadline = getWorkDeadline;
        this.doActivity = doActivity;
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

    public String getDoActivity() {
        return doActivity;
    }

    public void setDoActivity(String doActivity) {
        this.doActivity = doActivity;
    }

    @Override
    public String toString() {
        return departmentName + "\n" + doActivity + "\n" + getTodaysWork + "\n" + getWorkDeadline + "\n"
                + isTodayAHoliday + "\n";
    }

}
