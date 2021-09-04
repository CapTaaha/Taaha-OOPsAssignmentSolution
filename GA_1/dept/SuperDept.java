public class SuperDept {
    private String departmentName;
    private String getTodaysWork;
    private String getWorkDeadline;
    protected String isTodayAHoliday = "Today is not a holiday";

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

    public String getIsTodayAHoliday() {
        return isTodayAHoliday;
    }

    public void setIsTodayAHoliday(String isTodayAHoliday) {
        this.isTodayAHoliday = isTodayAHoliday;
    }

    @Override
    public String toString() {
        return "SuperDepartment [departmentName=" + departmentName + ", getTodaysWork=" + getTodaysWork
                + ", getWorkDeadline=" + getWorkDeadline + ", isTodayAHoliday=" + isTodayAHoliday + "]";
    }
}
