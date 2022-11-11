//package com.example.exceptiontest;
//
//import org.apache.tomcat.util.http.fileupload.FileUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        String path = "C:/Users/USER/Documents/Test";
//
//        File[] directories = new File(path).listFiles(File::isDirectory);
//        Arrays.stream(directories).forEach(temp->{
//            try {
//                System.out.println(temp);
//                FileUtils.cleanDirectory(temp);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        });
////        for (File file : directories){
////            FileUtils.cleanDirectory(file);
////        }
//
//    }
//}
