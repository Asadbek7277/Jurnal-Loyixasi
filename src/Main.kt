import java.util.Scanner

fun main() {
   val input = Scanner(System.`in`)
    val myServiseStudets = MyServiseStudets()
    while (true){
        println("1-Add Studet\n2-Showdent studet\n3->Attendence")
    val n = input.nextInt()
        when(n){
        1->myServiseStudets.addStudet()
            2->myServiseStudets.showStudet()
            3->myServiseStudets.ettendemfys()
            else-> println("Bunday funksiya  hali yo'q")
        }
    }
}
