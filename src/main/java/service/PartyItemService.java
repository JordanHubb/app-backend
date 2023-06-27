package service;


import de.HTWBerlin.webtech.Webtech.api.PartyItem;
import de.HTWBerlin.webtech.Webtech.api.PartyItemManipulationRequest;
import org.springframework.stereotype.Service;
import persistence.PartyItemEntity;
import persistence.PartyItemRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartyItemService {
    private final PartyItemRepository partyItemRepository;

    public PartyItemService(PartyItemRepository partyItemRepository) {
        this.partyItemRepository = partyItemRepository;
    }

    public List<PartyItem> findAll() {
        List<PartyItemEntity> party = partyItemRepository.findAll();

        return party.stream()
                .map(this::transformEntity)
                .collect(Collectors.toList());
    }

    public PartyItem findById(Long id){
        var partyItemEntity =  partyItemRepository.findById(id);
        return partyItemEntity.map(this::transformEntity).orElse(null);
    }

    public PartyItem create(PartyItemManipulationRequest request) {
        var partyItemEntity = new PartyItemEntity(request.getDrinks(), request.getFood(), request.getTrack(),request.getSupplies(),request.getPrice(),request.isBrought());
        partyItemEntity = partyItemRepository.save(partyItemEntity);
        return transformEntity(partyItemEntity);
    }

    public PartyItem update(Long id, PartyItemManipulationRequest request){
        var partyItemEntityOptional =  partyItemRepository.findById(id);
        if(partyItemEntityOptional.isEmpty()){
            return null;
        }
        var partyItemEntity = partyItemEntityOptional.get();
        partyItemEntity.setDrinks(request.getDrinks());
        partyItemEntity.setFood(request.getFood());
        partyItemEntity.setTrack(request.getTrack());
        partyItemEntity.setSupplies(request.getSupplies());
        partyItemEntity.setPrice(request.getPrice());
        partyItemEntity.setBrought(request.isBrought());
        partyItemEntity = partyItemRepository.save(partyItemEntity);

        return transformEntity(partyItemEntity);
    }
    public boolean deleteById(Long id) {
        if(!partyItemRepository.existsById(id)){
            return false;
        }
        partyItemRepository.deleteById(id);
        return true;
    }

    private PartyItem transformEntity(PartyItemEntity partyItemEntity) {
        return new PartyItem(
                PartyItemEntity.getId(),
                partyItemEntity.getDrinks(),
                partyItemEntity.getFood(),
                partyItemEntity.getSupplies(),
                partyItemEntity.getTrack(),
                partyItemEntity.getPrice(),
                partyItemEntity.isBrought()
        );

    }


}
