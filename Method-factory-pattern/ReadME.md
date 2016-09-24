

The Method factory pattern defines an interface for creating an object , but lets it subclasses decide which classes to instantiate.

Factory method lets a class defer instantiation to subclass

Object creation through inheritance

Use me to decouple your client code from the concrete classes you nedd to instantiate or if you dont know ahead of time all the concrete classes you are going to need. To use me, just subclass me and implement my factory method.
