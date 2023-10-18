import kotlin.math.ln

fun main(args: Array<String>) {
    println("digite um numero")
    var x= readln().toDouble()
    println("digite outro numero")
    var y= readln().toDouble()

    print("a soma e ")
    println(soma(x,y))

    print("a subitrair e ")
    println(subtrair(x,y))

    print("a multiplicar e ")
    println(multiplicar(x,y))

    print("a dividir e ")
    println(dividir(x,y))
}

fun soma(numero1:Double,numero2:Double):Double{
    return numero1+numero2
}

fun subtrair(numero1:Double,numero2:Double):Double{
    return numero1-numero2
}

fun multiplicar(numero1:Double,numero2:Double):Double{
    return numero1*numero2


}

fun dividir(numero1:Double,numero2:Double):Double{
    return numero1/numero2


}