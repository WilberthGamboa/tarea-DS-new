package model;

import java.io.FileNotFoundException;
import java.util.LinkedList;

import com.itextpdf.text.DocumentException;

import interfaces.Storable;
import utils.GenerateFile;
import utils.GeneratePDF;

public class Cliente {

  

    

    public Cliente() {
      
    }



    public void iniciar() throws FileNotFoundException, DocumentException{
        LinkedList<Empleado> empleados = new LinkedList<>();
        Empleado a = new Empleado("wilberth", 20);
        Empleado b = new Empleado("mildred", 30);
        Empleado c = new Empleado("jacob", 40);

        empleados.add(a);
        empleados.add(b);
        empleados.add(c);

       // GeneratePDF generatePDF = new GeneratePDF("archivo.pdf");
       
       
        GenerateFile generateFile = new GenerateFile("archivo.csv",empleados);
        GeneratePDF generatePDF = new GeneratePDF("archivo.pdf", empleados);
        generateFile.generarCsv();
        generatePDF.generarPdf();

    }
    
}
