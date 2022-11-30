class myCar:
    def __init__(self, manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color
    def accelerate(self):
        print(self.manufacturer, " ", self.model, "is moving")

    def stop(self):
        print(self.manufacturer, " ", self.model, "has stopped")

car1 = myCar("Toyota", "Corolla", "2015", "Manual", "White")
car2 = myCar("Maruti", "800", "2013", "Manual", "Red")
car3 = myCar("Suzuki", "Swift", "2017", "Automatic", "Black")

car1.accelerate()
car2.stop()

