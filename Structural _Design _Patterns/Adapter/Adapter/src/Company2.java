//Adaptee
public class Company2 {

    private String name ;
    private Integer age;
    private Integer Salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public Integer getSalary() {
        return this.Salary;
    }
    public void Show(int Salary){
        System.out.println("Company2---> the Name : "+this.name+" the age ; "+this.age+" the Salary :"+Salary);
    }
}
