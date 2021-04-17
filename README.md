# To run this Project you will need to have Java 1.8 or later installed and Maven v.3+

In the project directory, you will need to run:

### `mvn spring-boot:run` on the terminal. Make sure you are in the directory of the pom.xml file.

Runs the app at:
Open [http://localhost:8080](http://localhost:8080) to view it in the browser.

Also deployed on AWS:
Open [http://34.235.126.149:8080](http://34.235.126.149:8080) to view it in the browser.

You can send POST requests using Postman to these endpoints and see the responses:
Sides of triangle:
http://34.235.126.149:8080/sides
Example JSON:
{
    "ab":"1",
    "bc":"1",
    "ca":"1"
}

X,Y coordinates of triangle vertices:
http://34.235.126.149:8080/points
Example JSON:
{
    "a":{"x":"0", "y":"0"},
    "b":{"x":"10", "y":"1"},
    "c":{"x":"5", "y":"1"}
}

Or you can use the UI of the deployed frontend React app:
Open [http://34.203.29.198:3000](http://34.203.29.198:3000) to view it in the browser.

