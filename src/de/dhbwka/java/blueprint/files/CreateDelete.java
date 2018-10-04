package de.dhbwka.java.blueprint.files;

import java.io.File;
import java.io.IOException;

public class CreateDelete
{
    public static void main(String[] args)
    {
        File directory = new File("directory");
        directory.mkdir();

        File file0 = new File(directory, "file0");
        File file1 = new File(directory, "file1");
        File file2 = new File(directory, "file2");

        createFiles(file0, file1, file2);

        showAbsolutePath(directory);

        deleteFiles(directory, file0, file1, file2);
    }

    private static void createFiles(File foo0, File foo1, File foo2)
    {
        try
        {
            foo0.createNewFile();
            foo1.createNewFile();
            foo2.createNewFile();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void showAbsolutePath(File dir)
    {
        System.out.println(dir.getAbsolutePath());
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++)
        {
            System.out.println(files[i]);
        }
    }

    private static void deleteFiles(File dir, File foo0, File foo1, File foo2)
    {
        foo0.delete();
        foo1.delete();
        foo2.delete();
        dir.delete();
    }
}

