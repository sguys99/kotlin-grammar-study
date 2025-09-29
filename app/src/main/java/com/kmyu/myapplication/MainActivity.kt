package com.kmyu.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kmyu.myapplication.ui.theme.MyApplicationTheme

//// 1. 변수, 상수
//fun main(){
//    val myName : String = "호호"
//    var myPet : String = "하하"
//
//    myPet = "강아지"
//    println("myName: $myName")
//    println("myPet: $myPet")
//
//}

//// 2. 조건문
//fun main(){
//    var isDarkModeOn : Boolean = true
//
//    if (isDarkModeOn == true){
//        println("다크 모드입니다. $isDarkModeOn")
//    }
//
//    if (isDarkModeOn != true){
//        println("다크모드가 아닙니다. $isDarkModeOn")
//    }
//
//    isDarkModeOn = false
//
//    if (isDarkModeOn){
//        println("다크모드입니다.")
//    }
//    if (!isDarkModeOn){
//        println("다크모드가 아닙니다.")
//    }
//
//    when(isDarkModeOn){
//        true -> println("다크모드 ON")
//        false -> println("다크모드 OFF")
//    }
//}

//// 3. 언래핑: 널세이프티
//
//fun main(){
//    var myName : String? = null
//
//    if (myName != null){
//        println("myName: $myName - 데이터 없음")
//    } else {
//        println("myName: $myName")
//    }
//
//    // 다음형태
//    //val myUnwrappedName = if (myName == null) "이름없음" else myName
//    // 더 간단하게
//    val myUnwrappedName : String = myName ?: "이름없음"
//
//    // 또다른 방법
//    val otherName : String = myName.let{
//        it
//    }?: "이름없음"
//
//    println("myUnwrappedName: $myUnwrappedName")
//    println("otherName: $otherName")
//}


//// 4. 배열
//fun main() {
//    //val friends = listOf("철수", "영희", "제임스")
//    val friends = listOf<String>("철수", "영희", "제임스")
//    println(friends)
//
//    val anyNames = listOf<Any>("철수", 2, 2.3, "제임스")
//    println(anyNames)
//
//    // 요소접근
//    println(friends.get(0))
//    println(friends[0])
//    println(friends.first())
//
//    // list는 immutable임
//    // friends[0] = "cheolsu" // 불가
//    val mutableFriends = mutableListOf<String>("철수", "영희", "제임스")
//    mutableFriends[0] = "cheolsu"
//    println(mutableFriends)
//
//    // array: 뮤터블임
//    val myNumbers = arrayOf(1, 2, 3)
//    // val myNumbers = arrayListOf(1, 2, 3)
//    myNumbers[0] = 888
//    println(myNumbers)
//
//    for (aNumber in myNumbers){
//        println(aNumber)
//    }
//
//}

//// 5. foreach에서 인덱스를 가져오는 방법
//fun main(){
//    val friends = listOf<String>("철수", "존시나", "에이미", "영희", "제임스")
//
//    for(aFriend in friends){
//        println("$aFriend")
//    }
//
//    // 인덱스까지 가져오려면
//    for((index, aFriend) in friends.withIndex()){
//        println("index : $index, aFriend: $aFriend")
//    }
//}
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            MyApplicationTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}

//// 6. 함수
//fun main() {
//    fun sayHi(){
//        println("안녕하세요.")
//    }
//
//    fun sayHiWithName(name: String){
//        println("안녕하세요? $name")
//    }
//
//    fun sayHiWithNameDefault(name: String = "anonymous"){
//        println("안녕하세요 $name")
//    }
//
//    fun getName() : String { // 값을 리턴하는 메서드
//        return "anonymous"
//    }
//
//    sayHi()
//    sayHiWithName("하하 할머니")
//    sayHiWithNameDefault()
//    val fetchedName : String = getName()
//    sayHiWithNameDefault(fetchedName)
//}

//// 7. mapOf: 패어 정보, 뮤터블과 이뮤터블이 있다.
//fun main(){
//    // Pair<A, B>
//
//    val nameAgePairs = mapOf<String, Int>(
//        "철수" to 10,
//        "영희" to 13,
//        "영희" to 13, // 키는 고유 값이므로 두번 들어가지 않는다.
//        )
//    println(nameAgePairs)
//
//    val nameAgePairs2 = mapOf<String, Int>(
//        Pair("철수", 20),
//        Pair("영희", 13),
//    )
//    println(nameAgePairs2)
//
//    // 빈 맵, 수정불가
//    val emptyPairs = emptyMap<String, Int>()
//    println(emptyPairs)
//
//    // 뮤터블맵, 수정가능
//    val mutableNameAgePairs = mutableMapOf<String, Int>(
//        Pair("철수", 20),
//        Pair("영희", 13),
//    )
//
//    mutableNameAgePairs.put("호호", 20)
//    mutableNameAgePairs["키키"] = 25
//
//    println(mutableNameAgePairs)
//
//    println(mutableNameAgePairs.keys)
//    println(mutableNameAgePairs.values)
//
//}

//// 8. sefOf, 유니크한 값 만 가짐, 뮤터블/ 이뮤터블 있음
//
//fun main(){
//    var myNumberSet = mutableSetOf<Int>(1, 3, 3, 3, 3, 4)
//
//    println(myNumberSet)
//
//    myNumberSet.add(10)
//    println(myNumberSet)
//
//    // toMutableSet()으로 이뮤터블로 변경 가능
//    val mutableSet = myNumberSet.toMutableSet()
//
//    // 제거
//    mutableSet.remove(1)
//    println(mutableSet)
//
//    // 인덱스 출력
//    val results = mutableSet.withIndex()
//
//    results.forEach {
//        anItem -> println("anItem : ${anItem.index}, ${anItem.value}")
//    }
//}

//// 9. enum
////enum class Pet{
////    CAT, DOG, BIRD
////}
//
//// 값을 넣을 수도 있다.
//enum class Pet(val info: String){
//    CAT("고양이"), DOG("강아지"), BIRD("앵무새")
//}
//
//fun main(){
//    val pet = Pet.DOG
//
//    if (pet==Pet.DOG){
//        println("DOG")
//    }
//
//    when(pet){
//        Pet.CAT -> println("CAT")
//        Pet.DOG -> {
//            println("DOG")
//        }
//        else -> {
//            println("BIRD")
//        }
//    }
//
//    println("${pet.info}")
//}

//// 10. 콜렉션 변환: 예를 들어 mutable을 이뮤터블로 변경가능
//fun main(){
//    val myNumberList = listOf<Int>(1, 5, 7, 3, 3, 4, 4)
//
//    val myNumberMutableList = myNumberList.toMutableList()
//
//    println(myNumberMutableList)
//
//    // set으로 변경하기(고유한 요소만 있는)
//    val myNumbersSet = myNumberList.toSet()
//    println(myNumbersSet)
//
//    //정렬하기
//    println(myNumberMutableList.toSortedSet())
//    println(myNumberMutableList.toSortedSet(comparator = Comparator.reverseOrder()))
//}

//// 11. map, index
//fun main(){
//    val myFriends = listOf<String>("철수", "제임스", "영희", "제시카")
//
//    val results = myFriends.map {name ->
//        "이름: $name"
//    }
//
//    println(results)
//
//    // 인덱스도 함께 부여하고 싶다면
//    val resultsWithIndex = myFriends.mapIndexed { index, name ->
//        "index: $index 이름: $name"
//    }
//
//    println(resultsWithIndex)
//}

//// 12. zip: 두가지의 컬렉션(자료구조)을 묶는 기능
//
//fun main(){
//    val myFriends = listOf<String>("철수", "제임스", "영희", "제시카")
//    val numbers = listOf<Int>(1, 4, 7, 9, 10, 20)
//
//    val result = myFriends.zip(numbers) // 4개에 맞춰지고 나머지는 버려짐
//
//    println(result)
//
//}

//// 13. flatten
//
//fun main(){
//    val firstFriends = listOf<String>("철수", "제임스", "영희", "제시카")
//    val secondFriends = listOf<String>("에이미", "잭슨", "윙", "세바스찬")
//
//    val totalFriends = listOf(firstFriends, secondFriends)
//    println(totalFriends) // 리스트 중첩형태
//
//    val flattenFriends = totalFriends.flatten() // 펴기
//    println(flattenFriends)
//}

// 14. associate: collection을 map으로 변환
// 컬렉션 종류
// List: 인덱스가 존재
// set: 동일한 요소 존재 불가
// map: 키와 값이 매칭

// 오선 클래스를 만들어보자.
data class Bread(val name: String, val price: Int){}

fun main(){
    val breadList = mutableListOf<Bread>()
    breadList.add(Bread("단팥빵1", 1000))
    breadList.add(Bread("단팥빵2", 1100))
    breadList.add(Bread("단팥빵3", 1200))
    breadList.add(Bread("단팥빵4", 1300))
    breadList.add(Bread("단팥빵4", 1400))
    breadList.add(Bread("단팥빵4", 1500))
    breadList.add(Bread("단팥빵4", 1600))

    println(breadList)

    /// associateWith = 키: 요소, 값: 내가 넣는 매개변수
    val breadMap1 : Map<Bread, Int> = breadList.associateWith({ it.price }) // value 가 될 것을 입력
    println("breadMap1: $breadMap1")

    // 보통은 요소를 키로 잘 안쓴다. 보통 키를 매개변수로 쓸것이다.
    // associateBy = 키: 매개변수, 값: 요소
    val breadMap2 : Map<String, Bread> = breadList.associateBy({ it.name }) // 키가 가 될 것을 입력
    println("breadMap2: $breadMap2")

    // associate = 키: 요소, 값: 요소
    val breadMap3 : Map<String, Bread> = breadList.associate({ it.name to it }) // name을 키, Bread를 값으로  설정
    println("breadMap3: $breadMap3")

    // 맵은 키가 고유해야한다.따라서 단팥빵4에서 최신 값이 업데이트 되었다.

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}