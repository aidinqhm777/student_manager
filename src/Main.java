import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            FileIO.writeToFile("./src/data/File","xx",0);
//            System.out.println( new String (FileIO.readFromFile("File",0,4)) );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
