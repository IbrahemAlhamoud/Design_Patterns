import java.io.File;
public class openFile {

    private String name;
    private  String suffix;


    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getSuffix() {
        return this.suffix;
    }

    public File openF(String name1){

        File file=new File(name1);
        setName(file.getName());
        setSuffix(name1.substring(name1.indexOf(".") + 1));
        System.out.println(getName()+" : "+getSuffix());
        return file;
    }
}
