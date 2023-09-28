package src.dataproviders.repository;

import src.dataproviders.resource.Driver;

public class ManagementRepository extends Repository{
    public ManagementRepository(Driver driver, String filePathName, String[] headerNames) {
        super(driver, filePathName, headerNames);
    }
    
}
