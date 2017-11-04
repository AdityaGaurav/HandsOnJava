import java.io.File;

public class SampleTest {

    public static void main(String[] args){
        System.out.println(new File(".").getAbsolutePath());
        System.out.println(new File(".").getAbsoluteFile());
        System.out.println(new File(System.getProperty("user.dir")));
    }
}
