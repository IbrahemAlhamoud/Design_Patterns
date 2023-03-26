import java.io.File;
import java.io.IOException;
import java.lang.String;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class ConvertToMp3 {

    public void convert(File f1, openFile op ) throws IOException {
        String name = op.getName();
        System.out.println(name);
        String[] name1 = name.split("\\.");
        String file= name1[0].concat(".mp3");
        Path yourFile = Paths.get(f1.getAbsolutePath());
        Path move = Files.move(yourFile, yourFile.resolveSibling(file), REPLACE_EXISTING);
        System.out.println("Convert Mp4 ---> mp3");

    }
}
