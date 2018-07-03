package com.rushedstudio.domino.service.impl;

import com.rushedstudio.domino.api.mapper.CountryMapper;
import com.rushedstudio.domino.api.model.dto.CountryDTO;
import com.rushedstudio.domino.domain.Country;
import com.rushedstudio.domino.repository.CountryRepository;
import com.rushedstudio.domino.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.Collator;
import java.util.*;

@Service
public class CountryServiceImpl implements CountryService {

    private CountryRepository countryRepository;

    @Autowired
    public CountryServiceImpl(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    // add

    @Override
    public void addCountryList() {

        List<Country> countries = new ArrayList<Country>();

        // Get ISO countries, create Country object and
        // store in the collection.
        String[] isoCountries = Locale.getISOCountries();
        for (String country : isoCountries) {
            Locale locale = new Locale("en", country);
            String iso = locale.getISO3Country();
            String code = locale.getCountry();
            String name = locale.getDisplayCountry();

            if (!"".equals(iso) && !"".equals(code) && !"".equals(name)) {
                countries.add(new Country(iso, code, name));
            }
        }

        // Sort the country by their name and then display the content
        // of countries collection object.
        Collections.sort(countries, new CountryComparator());

        for (Country country : countries) {
            System.out.println(country);
            countryRepository.save(country);
        }
    }

    // get


    @Override
    public CountryDTO getCountryById(Short countryId) {
        return CountryMapper.INSTANCE.countryToCountryDTO(countryRepository.getOne(countryId));
    }

    @Override
    public CountryDTO getCountryByName(String countryName) {
        return CountryMapper.INSTANCE.countryToCountryDTO(countryRepository.findByName(countryName));
    }

    @Override
    public CountryDTO getCountryByCode(String countryCode) {
        return CountryMapper.INSTANCE.countryToCountryDTO(countryRepository.findByCode(countryCode));
    }

    @Override
    public CountryDTO getCountryByIso(String countryIso) {
        return CountryMapper.INSTANCE.countryToCountryDTO(countryRepository.findByIso(countryIso));
    }

    /**
     * CountryComparator class.
     */
    class CountryComparator implements Comparator<Country> {
        private Comparator<Object> comparator;

        CountryComparator() {
            comparator = Collator.getInstance();
        }

        public int compare(Country c1, Country c2) {
            return comparator.compare(c1.getName(), c2.getName());
        }
    }

}

