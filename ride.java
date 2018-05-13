/*
   ID:sa517001
   LANG:JAVA
   PROG:ride

 */
import java.io.*;

public class ride {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("ride.in"));
        PrintWriter f = new PrintWriter(new FileWriter("ride.out"));
        String comet = bufferedReader.readLine();
        String group = bufferedReader.readLine();
        f.println(count(comet) % 47 == count(group) % 47 ? "GO":"STAY");
        bufferedReader.close();
        f.close();

    }
    public static int count(String string){
        int number = 1;
        for (char c:string.toCharArray()){
            number *= c - 'A' + 1;
        }
        return number;
    }
}
