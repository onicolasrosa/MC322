package src.dataproviders.repository;

import src.dataproviders.resource.Driver;

public class EmployeeRepository extends Repository {
    public EmployeeRepository(Driver driver, String filePathName, String[] headerNames) {
        super(driver, filePathName, headerNames);
    }
    
}