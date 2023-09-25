package src.items;

import java.util.ArrayList;
import java.util.List;

public class ItemBiblioteca<T extends ItemMultimidia> {
    private List<T> itensReservados;
    private List<T> itensEmprestados;
    private int numItensEmpresados;
    private int numItensReservados;

    public ItemBiblioteca() {
        this.itensReservados = new ArrayList<>();
        this.itensEmprestados = new ArrayList<>();
        this.numItensEmpresados = 0;
        this.numItensReservados = 0;
    }

    public int getNumItensEmpresados() {
        return this.numItensEmpresados;
    }

    public void setNumItensEmpresados(int newTotalAmount) {
        this.numItensEmpresados = newTotalAmount;
    }

    public int getNumItensReservados() {
        return this.numItensReservados;
    }

    public void setNumItensReservados(int newTotalAmount) {
        this.numItensReservados = newTotalAmount;
    }

    public void reservarItem(T item) {
        if (!this.itensReservados.contains(item)) {
            this.itensReservados.add(item);
            this.numItensReservados++;
            System.out.println("Item reservado: " + item.getTitulo());
        } else {
            System.out.println("Este item já está reservado.");
        }
    }

    public void emprestarItem(T item) {
        if (!this.itensReservados.contains(item) && !this.itensEmprestados.contains(item)) {
            this.itensEmprestados.add(item);
            this.numItensEmpresados++;
            System.out.println("Item emprestado: " + item.getTitulo());
        } else {
            System.out.println("Este item não pode ser emprestado.");
        }
    }

    public void devolverItem(T item) {
        if (this.itensEmprestados.contains(item)) {
            this.itensEmprestados.remove(item);
            this.numItensEmpresados--;
            System.out.println("Item devolvido: " + item.getTitulo());

            if (this.itensReservados.contains(item)) {
                emprestarItem(item);
            }
        } else {
            System.out.println("Este item não foi emprestado.");
        }

    }

    
}
