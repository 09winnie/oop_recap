fun main() {
    var kendi=Kendi("Grace Kendi","Female",24)
    println(kendi)
    println(kendi.likes("Chicken Pilau","S.Africa"))
    println(kendi.hobby("Counselling","travelling","dancing","cooking","hiking","Listening to music"))
    println(kendi.friends("Milly Roberts","Don Bosco"))
    println(kendi.character("Sanguine","Choleric"))
    var user=User("Melante Tamara",7104,"AnitaB",14000,"Tamar")
    println(user.nation("Kenyan"))
    println(user.belief("Jubilee Christian Center"))
}
class Kendi(var name:String,var gender:String,var age:Int,) {
    fun likes(food: String, country: String) {
        println("My favourite meal is $food and i would love to go to $country one day.")
    }

    fun hobby(talent: String, like: String, like2: String, like3: String, like4: String, bored: String) {
        println("My talent is $talent and my hobbies are $like,$like2,$like3 and $like4.When i am bored i always $bored.")

    }

    fun friends(name: String, friend: String) {
        println("My best friends are my cousin sister,$name and $friend.")
    }

    fun character(trait: String, traitb: String) {
        println("I am a $trait and a $traitb")
    }
}
    data class User(var name:String,var admin:Int,var stream:String,var bal:Int,var password:String){
        fun nation(nationality:String){
            println("I am $nationality")
        }
        fun belief(Church:String){
            println("i believe in God and i go to $Church")
        }
}
