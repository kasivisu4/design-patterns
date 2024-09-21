In the observer design pattern, there are mainly 2 primary components:

- Observable: It maintains the state of the object. It keeps track of all the observers and triggers notifications if there is any state change.
- Observer: It gets the details from the observable and performs business logic, such as triggering messages.

An example includes the Amazon notification method, where if a product gets any inventory, a message is sent, or an email is triggered to the user.