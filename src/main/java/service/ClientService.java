package service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pojo.Clients;
import repo.ClientsRepository;

@Service
@Transactional
@RequiredArgsConstructor
public class ClientService {
    private final ClientsRepository clientsRepository;

    public Clients getClient(int id){
        return clientsRepository.findById(id).orElse(null);
    }
}
