package test;

class Asiento{
  //atributos
  String color;
  int precio;
  int registro;
  
  //metodo

  void cambiarColor(String color){
    if(color == "rojo"||color =="verde"||color=="negro"||color=="amarillo"||color=="blanco"){

      this.color = color;

    }
  }
}


  
