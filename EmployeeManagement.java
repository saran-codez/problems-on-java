public class EmployeeManagement {
    static Employee[] employees = new Employee[100];
    static int i = 0;

    public static void main(String[] args) {

    }

    public static void addEmployee(int empId, String empName, String designation) {
        employees[i] = new Employee(empId, empName, designation);
        i++;
    }

    public static class Employee {
        int empId;
        String empName;
        String designation;

        public Employee(int empId, String empName, String designation) {
            this.empId = empId;
            this.empName = empName;
            this.designation = designation;
        }

        public int getEmpId() {
            return empId;
        }

        public void setEmpId(int empId) {
            this.empId = empId;
        }

        public String getEmpName() {
            return empName;
        }

        public void setEmpName(String empName) {
            this.empName = empName;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

    }
}
