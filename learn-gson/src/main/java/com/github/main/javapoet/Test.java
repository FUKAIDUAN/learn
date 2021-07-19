//package com.github.main.javapoet;
//
//import com.squareup.javapoet.JavaFile;
//import com.squareup.javapoet.MethodSpec;
//import com.squareup.javapoet.TypeSpec;
//
//import javax.lang.model.element.Modifier;
//import java.io.IOException;
//
//
///**
// * JavaPoet 是一个用来生成.java 源文件的的JavaAPI
// *
// * 当做如注解或者数据库模式、协议格式等事情时，生成源文件就比较有用处
// * @author dfk
// * @Description TODO
// * @create 2021/7/18 9:08
// */
//public class Test {
//
//    public static void main(String[] args) {
//        MethodSpec main = MethodSpec.methodBuilder("main")
//                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
//                .returns(Void.class)
//                .addParameter(String[].class, "args")
//                .addStatement("$T.out.println($S)", System.class, "Hello World!")
//                .build();
//
//        TypeSpec helloWorld = TypeSpec.classBuilder("HelloWord")
//                .addModifiers(Modifier.PUBLIC, Modifier.FINAL)
//                .addMethod(main)
//                .build();
//
//        JavaFile javaFile = JavaFile.builder("com.example.helloWorld", helloWorld)
//                .build();
//        try {
////            们将文件通过Sytem.out 进行输出，
////            但是同样也可以使用(JavaFile.toString()) 得到string字符串，
////            或者通过 (JavaPoet.writeTo()) 方法写入到文件系统中。
//            javaFile.writeTo(System.out);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
