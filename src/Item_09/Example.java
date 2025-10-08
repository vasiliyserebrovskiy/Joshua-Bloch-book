package Item_09;

import java.io.*;

/**
 * @author Vasilii Serebrovskii
 * @version 1.0 (08.10.2025)
 */
public class Example {

    private static final int BUFFER_SIZE = 8192;

    // try-finally - not the best way to  close the resource. теперь это не наилучшее средство закрытия ресурсов!
    static String firstLineOfFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        try {
            return br.readLine();
        } finally {
            br.close();
        }
    }

    // try-finally with several resources с несколькими ресурсами выглядит уродливо!
    static void copy(String src, String dst) throws IOException {

        InputStream in = new FileInputStream(src);
        try {
            OutputStream out = new FileOutputStream(dst);
            try {
                byte[] buf = new byte[BUFFER_SIZE];
                int n;
                while ((n = in.read(buf)) >= 0)
                    out.write(buf, 0, n);
            } finally {
                out.close();
            }
        } finally {
            in.close();
        }
    }

    // try-with-resources - best  way to close resource!
    static String firstLineOfFileBest(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        }
    }

    // try-with-resources - elegant and good for several resources
    static void copyBest(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }
}
