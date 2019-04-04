class Rappidito {
    var users : MutableCollection<User> = mutableListOf()
    var restaurants : MutableCollection<Restaurant> = mutableListOf()

    fun addUser(user: User) {
        this.users.add(user)
    }

    fun addRestaurant(restaurant: Restaurant) {
        this.restaurants.add(restaurant)
    }



}
