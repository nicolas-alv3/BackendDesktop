import org.junit.Test
import junit.framework.TestCase.assertEquals
import org.junit.Before
import java.time.LocalDate

class RappiditoTest {

    private lateinit var rappidito :Rappidito
    private lateinit var supervisor : Supervisor

    @Before fun setup(){
        rappidito = Rappidito()
        supervisor = Supervisor("Super Intendente Charmers","un0d05tr35")

    }

    @Test fun testAddingUsersToRappidito() {
        rappidito.addUser(Cliente("Goku", "genkidama", LocalDate.now(),"BakerStreet 103"))
        assertEquals(rappidito.users.size,1)
    }
    @Test fun testAddingRestaurantToRappidito() {
        rappidito.addRestaurant(Restaurant(1,"El Buffet","Te cansas de comer",supervisor,"Av. Siempreviva 1304"))
        assertEquals(rappidito.restaurants.size,1)
    }
}