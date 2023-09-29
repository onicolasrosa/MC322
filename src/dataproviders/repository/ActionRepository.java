package src.dataproviders.repository;

import src.dataproviders.resource.Driver;

public class ActionRepository extends Repository{
    public ActionRepository(Driver driver, String filePathName, String[] headerNames) {
        super(driver, filePathName, headerNames);
    }

}