
class Car {
    String name;
    int price;

    Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Car() {
        this("Toyota", 1000);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
// Constructor Overloading: Multiple constructors with different parameters
// Default Constructor: A constructor with no parameters that initializes default values
// this Keyword: Refers to the current object instance
// Constructor Chaining: Calling one constructor from another using this()
// toString() Method: Provides a string representation of the object        