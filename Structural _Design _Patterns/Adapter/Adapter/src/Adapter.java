public class Adapter extends SalaryAccount{

    private Company1 c1=new Company1();

    public Integer CalcSalary(Company2 c2){
        c1.setSalary(c2.getSalary());
        return super.getSalary(c1);

    }
}
