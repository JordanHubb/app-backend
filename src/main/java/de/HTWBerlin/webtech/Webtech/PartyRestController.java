package de.HTWBerlin.webtech.Webtech;

import de.HTWBerlin.webtech.Webtech.api.PartyItem;
import de.HTWBerlin.webtech.Webtech.api.PartyItemManipulationRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PartyItemService;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


@RestController
public class PartyRestController {

    private final PartyItemService partyItemService;

    public PartyRestController(PartyItemService partyItemService) {
        this.partyItemService = partyItemService;
    }

    @GetMapping(path = "/api/v1/party")
    public ResponseEntity<List<PartyItem>> fetchParty() {
        return ResponseEntity.ok(partyItemService.findAll());
    }

    @GetMapping(path = "/api/v1/party/{id}")
    public ResponseEntity <PartyItem> fetchPartyById(@PathVariable Long id){
        var party = partyItemService.findById(id);
        return party != null? ResponseEntity.ok(party):ResponseEntity.notFound().build();
    }
    @PostMapping(path = "/api/v1/party")
    public ResponseEntity<Void> createPartyItem(@RequestBody PartyItemManipulationRequest request) throws URISyntaxException {
        var party= partyItemService.create(request);
        URI uri = new URI("/api/v1/party/" + party.getId());
        return ResponseEntity.created(uri).build();
    }

    @PutMapping(path = "/api/v1/party/{id}")
    public ResponseEntity <PartyItem> updatePartyItem(@PathVariable Long id,@RequestBody PartyItemManipulationRequest request){
        var party = partyItemService.update(id, request);
        return party != null? ResponseEntity.ok(party):ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/api/v1/party/{id}")
    public ResponseEntity <Void> deletePartyItem(@PathVariable Long id){
        boolean successful = partyItemService.deleteById(id);
        return successful? ResponseEntity.ok().build():ResponseEntity.notFound().build();
    }


}