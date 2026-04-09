fun main (){
    val userName : String = "  medo_123 "
    val password: String = "2839984"
    val email : String = "medo@gmail.com"
    val anthorEmail : String = "medoahmed@gmail.com"

    val cleanUserName : String = userName.trim()
    val passwordLength : Int=password.length
println("f$cleanUserName  $passwordLength")
    print("Did you emails are equals ? ")
    println((email==anthorEmail))

    if(cleanUserName.isNullOrBlank()){
        println("Error: Username is required.")
    }
    else if (passwordLength <6){
        println("Error: Password is too short. Minimum 6 characters required.")
    }
    else if (!email.contains("@")){
        println("Error: Invalid email format.")
    }
    else{
        println("Success: User $cleanUserName registered successfully!")
    }
}