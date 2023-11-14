package carfactory;

public class Customer {

 
    private String gradeRequest;
    private boolean hasCompanyContract;
    
    public Customer(String gradeRequest, boolean hasCompnyContract) {
      this.gradeRequest=gradeRequest;
      this.hasCompanyContract=hasCompnyContract;
  }

    public boolean hasCompanyContract() {
      return hasCompanyContract;
    }
    
    public String getGradeRequest() {
      return gradeRequest;
    }
    
}
