package test;

public class TestAutoboxinUnBoxing {
    //cuando utilizamos envolventes en vez de primitivos, tenemos la ventaja de
    //usarlo como un tipo objet, y asi implemntar metodos predefinidos
    public static void main(String[] args) {
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero double " + entero.toString());
        
        int entero2= entero;
        System.out.println("entero2 = " + entero2);
    }
//   primitivo / envolvente
//   int - Integer
//   long - Long
//   float - Float
//   double - Double
//   boolean - Boolean
//   byte - Byte
//   short - Short        
//    
}
