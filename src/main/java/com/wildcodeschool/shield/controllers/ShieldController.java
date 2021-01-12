package com.wildcodeschool.shield.controllers;

import com.wildcodeschool.shield.entities.City;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String champion() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    public List<City> admin() {
        List<City> cities = new ArrayList<>();
        City Paris = new City();
        Paris.setName("Paris");
        City Biarritz = new City();
        Biarritz.setName("Biarritz");
        City Bordeaux = new City();
        Bordeaux.setName("Bordeaux");
        City LaLoupe = new City();
        LaLoupe.setName("La Loupe");
        City Lille = new City();
        Lille.setName("Lille");
        City Lyon = new City();
        Lyon.setName("Lyon");
        City Marseille = new City();
        Marseille.setName("Marseille");
        City Nantes = new City();
        Nantes.setName("Nantes");
        City Orleans = new City();
        Orleans.setName("Orléans");
        City Reims = new City();
        Reims.setName("Reims");
        City Saintes = new City();
        Saintes.setName("Saintes");
        City Strasbourg = new City();
        Strasbourg.setName("Strasbourg");
        City Toulouse = new City();
        Toulouse.setName("Toulouse");
        City Tours = new City();
        Tours.setName("Tours");
        City Amsterdam = new City();
        Amsterdam.setName("Amsterdam");
        City Barcelone = new City();
        Barcelone.setName("Barcelone");
        City Berlin = new City();
        Berlin.setName("Berlin");
        City Bruxelles = new City();
        Bruxelles.setName("Bruxelles");
        City Bucarest = new City();
        Bucarest.setName("Bucarest");
        City Lisbonne = new City();
        Lisbonne.setName("Lisbonne");
        City Londres = new City();
        Londres.setName("Londres");
        City Madrid = new City();
        Madrid.setName("Madrid");
        cities.add(Paris);
        cities.add(Barcelone);
        cities.add(Biarritz);
        cities.add(Bordeaux);
        cities.add(LaLoupe);
        cities.add(Lille);
        cities.add(Lyon);
        cities.add(Marseille);
        cities.add(Nantes);
        cities.add(Orleans);
        cities.add(Reims);
        cities.add(Saintes);
        cities.add(Strasbourg);
        cities.add(Toulouse);
        cities.add(Tours);
        cities.add(Amsterdam);
        cities.add(Berlin);
        cities.add(Bruxelles);
        cities.add(Bucarest);
        cities.add(Lisbonne);
        cities.add(Londres);
        cities.add(Madrid);
        return cities;
    }
}
