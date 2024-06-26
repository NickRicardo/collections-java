package main.java.map.Ordenacao;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
//        Evento evento = new Evento(nome,atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
//        Set<LocalDate>dataSet = eventoMap.keySet();
//        Collection<Evento> values = eventoMap.values();
//        eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        for (Map.Entry<LocalDate, Evento> entry : eventoMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximaData  + "acontecerá na data " + proximoEvento);
                break;
            }
        }
    }
}
