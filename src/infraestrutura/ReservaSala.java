package src.infraestrutura;

import java.util.ArrayList;

public class ReservaSala {
    private String dataReserva;
    private String horaInicio;
    private String horaFim;
    private StatusReserva status;

    public ReservaSala(String dataReserva, String horaInicio, String horaFim) {
        this.dataReserva = dataReserva;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.status = StatusReserva.PENDENTE;
    }

    public enum StatusReserva {
        PENDENTE, CONFIRMADA, CANCELADA
    }

    public String getDataReserva() {
        return dataReserva;
    }
    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }
    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public StatusReserva getStatus() {
        return status;
    }
    public void setStatus(StatusReserva status) {
        this.status = status;
    }

    public class SalaIndividual {
        private int numeroSala;
        private boolean computadorDisponivel;

        public SalaIndividual(int numeroSala, boolean computadorDisponivel) {
            this.numeroSala = numeroSala;
            this.computadorDisponivel = computadorDisponivel;
        }

        public int getNumeroSala() {
            return numeroSala;
        }
        public void setNumeroSala(int numeroSala) {
            this.numeroSala = numeroSala;
        }

        public boolean isComputadorDisponivel() {
            return computadorDisponivel;
        }
        public void setComputadorDisponivel(boolean computadorDisponivel) {
            this.computadorDisponivel = computadorDisponivel;
        }
    }

    public class SalaGrupo {
        private int capacidadeMaxima;
        private boolean equipMultimidia;

        public SalaGrupo(int capacidadeMaxima, boolean equipMultimidia) {
            this.capacidadeMaxima = capacidadeMaxima;
            this.equipMultimidia = equipMultimidia;
        }

        public int getCapacidadeMaxima() {
            return capacidadeMaxima;
        }
        public void setCapacidadeMaxima(int capacidadeMaxima) {
            this.capacidadeMaxima = capacidadeMaxima;
        }

        public boolean isEquipMultimidia() {
            return equipMultimidia;
        }
        public void setEquipMultimidia(boolean equipamentoApresentacao) {
            this.equipMultimidia = equipamentoApresentacao;
        }
    }

    public class SalaSilenciosa {
        private int numeroAssentos;
        private boolean cabinesIndividuais;

        public SalaSilenciosa(int numeroAssentos, boolean cabinesIndividuais) {
            this.numeroAssentos = numeroAssentos;
            this.cabinesIndividuais = cabinesIndividuais;
        }

        public int getNumeroAssentos() {
            return numeroAssentos;
        }

        public void setNumeroAssentos(int numeroAssentos) {
            this.numeroAssentos = numeroAssentos;
        }

        public boolean isCabinesIndividuais() {
            return cabinesIndividuais;
        }

        public void setCabinesIndividuais(boolean cabinesIndividuais) {
            this.cabinesIndividuais = cabinesIndividuais;
        }
    }

    public class SalaMultimidia {
        private ArrayList<String> equipamentosDisponiveis;

        public SalaMultimidia(ArrayList<String> equipamentosDisponiveis) {
            this.equipamentosDisponiveis = equipamentosDisponiveis;
        }

        public ArrayList<String> getEquipamentosDisponiveis() {
            return equipamentosDisponiveis;
        }

        public void setEquipamentosDisponiveis(ArrayList<String> equipamentosDisponiveis) {
            this.equipamentosDisponiveis = equipamentosDisponiveis;
        }

        public void addEquipamento(String novoEquipamento) {
            this.equipamentosDisponiveis.add(novoEquipamento);
        }

        public void removeEquipamentoByIndex(int target) {
            this.equipamentosDisponiveis.remove(target);
        }
    }
}
