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


// 4. 배열
fun main() {
    //val friends = listOf("철수", "영희", "제임스")
    val friends = listOf<String>("철수", "영희", "제임스")
    println(friends)

    val anyNames = listOf<Any>("철수", 2, 2.3, "제임스")
    println(anyNames)

    // 요소접근
    println(friends.get(0))
    println(friends[0])
    println(friends.first())

    // list는 immutable임
    // friends[0] = "cheolsu" // 불가
    val mutableFriends = mutableListOf<String>("철수", "영희", "제임스")
    mutableFriends[0] = "cheolsu"
    println(mutableFriends)

    // array: 뮤터블임
    val myNumbers = arrayOf(1, 2, 3)
    // val myNumbers = arrayListOf(1, 2, 3)
    myNumbers[0] = 888
    println(myNumbers)

    for (aNumber in myNumbers){
        println(aNumber)
    }

}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
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