from .observerInterface import ObserverInterface
from observable.observableInterface import ObservableInterface


class EmailObserver(ObserverInterface):
    def __init__(self, email_id, observable: ObservableInterface):
        self.email_id = email_id
        self.observable = observable

    def update(self):
        product_name, quantity = self.observable.getData()
        print(
            f"""Sent Email to: {self.email_id}.\n 
              Inventory Added. Limited Stock Available for {product_name} : {quantity} .\n
               """
        )
