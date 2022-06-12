package org.nnn4eu.mssc.msscbeerinventoryservice.web.model;


import org.mapstruct.Mapper;
import org.nnn4eu.mssc.msscbeerinventoryservice.domain.BeerInventory;
import org.nnn4eu.mssc.msscbeerinventoryservice.web.mapper.DateMapper;

@Mapper(uses = {DateMapper.class})
public interface BeerInventoryMapper {

    BeerInventory beerInventoryDtoToBeerInventory(BeerInventoryDto beerInventoryDTO);

    BeerInventoryDto beerInventoryToBeerInventoryDto(BeerInventory beerInventory);
}
