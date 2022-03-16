import java.util.*
import kotlin.collections.forEach as forEach1

fun main(){
    println(names(arrayOf(5,7)))
    println(mixed(arrayOf(0.5,"sudan" , 10 ,20.35 ,"jane" )))
    println(alphabets(arrayOf('f' ,'a' , 'z' ,'e' , 'i', 'p' , 'o' ,'u')))

}
fun names(word:Array<Int>):Int{
    var product=1
    word.forEach1 { owl->
        product*=owl
    }
    return product

}

fun mixed(numbers:Array<Any>):Double{
    var numericals=0.0
    numbers.forEach1 { stone->
      if (stone is Double)
          numericals+=stone.toDouble()

    }
    return numericals

}
fun alphabets(words: Array<Char>): Int{
    var numerics = 0
    words.forEach1 { vowel->
        if (vowel=='a' ||vowel=='e' ||vowel=='i' ||vowel=='o' ||vowel=='u')
            numerics++

    }
    return numerics

}



