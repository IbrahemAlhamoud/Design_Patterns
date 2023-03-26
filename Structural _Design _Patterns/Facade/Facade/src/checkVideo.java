import java.io.File;

public class checkVideo   {



    private String[] s={
            "mp4",
            "mov",
            "wmv"
    };



    public File checkV(File f,openFile op){
        File f1=f;
        for (String s1:s) {
            if(s1.equals(op.getSuffix())) {
                System.out.println("yes it videos");
                System.out.println("File created: " + f1.getName());
                System.out.println("Writeable: " + f1.canWrite());
                System.out.println("Readable " + f1.canRead());
                System.out.println("File size in bytes " + f1.length());
                return f1;}

            }
            return null;

            }
        }

