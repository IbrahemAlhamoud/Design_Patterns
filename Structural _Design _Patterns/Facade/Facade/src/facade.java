import java.io.File;
import java.io.IOException;

public class facade {

    public void show(String name) throws IOException {

        openFile op =new openFile();
        File f1=op.openF(name);
        checkVideo ch = new checkVideo();
        File f2=ch.checkV(f1,op);
        createFileCopy c1 = new createFileCopy();
        File f3= c1.writeFile();
        CopyFile c= new CopyFile();
        File f4 = c.copyFileUsingStream(f2,f3);
        ConvertToMp3 cn =new ConvertToMp3();
        cn.convert(f4,op);

    }
}
