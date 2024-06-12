package arraylist3;

import encapsulation.Person;

import java.util.ArrayList;
import java.util.List;

public class JobsUtilityMethods {

    /**
     * This method will get jobId of job that highest salary.
     * Example:
     *  .getJobOfHighestSalary(jobs); return "JOB_ID"
     */
    public static String getJobOfHighestSalary(List<Job> jobs){
        String jobId=jobs.get(0).getJobId();
        int highestSalary=jobs.get(0).getSalary();

        for(Job j:jobs){
            if(j.getSalary()>highestSalary){
                jobId=j.getJobId();
                highestSalary=j.getSalary();
            }
        }
        return jobId;
    }

    /**
     * Method will return list of job titles that has salary less than average salary.
     *
     * Example:
     *  .getTitlesLessThanAvgSalary(jobs); -> return [Stock Clerk, ....]
     */
    public static List<String> getTitlesLessThanAvgSalary(List<Job> jobs){
        // Find average salary
        int sum=0;
        for(Job j : jobs){
            sum+=j.getSalary();
        }
        int averageSalary=sum/jobs.size();

        // Get titles of jobs that has less than average salary
        List<String> titles=new ArrayList<>();

        for(Job j:jobs){
            if(j.getSalary()<averageSalary){
                titles.add(j.getTitle());
            }
        }
        return titles;
    }

    /**
     * Method returns salary of provided job title.
     *
     * Example:
     *  .getSalaryOf(jobs,"Accountant"); -> return 9000;
     */
    public static int getSalaryOf(List<Job> jobs, String title){
        for(Job j: jobs){
            if(j.getTitle().equalsIgnoreCase(title)){
                return j.getSalary();
            }
        }
        return -1;
    }

    /**
     * Method updates salary for provided titles with specific percentage.
     *
     * Example:
     *  .increaseSalary(jobs, titles, 10); -> return list of all jobs with updates salaries
     * @param jobs
     * @param titles
     * @param percentage
     * @return List<Job>
     */
    public static List<Job> increaseSalary(List<Job> jobs, List<String> titles, int percentage){
        for(String t : titles){
            for(int i=0; i<jobs.size(); i++){
                if(jobs.get(i).getTitle().equalsIgnoreCase(t)){
                    // Updating salary
                    int salary=jobs.get(i).getSalary();
                    salary= salary + salary*percentage/100;
                    jobs.get(i).setSalary(salary);
                    break;
                }
            }
        }
        return jobs;
    }

    /**
     * Method return job object of provided jobId.
     *
     * Example:
     *  .getJobById(jobs,"AD_PRES"); -> return job["President"...]
     */
    public static Job getJobById(List<Job> jobs, String jobId){
        for(Job j : jobs){
            if(j.getJobId().equalsIgnoreCase(jobId)){
                return j;
            }
        }
        return null;
    }


}














