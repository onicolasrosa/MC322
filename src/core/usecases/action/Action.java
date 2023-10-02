package src.core.usecases.action;

import src.core.entities.employees.Employee;
import src.core.entities.items.Item;
import src.core.entities.members.Member;

/*
Servico será controlado pelo controller, 
o servico faz a ligacao entre os membros
alem disso, contem as logicas de negocio
*/

public class Action {
    private Member member;
    private Item item;
    private Employee employee;

    public Action(Member member, Item item, Employee employee) {
        this.member = member;
        this.item = item;
        this.employee = employee;
    }

    public Member getMember() {
        return member;
    }
    public void setMember(Member member) {
        this.member = member;
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
}
