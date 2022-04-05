fun main(){
    odd()
    var names= takeName(arrayOf("Blair","Joseph","Gracey","Getty","Nadine","Ruth"))
    println(names)
    whichDrink(4)
    numbers()


}
 fun odd(){
     for (numbers in  1..100)
     if ((numbers%2)!=0){
         println(numbers)
     }
 }
fun takeName(names:Array<String>):Int {
    var name= 0
    names.forEach { title->
        if (title.length >5){
            name++
        }
    }
    return name
 }
fun whichDrink(age:Int){

    if ( age<6){
        println("Takes a glass of Milk")
    }
    else if (age>6 && age <15){
        println("Takes Fanta orange")
    }
    else{
        println("Takes a coke bottle")
    }
    }
fun numbers() {
    for (num in 1..100)
    if ((num%3)==0){
        println("Fizz")
    }
    else if ((num%5)==0){
        println("Buzz")
    }
    else {
        if (num%3==0 && num%5==0){
            println("Fizz Buzz")
        }
        else {
            println(num)
        }
    }
}









