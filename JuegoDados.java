import java.util.Scanner; 


public class JuegoDados {
static Scanner lectura=new Scanner(System.in);
public static void main(String[] args) {
   Jugador jugador=new Jugador();
    Dado dado1=new Dado();
    Dado dado2=new Dado();
   
    tirarDados(dado1,dado2);
   sumarCaras(dado1,dado2,jugador);

   while(jugador.getEstatus()=="Repetir"){
   System.out.println("Tiene otra oportunidad, pero los puntos obtenidos se acumularan");
   repetirJuego(dado1,dado2,jugador);
   }
   System.out.println(jugador.getEstatus());

}

public static void tirarDados(Dado d1, Dado d2){
   int cara1;
   int cara2;
   int validar;
    do{
        System.out.println("Escriba el valor de dado 1");
        cara1=lectura.nextInt();
        System.out.println("Escriba el valor de dado 2");
        cara2=lectura.nextInt();
        validar=validarCaras(cara1,cara2);
    }while(validar==2);
    d1.setCara(cara1);
    System.out.println("El primer dado tiene un valor de:");             
    System.out.println(d1.getCara()); 
    d2.setCara(cara2);
    System.out.println("El segundo dado tiene un valor de:");
    System.out.println(d2.getCara());
    
}

public static void sumarCaras(Dado d1, Dado d2, Jugador j){
    int suma;
    suma=d1.getCara()+d2.getCara();
    j.setPuntosObt(suma);
    j.setEstatus();
    System.out.println("Usted obtuvo: "+j.getPuntosObt()+" puntos");



}

public static void repetirJuego(Dado d1, Dado d2, Jugador j){
    int puntAnterior=j.getPuntosObt();
    int nuevaPuntos;
   int opcion;
   System.out.println("¿Quiere intentarlo de nuevo?  1-Si   2-No");
   opcion=lectura.nextInt();
   j.setPuntosObt(12);
   j.setEstatus();
  
   while(opcion==1){
    tirarDados(d1, d2);
    sumarCaras(d1, d2, j);
    nuevaPuntos=puntAnterior+j.getPuntosObt();
    System.out.println("Sumando su puntuacion anterior usted tiene "+nuevaPuntos);
    j.setPuntosObt(nuevaPuntos);
    opcion=2;
   }
    
}
public static int validarCaras(int c1, int c2){
    if((c1<7 && c1>0)&&(c2<7 && c2>0)){
        return 1;
    }
    else{
        System.out.println("Datos erroneos, vuelva a intentar");
        return 2;
    }

}
}
