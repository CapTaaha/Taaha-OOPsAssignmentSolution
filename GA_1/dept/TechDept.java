public class TechDept extends SuperDept {
    private String departmentName;
    private String getTodaysWork;
    private String getWorkDeadline;
    private String getTechStackInformation;

    public TechDept(String departmentName, String getTodaysWork, String getWorkDeadline,
            String getTechStackInformation) {
        this.departmentName = departmentName;
        this.getTodaysWork = getTodaysWork;
        this.getWorkDeadline = getWorkDeadline;
        this.getTechStackInformation = getTechStackInformation;
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

    public String getGetTechStackInformation() {
        return getTechStackInformation;
    }

    public void setGetTechStackInformation(String getTechStackInformation) {
        this.getTechStackInformation = getTechStackInformation;
    }

    @Override
    public String toString() {
        return departmentName + "\n" + getTechStackInformation + "\n" + getTodaysWork + "\n" + getWorkDeadline + "\n"
                + isTodayAHoliday + "\n";
    }

}
