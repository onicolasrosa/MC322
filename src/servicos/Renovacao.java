package src.servicos;

import src.membros.Member;
import src.employees.Employee;
import src.items.ItemMultimidia;

public class Renovacao extends Servico {
    public Renovacao(Member member, ItemMultimidia item, Employee employee) {
        super(member, item, employee);
    }
}

