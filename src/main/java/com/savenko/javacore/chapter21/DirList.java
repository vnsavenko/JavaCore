package com.savenko.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\chapter21";

        // создать фильтр, возвр true только в отнош доступных для записи файлов

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                if(Files.isWritable(entry)) return true;
                return false;
            }
        };

        // получить и обработать поток ввода из каталога, только доступных для записи файлов
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname), how)){
            System.out.println("Каталог " + dirname);
            for (Path entry : directoryStream
                 ) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);

                if (attributes.isDirectory())
                    System.out.print("<DIR>");
                else
                    System.out.print("    ");

                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException e) {
            System.out.println("Ошибка указания пути " + e);
        } catch (NotDirectoryException e) {
            System.out.println(dirname + " не является каталогом");
        }catch (IOException e){
            System.out.println("Ошибка ввода-вывода: " + e);
        }

    }
}
