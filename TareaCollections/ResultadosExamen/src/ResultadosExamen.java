import java.util.HashMap;
import java.util.Map;

public class ResultadosExamen {

    public static Map getCalificacionesOriginales(){
        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 24);
        calificaciones.put("Daniel", 50);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 32);
        calificaciones.put("Kelly", 80);
        calificaciones.put("Ivan", 40);
        calificaciones.put("Maria", 59);
        calificaciones.put("Melanie", 55);
        calificaciones.put("Diego", 95);
        calificaciones.put("Miguel", 63);

        return calificaciones;

    }

    public static Map getCalificacionesRegularizacion(){

        Map calificaciones = new HashMap();
        calificaciones.put("Ana", 97);
        calificaciones.put("Daniel", 89);
        calificaciones.put("Alejandro", 79);
        calificaciones.put("Laura", 82);
        calificaciones.put("Kelly", 76);
        calificaciones.put("Ivan", 98);
        calificaciones.put("Maria", 80);
        calificaciones.put("Melanie", 95);
        calificaciones.put("Diego", 90);
        calificaciones.put("Miguel", 62);

        return calificaciones;
    }

    //public static Map getCalificacionesFinales(){

    //    Map Calificaciones1 = getCalificacionesOriginales();
    //    Map Calificaciones2 = getCalificacionesRegularizacion();

    //    System.out.println(Calificaciones1.entrySet());
    //    System.out.println(Calificaciones2.entrySet());

    //    return Calificaciones1;
    //}

    public static void main(String[] args) {

        Map <String, Integer> Calificaciones1 = getCalificacionesOriginales();
        Map <String, Integer> Calificaciones2 = getCalificacionesRegularizacion();

        System.out.println(Calificaciones1.entrySet());
        System.out.println(Calificaciones2.entrySet());
        

        for(String s:Calificaciones1.keySet())
            System.out.println("El alumno "+s+" con mejor calificacion es:"+Math.max(Calificaciones1.get(s),Calificaciones2.get(s)));

       // Map <String, Integer> calificacionMasAlta = new HashMap<String, Integer>();


    }
}