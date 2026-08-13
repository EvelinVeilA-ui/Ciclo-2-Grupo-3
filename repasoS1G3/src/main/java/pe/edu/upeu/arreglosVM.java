package pe.edu.upeu;

public class arreglosVM {

    public static void meses(){
        String[] mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","noviembre","Diciembre"};
        System.out.println("Tamaño: " +mes.length);
        for (String m:mes){
            System.out.println(m);
        }
        mes[11]="";
    }
    public static void main(String[] args){
       meses();
    }
}
