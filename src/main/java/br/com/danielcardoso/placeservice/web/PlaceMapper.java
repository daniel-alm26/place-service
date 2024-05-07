package br.com.danielcardoso.placeservice.web;

import br.com.danielcardoso.placeservice.api.PlaceResponse;
import br.com.danielcardoso.placeservice.domain.Place;

public class PlaceMapper {
    public static PlaceResponse fromPlaceToResponse(Place place) {
        return new PlaceResponse(place.name(), place.slug(), place.state(), place.createdAt(), place.updatedAt());
    }
}
