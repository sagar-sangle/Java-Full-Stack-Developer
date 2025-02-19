package NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;

public class FileOperation {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/childFolder/nio/sample2.txt");

//        Files.createDirectories(path); create diractoeis only
//        Files.createFile(path); creates a file
        if(Files.exists(path)){
            System.out.println("file exists");
        }else{
            System.out.println("doesnt exist");
        }


        //writing to a file
        List<String> list = Arrays.asList("hi", "working with java", "this is nio");
        Files.write(path,list);

        //reading from a file
        List<String> strings = Files.readAllLines(path);
        for (String lien : strings ){
            System.out.println(lien);
        }

        //copying
        Path copypath1 = Paths.get("src/childFolder/nio/copynio.txt");

        //Files.createFile(copypath1);
        //creates a copy data of a file with another name
        Files.copy(path,copypath1, StandardCopyOption.REPLACE_EXISTING);


        //lsiting files in dir
        Path path1 = Paths.get("src/childFolder");
        Files.list(path1).forEach(System.out::println);

    }
}
