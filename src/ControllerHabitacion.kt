class ControllerHabitacion {
    val listaHabitaciones: MutableList<Habitacion> = mutableListOf()


    fun regristodehabitacion() {
        println("Ingrese el numero de indentificacion de la habitacion ")
        val idhabitacion = readln().toInt()
        println("Ingrese el tipo ")
        val tipo = readln().toString()
        println("Ingrese la cantidad de camas disponibles")
        val camas = readln().toInt()
        println("Ingrese la informacion de la habitacion ")
        val informacion = readln().toString()
        println("Inserte el precio")
        val precio = readln().toDouble()
        println("Ingrese su situacion")
        println("Disponible")
        println("Mantemiento")
        val situacion = readln().toString()
        println("Ingrese su ubicacion")
        val ubicacion = readln().toString()
        val registedRoom = Habitacion(idhabitacion, tipo, camas, informacion, precio, situacion, ubicacion)
        listaHabitaciones.add(registedRoom)


    }


    fun showRooms(){
        for(habitacion in listaHabitaciones){
            println(" Habitacion: ${habitacion.getHabitacionData()}")
        }
    }
    fun gethabitacionbyindex (index: Int): Habitacion =listaHabitaciones [ index]

}