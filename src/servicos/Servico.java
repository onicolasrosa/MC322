package src.servicos;

import src.membros.Member;
import src.repositorio.Driver;
import src.employees.Employee;
import src.items.ItemMultimidia;

public class Servico {
    private Member member;
    private ItemMultimidia item;
    private Employee employee;
    private Driver driver;
    private int processNumber;

    public Servico(Member member, ItemMultimidia item, Employee employee, Driver driver, int processNumber) {
        this.member = member;
        this.item = item;
        this.employee = employee;
        this.driver = driver;
        this.processNumber = processNumber;
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
