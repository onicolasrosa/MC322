package src.items;

import java.util.ArrayList;
import java.util.List;

public abstract class ItemMultimidia {
    private String titulo;
    private String autor;
    private String categoria;
    private String estadoConservacao;
    private String localizacao;
    private int serialNumber; //representa a unidade unica de cada item, codigo com 4 letras e 4 numeros
    private boolean disponivel;
    private List<Comentario> comentarios = new ArrayList<>();

    protected ItemMultimidia(String titulo, String autor, String categoria, String estadoConservacao, String localizacao, int serialNumber) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.estadoConservacao = estadoConservacao;
        this.localizacao = localizacao;
        this.disponivel = true;
        this.serialNumber = serialNumber;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEstadoConservacao() {
        return estadoConservacao;
    }
    public void setEstadoConservacao(String estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getserialNumber() {
        return serialNumber;
    }
    public void setserialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public void addComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        this.comentarios.remove(comentario);
    }

    public void printComentarios() {
        for(Comentario comentario : this.comentarios) {
            System.out.println(comentario.getTexto());
        }
    }

    @Override
    public String toString() {
        String output = "";
        output += "Titulo: " + getTitulo() + "\n";
        output += "Autor: " + getAutor() + "\n";
        output += "Categoria: " + getCategoria() + "\n";
        output += "Estado de Conservacao: " + getEstadoConservacao() + "\n";
        output += "Localizacao: " + getLocalizacao() + "\n";
        output += "Codigo Serial: " + getserialNumber() + "\n";
        output += "Disponibilidade: " + isDisponivel() + "";
        return output;
    }
}