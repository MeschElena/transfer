fun main() {
    val likes = 63
    val man : String
    val likesDel10 =  likes % 10
    val likesDel100 = likes % 100
    man = if (likesDel100 != 11 && likesDel10 == 1){
        "человеку"
    }
    else{
        "людям"
    }
    println("Понравилось $likes $man")
}