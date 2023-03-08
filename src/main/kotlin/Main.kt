fun main() {var car = Car("nissan","note","red",7)
    car.carry(9)
    car.carry(3)
    car.identity()
    println(car.calculateParkingFees(50))

var bus = Bus("type c","martz","red",7)
    bus.calculateParkingFees(2)
    bus.identity()
    bus.carry(14)
    println(bus.maximumAmount(20.0))
    println(bus.calculateParkingFees(24))
}
open class Vehicle(var make: String,var model: String,var color: String,var capacity: Int){
    fun carry(people: Int){

        var x=people-capacity
        if (people <= (capacity)){
            println("Carrying $people passengers")}
        else{
            println("Over capacity by $x people")}
    }
    fun identity(){
        println("I am a $color $make $model")
    }
    open fun calculateParkingFees(hours: Int): Int{
        var calculation= hours*20
        return calculation
    }
}

class Car( make: String,model: String,color: String,capacity:Int):Vehicle(make, model, color, capacity){
    }

class Bus(make: String,model: String,color: String,capacity: Int):Vehicle(make, model, color, capacity){
    fun maximumAmount(fare: Double): Double{
        return fare.times(capacity)
    }

    override fun calculateParkingFees(hours: Int): Int {
//        return super.calculateParkingFees(hours)
        var calc=hours*capacity
        return calc

    }
    }


