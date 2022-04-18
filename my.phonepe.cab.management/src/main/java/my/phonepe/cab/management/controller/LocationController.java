package my.phonepe.cab.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.phonepe.cab.management.entity.Location;
import my.phonepe.cab.management.services.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

    @Autowired
    LocationService locationService;

    @PostMapping(value = "/onboard")
    public Location addLocation(@RequestBody Location location) {
        return locationService.addOrUpdate(location);
    }

    @PutMapping(value = "/update")
    public Location updateLocation(@RequestBody Location location) {
        return locationService.addOrUpdate(location);
    }

    @PatchMapping(value = "/deactivate")
    public Location deactivateLocation(@RequestBody Location location) {
        return locationService.addOrUpdate(location);
    }
}
