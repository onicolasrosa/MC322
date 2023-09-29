package src.core.usecases.action;

import src.core.entities.employees.Employee;
import src.core.entities.items.MultimediaItem;
import src.core.entities.members.Member;

public class Renewal extends Action {
    public Renewal(Member member, MultimediaItem item, Employee employee) {
        super(member, item, employee);
    }
}

