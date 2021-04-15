package com.elias.app.controller;
import com.elias.app.model.Point;
import com.elias.app.model.Triangle;
import com.elias.app.model.TriangleRequestPoints;
import com.elias.app.model.TriangleRequestSides;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/")
public class TriangleController {

    @PostMapping("/points")
    public ResponseEntity<Triangle.Type> createByPoints(@RequestBody TriangleRequestPoints req) {

        if (isInvalidRequestPoints(req))
            return new ResponseEntity<>(Triangle.Type.NONE, HttpStatus.BAD_REQUEST);
        Triangle triangle = mapTrianglePointsRequestToTriangle(req);
        return new ResponseEntity<>(triangle.typeOfTriangle(), HttpStatus.OK);
    }

    @PostMapping("/sides")
    public ResponseEntity<Triangle.Type> createBySides(@RequestBody TriangleRequestSides req) {

        if (isInvalidRequestSides(req))
            return new ResponseEntity<>(Triangle.Type.NONE, HttpStatus.BAD_REQUEST);
        Triangle triangle = mapTriangleSidesRequestToTriangle(req);
        return new ResponseEntity<>(triangle.typeOfTriangle(), HttpStatus.OK);
    }

    // Checking if 2 points are the same or if all points have the same X or Y coordinate. An impossible triangle.
    public boolean isInvalidRequestPoints(TriangleRequestPoints req) {
        Point a = req.getA();
        Point b = req.getB();
        Point c = req.getC();
        double aX = req.getA().getX();
        double aY = req.getA().getY();
        double bX = req.getB().getX();
        double bY = req.getB().getY();
        double cX = req.getC().getX();
        double cY = req.getC().getY();
        return a.equals(b) || a.equals(c) || c.equals(b) || aX == bX && bX == cX && cX == aX|| aY == bY && bY == cY && cY == aY;
    }

    // Checking if sides are 0 length or if the sum of 2 sides is less or equal to the 3rd. An impossible triangle.
    public boolean isInvalidRequestSides(TriangleRequestSides req) {
        double ab = req.getAb();
        double bc = req.getBc();
        double ca = req.getCa();
        return ab ==0 || bc ==0 || ca == 0 || ab+bc<=ca || bc+ca<=ab || ca+ab<=bc;
    }

    //Mappers mapping the requests to a Triangle object
    Triangle mapTrianglePointsRequestToTriangle(TriangleRequestPoints req) {
        return new Triangle(req.getA(), req.getB(), req.getC());
    }

    Triangle mapTriangleSidesRequestToTriangle(TriangleRequestSides req) {
        return new Triangle(req.getAb(), req.getBc(), req.getCa());
    }

}
