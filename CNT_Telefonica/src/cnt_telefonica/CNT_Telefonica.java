package cnt_telefonica;
import java.util.Scanner;
public class CNT_Telefonica {
    public static void main(String[] args) {
        float tiempo,precio;
    String dia,turno;
    Scanner lectura = new Scanner(System.in);
    
    System.out.println("Ingrese el dia de la llamada (lunes,martes,miercoles,jueves,viernes,sabado,domingo)");
    dia = lectura.next();
    System.out.println("Ingrese el turno correspondiente (m)(v)");
    turno = lectura.next();
    System.out.println("Ingrese los minutos de llamada por telefono: ");
    tiempo = lectura.nextFloat();

    if(tiempo<=5){        
        precio=5;
    }else if(tiempo<=8){
        precio=(float)((tiempo-5)*0.8)+5;
    }else if(tiempo<=10){
        precio=(float)((tiempo-8)*0.7 + 7.4);
    }else{
        precio=(float)((tiempo-10)*0.5);
    }

    if(dia=="domingo"){
        precio=(float)(precio+precio*0.05);
    }else if(turno=="m"){
        precio=(float)(precio+precio*0.15);
    }else{
        precio=(float)(precio+precio*0.10);
    }
    
    System.out.println("El total de la llamada en dolares es: " + precio);
    }
    
}
