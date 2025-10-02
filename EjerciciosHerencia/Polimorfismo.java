
    //Superclase
    class Vehiculo {
        public void encender () {
            System.out.println("EL VEHICULO ESTA ENCENDIDO");
        }
        
    }

    //Subclase Carro
    class Carro extends Vehiculo {
        public void encender() {
            System.out.println("EL CARRO PRENDIO CON LLAVE");
        }
    }

    //Subclase Moto
    class Moto extends Vehiculo {
        public void encender() {
            System.out.println("LA MOTO PRENDIO CON BOTON ELECTRICO");
        
        }
    }

    //Clase principal
    public class Polimorfismo{

        static void iniciarVehiculo(Vehiculo vehiculo){
            vehiculo.encender();
        }

        public static void main(String[] args) {
            Vehiculo carro= new Carro();
            Vehiculo moto = new Moto();

            iniciarVehiculo(carro);
            iniciarVehiculo(moto);
        }
    }
