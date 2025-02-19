package IO;

import java.io.File;
import java.io.FilenameFilter;

public class DiractoryAndFileOperation {

    public static void main(String[] args) {

        //create dir

        File file = new File("src/childFoler");
        if (file.mkdir()){
            System.out.println("file created succsfully "+file.getAbsoluteFile());

        }else{
            System.out.println("file not created");
        }

        //create multiple dir
        File multiFile = new File("src/childFolder/sample1");
        if (multiFile.mkdirs()) {
            System.out.println("Directories created: " + multiFile.getAbsolutePath());
        } else {
            System.out.println("Failed to create directories: " + multiFile.getAbsolutePath());
        }

        File file3 = new File("src/childFolder");

        //filtering files using filenameFilter
        FilenameFilter samplefiles = (dir,name)->name.startsWith("demo");
        File[] files = file3.listFiles(samplefiles);

        if (files != null) {
            for (File f : files){

                System.out.println("file name is :"+f.getName());
            }
        }else{
            System.out.println("filles are empty");
        }


        //reanming files

        File oldFile = new File("src/childFolder/sample1.txt"); // Old file
        File newFile = new File("src/childFolder/renamed_sample.txt"); // New name

        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully: " + newFile.getAbsolutePath());
        } else {
            System.out.println("Failed to rename file.");
        }


    }
}
