package src.core.usecases.action;

import src.core.entities.employees.Employee;
import src.core.entities.items.Item;
import src.core.entities.members.Member;

public class Reservation extends Action {
    public Reservation(Member member, Item item, Employee employee) {
        super(member, item, employee);
    }
}

