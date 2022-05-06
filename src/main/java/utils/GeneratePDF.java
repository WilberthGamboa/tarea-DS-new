package utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import interfaces.Printable;
import model.Empleado;

public class GeneratePDF {
    private String nombreArchivoPdf;
    private LinkedList<Empleado> printable;
    public GeneratePDF(String nombreArchivoPdf, LinkedList<Empleado> printable) {
        this.nombreArchivoPdf = nombreArchivoPdf;
        this.printable = printable;
    }
    public String getNombreArchivoPdf() {
        return nombreArchivoPdf;
    }
    public void setNombreArchivoPdf(String nombreArchivoPdf) {
        this.nombreArchivoPdf = nombreArchivoPdf;
    }
    public LinkedList<Empleado> getPrintable() {
        return printable;
    }
    public void setPrintable(LinkedList<Empleado> printable) {
        this.printable = printable;
    }

    
    public void generarPdf() throws DocumentException, FileNotFoundException{
        Document document = new Document();
        PdfWriter.getInstance(document, new FileOutputStream("DocumentosGenerados/"+nombreArchivoPdf));

        document.open();
        PdfPTable table = new PdfPTable(3);
        // Font font = FontFactory.getFont(FontFactory.COURIER, 16, BaseColor.BLACK);

        table.addCell("Nombre empleado");
        table.addCell("Horas Trabajadas");
        table.addCell("Nomina");
        for (int i = 0; i < printable.size(); i++) {

            table.addCell(printable.get(i).getNombre());
            table.addCell(String.valueOf(printable.get(i).reporteHoras()));
            table.addCell(String.valueOf(printable.get(i).calcularPago()));

        }
        document.add(table);
        document.close();
    
       

       
    }
    }
    
    

