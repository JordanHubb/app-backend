package de.HTWBerlin.webtech.Webtech.web;


import de.HTWBerlin.webtech.Webtech.PartyRestController;
import de.HTWBerlin.webtech.Webtech.service.PartyItemService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doReturn;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PartyRestController.class)
class PartyRestControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PartyItemService partyitemService;

    @Test
    @DisplayName("should return 404 if partyitem is not found")
    void partyitemNotFound() throws Exception {
        // given
        doReturn(null).when(partyitemService).findById(anyLong());

        // when
        mockMvc.perform(get("/api/v1/party/100"))
                // then
                .andExpect(status().isNotFound());
    }

}
