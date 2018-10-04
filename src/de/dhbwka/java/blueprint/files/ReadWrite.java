package de.dhbwka.java.blueprint.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Text der in file gespeichert werden soll eingeben");
        String userInput = scan.nextLine();
        scan.close();

        File userInputFile = new File("userInput.txt");
        createFile(userInputFile);

        writeTextToFile(userInput, userInputFile);
        
        System.out.println("Die Datei enthält: \n" + readTextFromFile(userInputFile));
    }
    
    private static String readTextFromFile(File userInputFile)
    {
        String content = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(userInputFile)))
        {
            content = reader.readLine();
            content = content.replaceAll(";", "\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return content;
    }

    private static void writeTextToFile(String userInput, File userInputFile)
    {
        try (PrintWriter print = new PrintWriter(new FileWriter(userInputFile, true)))
        {
            print.print(userInput + ";");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void createFile(File userInputFile)
    {
        if (!userInputFile.exists())
        {
            try
            {
                userInputFile.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }


}
