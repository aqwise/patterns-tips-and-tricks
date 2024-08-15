Certainly! Below is an equivalent tutorial for Factory Method and Abstract Factory patterns in JavaScript.

### 1. Overview
In this tutorial, we'll explore the Factory Method and Abstract Factory design patterns in JavaScript, both of which are creational design patterns. We'll use examples to illustrate each pattern.

### 2. Factory Method Pattern
Let's start with an example where we're working on an app for a vehicle manufacturer. Initially, we only had a client that built vehicles with a fuel-only engine. To adhere to the Single Responsibility Principle (SRP) and the Open-Close Principle (OCP), we'll use the Factory Method design pattern.

Before we jump into the code, here's an overview of the Factory Method pattern:

**Factory Method Pattern Default:**
```plaintext
---------------------
|     Creator       |
|-------------------|
| + createProduct() |
---------------------
        |
        v
---------------------
|    ConcreteProduct |
---------------------
```

This pattern separates the construction of a Product from the code that uses this Product, making it easier to manage and extend the application.

#### Implementation in JavaScript

**Step 1:** Define a base class or interface for `MotorVehicle`. This class has a method `build()` that will be used to create specific motor vehicles.

```javascript
class MotorVehicle {
    build() {
        throw "Abstract method!";
    }
}
```

**Step 2:** Implement concrete classes that extend `MotorVehicle`. We'll create two types: `Motorcycle` and `Car`.

```javascript
class Motorcycle extends MotorVehicle {
    build() {
        console.log("Build Motorcycle");
    }
}

class Car extends MotorVehicle {
    build() {
        console.log("Build Car");
    }
}
```

**Step 3:** Create a `MotorVehicleFactory` class. This abstract class is responsible for creating new vehicle instances.

```javascript
class MotorVehicleFactory {
    create() {
        const vehicle = this.createMotorVehicle();
        vehicle.build();
        return vehicle;
    }

    createMotorVehicle() {
        throw "Abstract method!";
    }
}
```

**Step 4:** Extend the `MotorVehicleFactory` class to implement specific vehicle factories.

```javascript
class MotorcycleFactory extends MotorVehicleFactory {
    createMotorVehicle() {
        return new Motorcycle();
    }
}

class CarFactory extends MotorVehicleFactory {
    createMotorVehicle() {
        return new Car();
    }
}
```

**Usage:**
```javascript
const motorcycleFactory = new MotorcycleFactory();
const motorcycle = motorcycleFactory.create();

const carFactory = new CarFactory();
const car = carFactory.create();
```

### 3. Abstract Factory Pattern
In the next iteration, two new vehicle companies are interested in our system: `NextGen` and `FutureVehicle`. They build both fuel-only and electric vehicles, and each company has its design. Our system needs to evolve to accommodate these changes. We'll use the Abstract Factory Pattern for this.

**Abstract Factory Pattern Default:**
```plaintext
--------------------------
|     AbstractFactory    |
|------------------------|
| + createProductA()     |
| + createProductB()     |
--------------------------
        |                   |
        v                   v
--------------------   --------------------
| ConcreteFactory1 |   | ConcreteFactory2 |
|------------------|   |------------------|
| + createProductA |   | + createProductA |
| + createProductB |   | + createProductB |
--------------------   --------------------
```

This pattern centralizes product creation code in one place.

#### Implementation in JavaScript

**Step 1:** Define a new interface for electric vehicles.

```javascript
class ElectricVehicle {
    build() {
        throw "Abstract method!";
    }
}
```

**Step 2:** Create an abstract factory `Corporation`.

```javascript
class Corporation {
    createMotorVehicle() {
        throw "Abstract method!";
    }

    createElectricVehicle() {
        throw "Abstract method!";
    }
}
```

**Step 3:** Implement specific vehicle types for `FutureVehicle` and `NextGen` companies.

```javascript
class FutureVehicleMotorcycle extends MotorVehicle {
    build() {
        console.log("Future Vehicle Motorcycle");
    }
}

class FutureVehicleElectricCar extends ElectricVehicle {
    build() {
        console.log("Future Vehicle Electric Car");
    }
}

class NextGenMotorcycle extends MotorVehicle {
    build() {
        console.log("NextGen Motorcycle");
    }
}

class NextGenElectricCar extends ElectricVehicle {
    build() {
        console.log("NextGen Electric Car");
    }
}
```

**Step 4:** Implement concrete factories for each company.

```javascript
class FutureVehicleCorporation extends Corporation {
    createMotorVehicle() {
        return new FutureVehicleMotorcycle();
    }

    createElectricVehicle() {
        return new FutureVehicleElectricCar();
    }
}

class NextGenCorporation extends Corporation {
    createMotorVehicle() {
        return new NextGenMotorcycle();
    }

    createElectricVehicle() {
        return new NextGenElectricCar();
    }
}
```

**Usage:**
```javascript
const futureVehicleCorp = new FutureVehicleCorporation();
const futureMotorcycle = futureVehicleCorp.createMotorVehicle();
const futureElectricCar = futureVehicleCorp.createElectricVehicle();

const nextGenCorp = new NextGenCorporation();
const nextGenMotorcycle = nextGenCorp.createMotorVehicle();
const nextGenElectricCar = nextGenCorp.createElectricVehicle();
```

### 4. Factory Method vs. Abstract Factory
- **Factory Method:** Uses inheritance, focusing on a single product. It relies on derived classes to implement product creation.
- **Abstract Factory:** Uses delegation and is applied over a class to create related products, centralizing creation logic.

### 5. Conclusion
We demonstrated the Factory Method and Abstract Factory design patterns using JavaScript, using a vehicle manufacturer example. The Factory Method pattern provides a flexible way to create objects, while the Abstract Factory pattern is used when a more complex system of related products is needed.

These patterns help in maintaining clean and modular code, adhering to principles like SRP and OCP.