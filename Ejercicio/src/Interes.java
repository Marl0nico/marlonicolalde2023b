public class Interes {
    public static void main(String[] args) {
        double monto; //monto depositado al final de cada año
        double principal=1000.0; //monto inicial antes de los intereses
        double tasa=0.05; //tasa de interés
        int añow=1;
        //muestra los encabezados
        System.out.printf("%-12s%-20s\n", "Año", "Monto en depósito");
        //calcula el monto en depósito para cada uno de 10 años
        for (int año=1; año<=10; año++){
            //calcula el nuevo monto para el año especificado
            monto=principal*Math.pow(1.0+tasa, año);
            //muestra el año y el monto
            System.out.printf("%-4d%, 20.2f\n", año, monto);
        }
        System.out.printf("***************************************\n");
        //mismo ejercicio ejecutado con bucle while
        while (añow<=10){
            monto=principal*Math.pow(1.0+tasa, añow);
            System.out.printf("%-4d%, 20.2f\n", añow, monto);
            añow++;
        }
    }
}