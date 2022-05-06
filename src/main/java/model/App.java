package model;

import java.io.FileNotFoundException;

import com.itextpdf.text.DocumentException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws FileNotFoundException, DocumentException
    {
        Cliente x = new Cliente();
        x.iniciar();
        System.out.println("xd");
    }
}
