package com.elias.app.controller;

import com.elias.app.model.Point;
import com.elias.app.model.Triangle;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class TriangleController {

    @GetMapping("/points")
    public ResponseEntity<Triangle.TriangleType> createByPoints(@RequestBody JsonNode jsonNode) {

        Point a = new Point(jsonNode.get("a").get("x").asInt(), jsonNode.get("a").get("y").asInt());
        Point b = new Point(jsonNode.get("b").get("x").asInt(), jsonNode.get("b").get("y").asInt());
        Point c = new Point(jsonNode.get("c").get("x").asInt(), jsonNode.get("c").get("y").asInt());
        Triangle triangle = new Triangle(a,b,c,Triangle.sideLength(a,b),Triangle.sideLength(b,c),Triangle.sideLength(c,a));

        return new ResponseEntity<>(Triangle.typeOfTriangle(triangle), HttpStatus.OK);
    }

    @GetMapping("/sides")
    public ResponseEntity<Triangle.TriangleType> createBySides(@RequestBody JsonNode jsonNode) {
        Triangle triangle = new Triangle(jsonNode.get("ab").asInt(),jsonNode.get("bc").asInt(),jsonNode.get("ca").asInt());
        return new ResponseEntity<>(Triangle.typeOfTriangle(triangle), HttpStatus.OK);
    }


}
