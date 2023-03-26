import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createFileCopy {

    public File writeFile(){
        String PATH = "C:\\Users\\User\\Desktop";
        String directoryName = PATH.concat("\\fileMp3\\");
        String fileName = "fileCopy.mp4";

        File directory = new File(directoryName);
        if (! directory.exists()){
            directory.mkdir();
        }

        File file = new File(directoryName.concat(fileName));
        try{
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.close();
            System.out.println(file.getAbsoluteFile());
        }
        catch (IOException e){
            e.printStackTrace();
            System.exit(-1);
        }

        return file;
    }

}
