/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioarray16;

import java.text.DecimalFormatSymbols;
import java.util.Scanner;

/**
 *
 * Desarrollar una aplicacion que ayude a gestionar las notas de un centro educativo.
 * Cada grupo (o clase) está compuesto por 5 alumnos. Se pide leer las notas del PRIMER, SEGUNDO Y TERCER trimestre de un grupp
 * Debemos mostrar al final la nota media del grupo en cada trimestre, y la media del alumno que se encuentra en posicion  N (N es pedida por el usuario)
 */
public class Ejercicioarray16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float clase1_promedio_t1 =0,clase1_promedio_t2 =0,clase1_promedio_t3 =0, clase1_promedio=0;
        
        //creamos el espacio para las notas de los alumnos en el primer trimestre
        float clase_1_t1[] = new float [5];
        float clase_2_t1[] = new float [5];
        float clase_3_t1[] = new float [5];
        //creamos el espacio para las notas de los alumnos en el segundo trimestre
        float clase_1_t2[] = new float [5];
        float clase_2_t2[] = new float [5];
        float clase_3_t2[] = new float [5];
        //creamos el espacio para las notas de los alumnos en el tercer trimestre
        float clase_1_t3[] = new float [5];
        float clase_2_t3[] = new float [5];
        float clase_3_t3[] = new float [5];
        
        //Pedimos las notas de la clase 1 en todos los trimestres
        System.out.println("DIGITE LAS NOTAS DE LOS ESTUDIANTES DE LA CLASE A");
        System.out.println(DecimalFormatSymbols.getInstance().getDecimalSeparator());
        for(int i =0;i<5;i++){
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el primer trimestre: ");
            clase_1_t1[i]=entrada.nextFloat();
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el segundo trimestre: ");
            clase_1_t2[i]=entrada.nextFloat();
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el tercer trimestre: ");
            clase_1_t3[i]=entrada.nextFloat();            
        }
        //sacamos promedio de cada estudiante de la clase 1
        System.out.println("EL PROMEDIO DE LOS ESTUDIANTES DE LA CLASE A ES: ");
        float estudiante_clase1[]= new float [5];
       for(int i=0;i<5;i++){
            estudiante_clase1[i]+=clase_1_t1[i];
            estudiante_clase1[i]+=clase_1_t2[i];
            estudiante_clase1[i]+=clase_1_t3[i];
            estudiante_clase1[i]=estudiante_clase1[i]/3;
           System.out.println("El promedio final del estudiante "+(i+1)+" es de: "+estudiante_clase1[i]);  
       }
         //Pedimos las notas de la clase 2 en todos los trimestres
        System.out.println("DIGITE LAS NOTAS DE LOS ESTUDIANTES DE LA CLASE B");
        
        for(int i =0;i<5;i++){
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el primer trimestre: ");
            clase_2_t1[i]=entrada.nextFloat();
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el segundo trimestre: ");
            clase_2_t2[i]=entrada.nextFloat();
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el tercer trimestre: ");
            clase_2_t3[i]=entrada.nextFloat();
        }
        //sacamos promedio de cada estudiante de la clase 1
        System.out.println("EL PROMEDIO DE LOS ESTUDIANTES DE LA CLASE B ES: ");
        float estudiante_clase2[]= new float [5];
       for(int i=0;i<5;i++){
            estudiante_clase2[i]+=clase_2_t1[i];
            estudiante_clase2[i]+=clase_2_t2[i];
            estudiante_clase2[i]+=clase_2_t3[i];
            estudiante_clase2[i]=estudiante_clase2[i]/3;
           System.out.println("El promedio final del estudiante "+(i+1)+" es de: "+estudiante_clase2[i]);  
       }
         //Pedimos las notas de la clase 3 en todos los trimestres
        System.out.println("DIGITE LAS NOTAS DE LOS ESTUDIANTES DE LA CLASE C");
        
        for(int i =0;i<5;i++){
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el primer trimestre: ");
            clase_3_t1[i]=entrada.nextFloat();
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el segundo trimestre: ");
            clase_3_t2[i]=entrada.nextFloat();
            System.out.print("Digite la nota del estudiante "+(1+i)+ " en el tercer trimestre: ");
            clase_3_t3[i]=entrada.nextFloat();
        }
        //sacamos promedio de cada estudiante de la clase 1
        System.out.println("EL PROMEDIO DE LOS ESTUDIANTES DE LA CLASE C ES: ");
        float estudiante_clase3[]= new float [5];
       for(int i=0;i<5;i++){
            estudiante_clase3[i]+=clase_3_t1[i];
            estudiante_clase3[i]+=clase_3_t2[i];
            estudiante_clase3[i]+=clase_3_t3[i];
            estudiante_clase3[i]=estudiante_clase3[i]/3;
           System.out.println("El promedio final del estudiante "+(i+1)+" es de: "+estudiante_clase3[i]);  
       }
        //ya tenemos guardadas todas las notas y promedios de los estudiantes
        
        //Guardamos el promedio de cada grupo por trimestre
        
        //Promedio clase 1 por trimestres
        int clase1_promedioTrimestre1=0,clase1_promedioTrimestre2=0,clase1_promedioTrimestre3=0;
        for(int i=0;i<5;i++){
            clase1_promedioTrimestre1+=clase_1_t1[i];           
            clase1_promedioTrimestre2+=clase_1_t2[i];
            clase1_promedioTrimestre3+=clase_1_t3[i];            
        }
        clase1_promedioTrimestre1=clase1_promedioTrimestre1/5;
        clase1_promedioTrimestre2=clase1_promedioTrimestre2/5;
        clase1_promedioTrimestre3=clase1_promedioTrimestre3/5;
        
        System.out.println("CLASE A");
        System.out.println("La nota media en el primer trimestre es: "+clase1_promedioTrimestre1);
        System.out.println("La nota media en el segundo trimestre es: "+clase1_promedioTrimestre2);
        System.out.println("La nota media en el tercer trimestre es: "+clase1_promedioTrimestre3);
        
        //Promedio clase 2 por trimestres
        int clase2_promedioTrimestre1=0,clase2_promedioTrimestre2=0,clase2_promedioTrimestre3=0;
        for(int i=0;i<5;i++){
            clase2_promedioTrimestre1+=clase_2_t1[i];           
            clase2_promedioTrimestre2+=clase_2_t2[i];
            clase2_promedioTrimestre3+=clase_2_t3[i];            
        }
        clase2_promedioTrimestre1=clase2_promedioTrimestre1/5;
        clase2_promedioTrimestre2=clase2_promedioTrimestre2/5;
        clase2_promedioTrimestre3=clase2_promedioTrimestre3/5;
        
        System.out.println("CLASE B");
        System.out.println("La nota media en el primer trimestre es: "+clase2_promedioTrimestre1);
        System.out.println("La nota media en el segundo trimestre es: "+clase2_promedioTrimestre2);
        System.out.println("La nota media en el tercer trimestre es: "+clase2_promedioTrimestre3);
      
        //Promedio clase 3 por trimestres
        int clase3_promedioTrimestre1=0,clase3_promedioTrimestre2=0,clase3_promedioTrimestre3=0;
        for(int i=0;i<5;i++){
            clase3_promedioTrimestre1+=clase_3_t1[i];           
            clase3_promedioTrimestre2+=clase_3_t2[i];
            clase3_promedioTrimestre3+=clase_3_t3[i];            
        }
        clase3_promedioTrimestre1=clase3_promedioTrimestre1/5;
        clase3_promedioTrimestre2=clase3_promedioTrimestre2/5;
        clase3_promedioTrimestre3=clase3_promedioTrimestre3/5;
        
        System.out.println("CLASE C");
        System.out.println("La nota media en el primer trimestre es: "+clase3_promedioTrimestre1);
        System.out.println("La nota media en el segundo trimestre es: "+clase3_promedioTrimestre2);
        System.out.println("La nota media en el tercer trimestre es: "+clase3_promedioTrimestre3);
        
        //Pedimos datos para saber que estudiante se busca
        int estudiante = 0, clase_estudiante = 0, fin=0;
        
        System.out.println("...BUSCANDO PROMEDIO FINAL DE ESTUDIANTE...");
        
        do{
            
        
        System.out.println("¿De que número de clase es el estudiante?"
                + "\nCLASE A .Digite 1"
                + "\nCLASE B .Digite 2"
                + "\nCLASE C .Digite 3");
        
        do{
        clase_estudiante = entrada.nextInt();
        if(clase_estudiante>3||clase_estudiante<0){
            System.out.println("NO EXISTE ESA CLASE, INTENTE DE NUEVO: ");
        }
        }while(clase_estudiante>3||clase_estudiante<0);
        
        System.out.println("¿Qué número es el del estudiante?: ");
          
        do{
        estudiante = entrada.nextInt();
        if(estudiante>5||estudiante<0){
            System.out.println("NO EXISTE ESE ESTUDIANTE, INTENTE DE NUEVO: ");
        }
        }while(estudiante>=6||estudiante<=0);
        
        //SACAMOS EL PROMEDIO DEL ESTUDIANTE BUSCADO 
        
        System.out.println("NOTA FINAL");
       
        if(clase_estudiante==1){
                
                System.out.println("EL promedio final del estudiante número "+estudiante+" de la clase A es de: "+estudiante_clase1[estudiante-1]); 
                
            }else if(clase_estudiante==2){
                
                System.out.println("EL promedio final del estudiante número "+estudiante+" de la clase B es de: "+estudiante_clase2[estudiante-1]); 
                
            }else if(clase_estudiante==3){
                
                System.out.println("EL promedio final del estudiante número "+estudiante+" de la clase C es de: "+estudiante_clase3[estudiante-1]); 
            }
        
            System.out.println("¿Desea ver el promedio de otro estudiante?"
                    + "\nSI.Digite 1"
                    + "\nNO.Digite cualquier otra cosa para finalizar el programa. ");
            fin=entrada.nextInt();
            
        
        }while(fin==1);
    
        System.out.println("Gracias por usar este programa que tenga un buen día ---------");
        
    }
    
}
