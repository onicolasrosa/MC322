package src.servicos;

import src.membros.Member;
import src.employees.Employee;
import src.items.ItemMultimidia;

public class Emprestimo extends Servico {
    public Emprestimo(Member member, ItemMultimidia item, Employee employee) {
        super(member, item, employee);
    }
}

