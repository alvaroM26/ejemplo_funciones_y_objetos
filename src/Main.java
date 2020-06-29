public class Main {

    public static void main(String[] args) {
        System.out.println("--Ejemplo con String--");
        System.out.println("-----------");
        String s = "Hola";
        System.out.println(s);
        System.out.println("-----------");
        cambiarString(s);
        System.out.println(s);
        System.out.println("-----------");

        System.out.println("--Ejemplo con Clase que contiene String--");
        System.out.println("-----------");
        ClaseEjemplo objetoEjemploEnMain = new ClaseEjemplo();
        objetoEjemploEnMain.s = "Hola";
        System.out.println("-----------");
        System.out.println(objetoEjemploEnMain.s);
        System.out.println("-----------");
        cambiarString(objetoEjemploEnMain);
        System.out.println(objetoEjemploEnMain.s);
        System.out.println("-----------");

        System.out.println("--Ejemplo con Clase que contiene String y hacemos copia--");
        System.out.println("-----------");
        objetoEjemploEnMain.s = "Hola";
        System.out.println("-----------");
        System.out.println(objetoEjemploEnMain.s);
        System.out.println("-----------");
        cambiarStringConCopia(objetoEjemploEnMain);
        System.out.println(objetoEjemploEnMain.s);
        System.out.println("-----------");
    }

    public static void cambiarString(String s){
        // Se ha creado un nuevo objeto y "s" ahora tiene la referencia
        // a ese nuevo objeto. Una vez terminada la función, ese objeto
        // desaparece.
        s = "Adios";

    }

    public static void cambiarString(ClaseEjemplo objetoEjemploEnFuncion){
        // "objetoEjemploEnFuncion" es una referencia que apunta al mismo objeto
        // al que apunta "objetoEjemploEnMain", por tanto, si modificamos "s",
        // el cambio es persistente.
        objetoEjemploEnFuncion.s = "Adios";
    }

    public static void cambiarStringConCopia(ClaseEjemplo objetoEjemploEnFuncion){
        // "objetoEjemploEnFuncion" es una referencia que apunta al mismo objeto
        // al que apunta "objetoEjemploEnMain". Al hacer objetoEjemploEnFuncion = new ClaseEjemplo();
        // objetoEjemploEnFuncion apunta a un nuevo objeto que contiene un nuevo "s",
        // cuando termine el nuevo objeto desaparece.
        objetoEjemploEnFuncion = new ClaseEjemplo();
        objetoEjemploEnFuncion.s = "Adios";
    }
}
