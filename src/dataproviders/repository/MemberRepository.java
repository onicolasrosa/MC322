package src.dataproviders.repository;

import src.dataproviders.resource.Driver;

public class MemberRepository extends Repository{
    public MemberRepository(Driver driver, String filePathName, String[] headerNames) {
        super(driver, filePathName, headerNames);
    }

}