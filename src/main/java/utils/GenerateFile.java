package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.CSVWriter;

import interfaces.Storable;
import model.Empleado;

public class GenerateFile {
    private String nombreArchivo;
    private LinkedList<Empleado> storable;
      
   public GenerateFile(String nombreArchivo, LinkedList<Empleado> storable) {
    this.nombreArchivo = nombreArchivo;
    this.storable = storable;
}
    
   

    public String getNombreArchivo() {
        return nombreArchivo;
    }
    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }
    
  
public void generarCsv(){
    boolean bandera = false;
    int contador = 0;
    File file = new File("DocumentosGenerados/"+nombreArchivo);

    try {
        // create FileWriter object with file as parameter
        FileWriter outputfile = new FileWriter(file);

        // create CSVWriter object filewriter object as parameter
        CSVWriter writer = new CSVWriter(outputfile);

        // create a List which contains String array
        List<String[]> data = new ArrayList<String[]>();
        data.add(new String[] { "Nombre empleado", "HorasTrabajadas", "Nomina" });
        for (int i = 0; i < storable.size(); i++) {
            System.out.print(i);
            data.add(new String[] { storable.get(i).infoToStore()});
          //  data.add(new String[] { storable.get(i).getNombre(),String.valueOf(storable.get(i).reporteHoras()),String.valueOf(storable.get(i).calcularPago()) });
        

        }
        writer.writeAll(data);
        contador++;
        // closing writer connection
        writer.close();
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
   }
    
    
}
