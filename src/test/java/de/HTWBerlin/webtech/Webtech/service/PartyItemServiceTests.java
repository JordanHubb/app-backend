package de.HTWBerlin.webtech.Webtech.service;


import de.HTWBerlin.webtech.Webtech.persistence.PartyItemRepository;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class PartyItemServiceTests implements WithAssertions {

    @InjectMocks
    PartyItemService itemServiceTest;

    @Mock
    PartyItemRepository repository;

    @Test
    @DisplayName("Should delete a selected row and return true.")
    void deleteItem() {
        // given
        Long givenId = 47L;
        doReturn(true).when(repository).existsById(givenId);

        // when
        boolean result = itemServiceTest.deleteById(givenId);

        // then
        verify(repository).deleteById(givenId);
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("Should delete a selected row and return false if it didn't work.")
    void deleteItemFailed() {
        // given
        Long givenId = 47L;
        doReturn(false).when(repository).existsById(givenId);

        // when
        boolean result = itemServiceTest.deleteById(givenId);

        // then
        verifyNoMoreInteractions(repository);
        assertThat(result).isFalse();
    }

}
