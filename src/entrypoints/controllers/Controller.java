package src.entrypoints.controllers;

import src.core.usecases.action.Action;
import src.dataproviders.resource.Driver;

public class Controller {
    private Action servico;
    private Driver driver;
    private int processNumber;

    public Controller(Action servico, Driver driver, int processNumber) {
        this.servico = servico;
        this.driver = driver;
        this.processNumber = processNumber;
    }

    public Action getServico() {
        return servico;
    }
    public void setServico(Action servico) {
        this.servico = servico;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public int getProcessNumber() {
        return processNumber;
    }
    public void setProcessNumber(int processNumber) {
        this.processNumber = processNumber;
    }

}

/*
What is the role of the controller?
    The controller takes user input, converts it into the request model defined by 
    the use case interactor and passes this to the same.

    The request object accepted by the controller is defined by the controller. We 
    do NOT want the controller to depend on the view or types defined in the framework circle.

    Such request objects are usually simple data transfer objects (DTO). 
    Depending on the view technology a request object may contain typed information (e.g. WPF) 
    or just strings (e.g. HTML). It is the role of the controller to convert the given information 
    into a format which is most convenient for and defined by the use case interactor. 
    For that the controller may have some simple if-then-else or parser logic but 
    we do not want to have any processing logic inside the controller.

    Finally the controller simply calls an API on the use case interactor to trigger the processing.
 */
