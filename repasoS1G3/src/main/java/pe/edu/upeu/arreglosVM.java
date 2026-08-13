package pe.edu.upeu;

public class arreglosVM {

    public static void meses(){
        String[] mes={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","noviembre","Diciembre"};
        System.out.println("Tamaño: " +mes.length);
        for (String m:mes){
            System.out.println(m);
        }
        mes[11]="";
        for (String m:mes){
            if(!m.equals(""))
            System.out.println(m);
        }
    }
    public static void imprimirmatris(int [][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]!=0){
                    System.out.print(m[i][j]+"\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.print("");
        }
    }
    public static void main(String[] args){
       meses();
       int [][] m={{0,2},{3,4}};
       imprimirmatris(m);
    }
}
