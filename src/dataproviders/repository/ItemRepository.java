package src.dataproviders.repository;

import src.dataproviders.resource.Driver;

public class ItemRepository extends Repository {
    public ItemRepository(Driver driver, String filePathName, String[] headerNames) {
        super(driver, filePathName, headerNames);
    }

}