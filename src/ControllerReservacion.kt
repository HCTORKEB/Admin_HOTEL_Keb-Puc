class ControllerReservacion {
    val listareservacion: MutableList<Reservacion> = mutableListOf()


    fun regristodereservaciones(habitacion:Habitacion ,cliente: Cliente) {
        println("Habitacion fue selecionada $habitacion ")
        println("Ingrese la fecha de inicio de la reservacion ")
        val fechaDeinicio = readln().toInt()
        println("Ingrese la fecha de salida ")
        val fechaDesalida = readln().toInt()
        println("noches")
        val total_noches= readln().toInt()
        println("cual es la cantidad de personas")
        val cantidadDepersonas = readln().toInt()

        val registedRervation = Reservacion( habitacion, fechaDeinicio,fechaDesalida,total_noches,cantidadDepersonas)
        registedRervation.calculartotal()
        listareservacion.add(registedRervation)

    }
    fun showReservaciones(){
        println("Reservaciones")
        for (reservacion in listareservacion){
            println(": ${reservacion.getReservacionData()}\"")
        }
    }
    fun getReservacionesbyindex (index: Int): Reservacion =listareservacion [ index]

}