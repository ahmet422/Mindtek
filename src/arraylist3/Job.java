package arraylist3;

public class Job {

    private String title;
    private String jobId;
    private int salary;

    public Job(String title, String jobId, int salary) {
        this.title = title;
        this.jobId = jobId;
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "title='" + title + '\'' +
                ", jobId='" + jobId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
