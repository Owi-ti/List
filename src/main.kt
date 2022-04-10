fun main(){
    evenNumber(listOf("Kelly", "Klein","Aeden","Esther","Diana","Viola","Alban","Emmah","Leah","Angel"))

     var X=totalHeight(listOf(90,70,94,87,69,97))
             println(X)

     var a= person("Diana",23,100,56)
     var b= person("Esther",20,110,56)
     var c= person("Leah",30,113,70)
     var d= person("Viola",26,127,60)
             var ages= mutableListOf(a,b,c,d)
             var sortedages= ages.sortedByDescending { person-> person.age }
             println(sortedages)
 var list= mutableListOf<person>(person("Angel",7,34,30),person("Emmah",17,70,62))
       ages.addAll(list)
    println(ages)


    var x= Car("03gu43",540.5)
    var y= Car("BD51 SMR",320.5)
    var z= Car("ABC31S",375.0)
            var vihecles= listOf(x,y,z)
            println(Avarage(vihecles))
}


//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc     (2 points)

//2. Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height    (2 points)

//3. Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age   (2 points)

//4.  Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
//(1 points)

//5. Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.      (3 points)

//1.
fun evenNumber(Number:List<String>):List<String>{
    Number.forEachIndexed { index, e ->
        if (index % 2 == 0)
            println(e)
    }
              return Number
}

//2.
  fun totalHeight(students: List<Int>):String{
      var sum= students.sum()
      var average= students.average()
      var total= "$sum $average"

           return  total
  }

//3.
 data  class  person( var Name:String, var age:Int, var height:Int, var weight:Int){

 }
//4
 fun anotherList(Name:List<Any>):List<Any>{
        return  listOf()

 }

//5.
    class Car(var registration:String,var mileage:Double)

    fun Avarage(Distance:List<Car>):Double {
        var total= 0.0
        Distance.forEach { Car ->
            total+=Car.mileage
        }
        var avg= total/Distance.count()
        return avg
    }






