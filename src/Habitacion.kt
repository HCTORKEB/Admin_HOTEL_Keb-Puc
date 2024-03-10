class Habitacion (
    val idhabitacion: Int,
    val tipo: String,
    val camas: Int,
    val informacion: String,
    val precio: Double,
    val situacion: String,
    val ubicacion:  String,
    )
    {
        fun getHabitacionData():String {

            return "tipo :$tipo numero de camas : $camas precio: $precio"
            "Informacion: $informacion"
        }
}
