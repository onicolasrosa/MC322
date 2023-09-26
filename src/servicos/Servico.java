package src.servicos;

import src.membros.Member;
import src.employees.Employee;
import src.items.ItemMultimidia;

/*
Servico será controlado pelo controller, 
o servico faz a ligacao entre os membros
alem disso, contem as logicas de negocio
*/

public class Servico {
    private Member member;
    private ItemMultimidia item;
    private Employee employee;

    public Servico(Member member, ItemMultimidia item, Employee employee) {
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
    public ItemMultimidia getItem() {
        return item;
    }
    public void setItem(ItemMultimidia item) {
        this.item = item;
    }
    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    
}
