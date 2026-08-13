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
            System.out.println("");
        }
    }
    public static int [][] matrizF5(int tamano,int numl){
        int matriz[][]=new int[tamano][tamano];
        for (int i=0;i<matriz.length;i++){
            for (int j=matriz[0].length-1;j >=matriz[0].length-1-i;j--){
                matriz[i][j]=numl;
                numl++;
            }
        }
        return matriz;
    }
    public static void main(String[] args){
       //meses();
       // int [][] m={{1,2,6},{3,4,2},{5,6,7}};
       // imprimirmatris(m);
        imprimirmatris(matrizF5(5,1));
    }
}
