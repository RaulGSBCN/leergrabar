import java.io.*;

public class LeerGrabar {
    public static void main(String[] args) {

            String inputFile = args[0];
            String outputFile = args[1];


            try (
                    InputStream inputStream = new FileInputStream(inputFile);
                    OutputStream outputStream = new FileOutputStream(outputFile);
            ) {

                int leeByte;

                while ((leeByte = inputStream.read()) != -1) {
                    outputStream.write(leeByte);
                }

            } catch (IOException ex) {
            }

        }


}
