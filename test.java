import java.io.*;
import java.util.StringTokenizer;

/*
    ID:sa517001
    TASK:test
    LANG:JAVA
 */
public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("test.in"));
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("test.out")));

        StringTokenizer stringTokenizer = new StringTokenizer(in.readLine());
        int a = Integer.valueOf(stringTokenizer.nextToken());
        int b = Integer.valueOf(stringTokenizer.nextToken());
        out.println(a + b);
        out.close();
    }
}
