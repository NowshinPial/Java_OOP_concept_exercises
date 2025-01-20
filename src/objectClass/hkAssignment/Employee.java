package objectClass.hkAssignment;
/**
 * Develop an Employee class with the state eno, ename, dept, sal
 *
 * - When we store Employee objects in a Map
 * 	1. Employee objects must grouped on 'dept' wise
 *  2. Employee objects must compare by using 'dept & eno'
 * 	3. Employee objects 'state' must be printed
 *
 * For implementing above requirements, we must override
 * 	1. hashCode()  by returning 'dept' value
 * 	2. equals()    by comparing 'dept and eno' of two objects
 * 	3. toString()  by returning all fields available in Employee class
 *
 */
public class Employee {

    //Fields
    private int eno;
    private String ename;
    private String dept;
    private double sal;

    //Constructors
    public Employee(int eno, String ename, String dept, double sal) {
        this.eno = eno;
        this.ename = ename;
        this.dept = dept;
        this.sal = sal;
    }

    //Setter and Getter
    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getEno() {
        return eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEname() {
        return eno;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept() {
        return dept;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public double getSal() {
        return sal;
    }

    //Hashing algorithm
    @Override
    public int hashCode() {
        return dept.hashCode();
    }

    //Equals method
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employee emp){//Java 14v new feature
                                            //Pattern matching for instanceof operator
        return (this.dept.equals(emp.dept)) && (this.eno == emp.eno);

    }
    return false;
}

    //toString method
    @Override
    public String toString() {
        return "\nEmployee("+eno+", "+ ename + ", "+ dept+ ", "+ sal +")";
    }
}
