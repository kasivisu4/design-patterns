from .observableInterface import ObservableInterface


class StocksObservable(ObservableInterface):
    def __init__(self, name, quantity=0):
        self.observers = []
        self.name = name
        self.quantity = quantity

    def addObserver(self, observer):
        self.observers.append(observer)

    def removeObserver(self, observer):
        self.observers.remove(observer)

    def notifyObservers(self):
        for observer in self.observers:
            observer.update()

    def getData(self):
        return self.name, self.quantity

    def setData(self, quantity):
        self.quantity = quantity
        self.notifyObservers()
