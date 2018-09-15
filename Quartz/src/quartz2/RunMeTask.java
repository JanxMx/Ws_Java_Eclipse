package quartz2;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;

/**
 * 1.Scheduler Task (Programador de Tareas):
 *      -Clase de JAVA,
 *      -Tarea que se desea Programar
 *
 */

public class RunMeTask {
    public void printMe(){

        Properties prop = new Properties();
        InputStream is = null;
        try {
                is=new FileInputStream("src/quartz2/DatosQuartz.properties");
                prop.load(is);
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

        System.out.println("*Lectura del Directorio");
        String sDirectorio = prop.getProperty("directorio");
        //String sDirectorio = "c:\\LecturaArchivo";
        File f = new File(sDirectorio);
        if (f.exists()){
            //Recuperacion de todos los archivos del directorio
             File[] ficheros = f.listFiles();
            if(ficheros.length>0){
                //Existen archivos en el Directorio
                // Recuperar los archivos de una extension especifica
                 ficheros = f.listFiles(new Filtro(prop.getProperty("extension")));
		if(ficheros.length>0){
                     for (int x=0;x<ficheros.length;x++){
			  System.out.println("Archivo Encontrado No."+(x+1));
			  System.out.println(ficheros[x].getName());

                          //Obtencion de la Fecha de Creacion (ultima actualizacion)
			  long fechaCreacion=ficheros[x].lastModified();
			  //conversion de milisegundos a fecha
			  Date d = new Date(fechaCreacion);
			  Calendar c = new GregorianCalendar();
			  c.setTime(d);
			  int meses, diaC, mesC, annioC, diaA, mesA, annioA;
                          diaC = c.get(Calendar.DATE);
                          mesC = c.get(Calendar.MONTH)+1;//Enero=0 Dic=11
                          annioC = c.get(Calendar.YEAR);
                          System.out.println ("Fecha de Creacion:"+diaC + "/" + mesC +"/" + annioC);

                          //Obtencion de la Fecha Actual
                          Calendar cn = Calendar.getInstance();
                          diaA = cn.get(Calendar.DATE);
                          mesA = cn.get(Calendar.MONTH)+1;
                          annioA = cn.get(Calendar.YEAR);
                          System.out.println ("fecha Actual:"+diaA + "/" + mesA +"/" + annioA);

                          //Obtencion de los meses del Archivo a la fecha actual
                          if (annioC == annioA) {
                               meses = mesA - mesC;
                           } else {
                                    meses = 12 - mesC;
                                    meses += mesA;
                                    --annioA;
                                    if (annioA - annioC > 0) {
                                       meses += (annioA - annioC)*12;
                                        }
                           }
                           System.out.println("Meses de Diferencia:"+meses);

                           //Eliminacion de Archivos mayores a 6 meses
                           if(meses>6){
                               System.out.println("Fecha del Archivo mayor a 6 meses. Se procede a Eliminar");
                                    if (ficheros[x].delete()){
                                            System.out.println("Archivo borrado con éxito");
                                    }else{
                                            System.out.println(" El archivo no se ha podido borrar");
                                    }
                           }
                      }
                }else{
                        System.out.println("*No existen Archivos "+prop.getProperty("extension")+" en el Directorio especificado*");
                }
            }else{
               System.out.println("**No existen Archivos en el Directorio "+prop.getProperty("directorio")+"**");
            }
        } else{
               System.out.println("***No existe el Directorio "+prop.getProperty("directorio")+"****");
        }
    }

}
