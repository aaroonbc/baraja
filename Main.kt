//Crear una clase Rectángulo, con atributos base y altura. Con  métodos para calcular el área y el perímetro. Opcionalmente se puede crear el método toString para mostrar información sobre el rectángulo.
//En el programa principal, crear varios rectángulos y mostrar por pantalla sus áreas y perímetros.

class Rectangulo {
    var base= 0
    var altura= 0

    fun imprimir(){
        print("La base es $base")
        print("La altura es $altura")
        print("el área es: ")
        print(area())
        print("el perímetro: ")
        print(perimetro())
    }

    fun area():Int{
        var area=(base*altura)/2
        return area
    }

    fun perimetro():Int{
        var perimetro=((base*2)+(altura*2))
        return perimetro
    }
}



Main.kt

fun main(){
    var rectangulo1:Rectangulo
    rectangulo1=Rectangulo()
    rectangulo1.base=10
    rectangulo1.altura=20
    rectangulo1.area()
    rectangulo1.perimetro()
    var rectangulo2:Rectangulo
    rectangulo2=Rectangulo()
    rectangulo2.base=48
    rectangulo2.altura=50
    println(rectangulo2.area())
    println(rectangulo2.perimetro())}