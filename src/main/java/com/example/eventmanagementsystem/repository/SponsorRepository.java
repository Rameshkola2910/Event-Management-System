/*
 * You can use the following import statements
 *
 * import java.util.ArrayList;
 * import java.util.List;
 * 
 */
package com.example.eventmanagementsystem.repository;

import com.example.eventmanagementsystem.model.*;
import java.util.ArrayList;
import java.util.List;

public interface SponsorRepository {

    ArrayList<Sponsor> getSponsors();

    Sponsor getSponsorById(int sponsorId);

    Sponsor addSponsor(Sponsor sponsor);

    Sponsor updateSponsor(int sponsorId, Sponsor sponsor);

    void deleteSponsor(int sponsorId);

    List<Event> getSponsorEvents(int sponsorId);

}