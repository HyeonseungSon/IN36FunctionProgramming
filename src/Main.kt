/*
Function Programming
 - Java 언어는 완벽한 객체지향 Programming 언어입니다.
 - 모든 Code 는 Class 를 설계하고 Method 를 만들어주고
 Class 를 통해 객체를 생성해서 사용해야 합니다.
 - 하지만 Kotlin 은 함수만 만들어 사용하는 것을 지원합니다.
 - Kotlin 은 함수 사용을 보다 편리하게 할 수 있도록 하는 다양한 개념들이 있습니다.

Lambda
 - Lambda 를 활용하여 함수의 기능을 사용할 수 있습니다.
 - 간단한 Code 로 함수의 연산작업을 수행할 수 있습니다.
 - 위에서 살펴본 함수와 같은 형태는 Lambda 라는 것으로 바꿔서 사용할 수 있습니다.
 - 특정 함수 내에서만 사용할 연산 Code 를 구현할 때 사용합니다.
 */
fun main() {
    val r1 = testFun1(100, 200)
    println("r1 : $r1")

    val r2 = testFun2(1000, 2000)
    println("r2 : $r2")

    val r3 = testFun3(10000, 20000)
    println("r3 : $r3")

    // [형식 1] val 람다식이름:람다식 형식 = 람다식 내용
    val lambda1:(Int, Int) -> Int = {a1:Int, a2:Int -> a1 + a2}

    // 형식 2 : Kotlin 은 추론을 할 수 있다면 생략이 가능합니다.
    val lambda2 = {a1:Int, a2:Int -> a1+a2}

    // 형식 3
    val lambda3 : (Int, Int) -> Int = {a1, a2 -> a1 + a2}

    val r4 = lambda1(1000, 2000)
    val r5 = lambda1(100, 200)
    val r6 = lambda1(10, 20)

    println("r4 : $r4")
    println("r5 : $r5")
    println("r6 : $r6")
}

fun testFun1 (a1:Int, a2:Int) : Int {
    return a1 + a2
}

// 생략기능 1
fun testFun2 (a1:Int, a2:Int) : Int = a1 + a2

/*
생략기능 2
 - Type 생략이 가능합니다.
 - 매개변수 a1, a2 모두 Int Type 이기 때문에 return 값의 Type 또한 Int Type 일 것으로 추론할 수 있습니다.
 */
fun testFun3 (a1:Int, a2:Int) = a1 + a2




