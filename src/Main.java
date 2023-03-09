public class Main {
    public static void main(String[] args) {
        int result = Suma3(3,4,5);
        System.out.println(result);

        Car miCoche = new Car();
        miCoche.AddPuerta();

    }
    public static int Suma3(int a,int b,int c){
        return a+b+c;
    }
}
class Car{
    public int puertas=0;

    public void AddPuerta(){
        this.puertas++;
        System.out.println("Numero de Puertasç= "+puertas);
    }
}