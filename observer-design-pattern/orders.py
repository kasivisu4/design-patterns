from observable.stocksObservable import StocksObservable
from observer.emailObserver import EmailObserver


def main():
    iphoneStock = StocksObservable("IPhone 12")
    ipadStock = StocksObservable("IPad Pro")
    email1 = EmailObserver("test1@gmail.com", iphoneStock)
    email2 = EmailObserver("test2@gmail.com", iphoneStock)
    iphoneStock.addObserver(email1)
    iphoneStock.addObserver(email2)
    iphoneStock.setData(10)

    email3 = EmailObserver("test3@gmail.com", ipadStock)
    ipadStock.addObserver(email3)
    ipadStock.setData(5)


main()
