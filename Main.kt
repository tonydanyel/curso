fun main(args: Array<String>) {

 println("primeira nota")
  readln().toDouble()
  println("primeiro bimestre")
 var nota1bim = readln().toDouble()
 println ("segundo bimestre")
 var nota2bim = readln().toDouble()
  println ("terceiro bimestre")
 var nota3bim = readln().toDouble()
    println("quarto bimestre")
 var nota4bim = readln().toDouble()

 var media = (nota1bim+nota2bim+nota3bim+nota4bim)/4
 print("a media do aluno e:$media")

 if(media >=50)
println("aprovado")
}
