package SRP.Example1.ProblematicCode;

public class Employee {

    private int id;

    public int getId() {
        return this.id;
    }

    public String fetchBioData() {
        return "Some bio data";
    }

    public double calculateSalary() {
        return 0;
    }

    public void printPerformanceData() {
        System.out.println("Some performance related data");
    }

    //Any issues with class
    /*
        1.We have to change this class when logic of calculateSalary change...currently we have old an new tax regime
        then what if one more type regime comes...then we have to this logic of calculateSalary

        2.Assume fetchBioData taking resume then giving bioData....then what if we have take linkedin then giving bio data
        again we have to change this class because of changes in fetchBioData logic.

        3.Assume printPerformanceData printing data in pdf format...now we want it excel format...
        again we have to change this class because of changes in printPerformanceData logic.

        4.If we add any attributes to employee...again we have to add those attributes and getters and setters also

        Conclusion :: Main problem is This class handling multiple responsibilities.
     */

    //Vamsi Solutions
    /*
        1.We can have separate classes for these functions...so each class has own logic..
        we will have object of those classes in this class..then we will call respective function.

     */
}
