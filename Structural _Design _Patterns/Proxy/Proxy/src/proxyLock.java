public class proxyLock extends Students implements Show {

    private Show show;
    private String name ;
    private String pass;

    private Students students;

    public proxyLock(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    @Override
    public void Show() {

        students=new Students();



        if (students.eq(this.name, this.pass)==true) {
                show = new ExamResults();
                show.Show();
        }

        else {
            System.out.println("error");
        }

    }



}
