
class(Observable)----------------------------------Interface(Observer)
      |                                             |
      |                                             |
      |                                             |
  setchanged()                               addObserver()
  notifyObservers()                         deleteObserver()
  
  
  
  For Observer to receive notifications:
  
  update(Observable o. Object arg)
  
