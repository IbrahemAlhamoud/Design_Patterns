import java.io.*;

public class CopyFile {

   private InputStream is = null;
    private OutputStream os = null;

    public File copyFileUsingStream(File source, File dest) throws IOException {

        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            System.out.println("Copy.....yes");
            return dest;
        } finally {
            is.close();
            os.close();
        }
    }
}
