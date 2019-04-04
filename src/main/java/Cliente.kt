import java.time.LocalDate


class Cliente(nombre:String, contrasenia : String, val fechaDeRegistro : LocalDate, val direccion : String ) :User(nombre,contrasenia) {

}
