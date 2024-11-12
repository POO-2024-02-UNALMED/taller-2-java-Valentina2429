package test;

class Auto{
    //atributos
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){
        int numAsientos = 0;

        for (int i =0; 1 < asientos.length;i++){

            if (asientos[i] != null){
                numAsientos++;

            }

        }
        return numAsientos;
    }

    String verificarIntegridad(){

        if(this.registro == this.motor.registro){

            for(int i = 0, i < this.asientos.lenght; i++){

                if(asientos[i] != null){

                    if(asientos[i].registro != this.registro){
                        return "Las piezas no son originales";
                    }
                }
            }
            return "Auto original";
        }
        else{
            return "Las piezas no son originales";
        }
    }
}
