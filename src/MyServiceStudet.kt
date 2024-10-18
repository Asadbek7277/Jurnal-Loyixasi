import java.util.Scanner

class MyServiseStudets:MyInerface {

    private val input = Scanner(System.`in`)
    private val jurnal = ArrayList<Studet>()
    override fun addStudet() {
        print("Name student: ")
        val name = input.next()
        println("SourName student:")
        val sourName = input.next()
        val studet = Studet(name, sourName)
        jurnal.add(studet)
        println("Saqlandi")
    }

    override fun showStudet() {
        if (jurnal.isEmpty()) {
            for (studet in jurnal) {
                println(studet)

            }
        } else {
            println("Jurnal bo'sh ")
        }

    }

    override fun ettendemfys() {
        if (jurnal.isEmpty()) {
            for (i in 0 until jurnal.size) {
                println("$i ${jurnal}")

            }
            println("Kim yo'q:")
            val yaqniKirit = input.nextInt()
            jurnal[yaqniKirit].attendance = false
            println("Saqlandi")
        } else {
            println("Jurnal bo'sh ")
        }
    }
        override fun gradeStudent() {
                if (jurnal.isEmpty()) {
                    for (i in 0 until jurnal.size) {
                        println("$i ${jurnal}")

                    }
                    println("Kimga baho qo'yamiz:")
                    val bahoQoy = input.nextInt()
                   print("Bohosi")
                    val  baho = input.nextDouble()
                    jurnal[bahoQoy].grade =baho
                    println("Muvoffaqqiyatli baho qoyildi")
                } else {
                    println("Jurnal qoshildd ")
                }
        }

}




