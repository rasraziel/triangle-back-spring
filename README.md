# To run this Project you will need to have Java 1.8 or later installed and Maven v.3+

In the project directory, you will need to run:

### `mvn spring-boot:run` on the terminal. Make sure you are in the directory of the pom.xml file.

Runs the app at:
Open [http://localhost:8080](http://localhost:8080) to view it in the browser.

Also deployed on Heroku:
Open [https://triangle-back.herokuapp.com/](https://triangle-back.herokuapp.com/) to view it in the browser.
The Heroku deployment might take up to 10 sec to load.

You can send POST requests using Postman to these endpoints and see the responses:

Sides of triangle:
https://triangle-back.herokuapp.com/sides

Example JSON:
{
    "ab":"1",
    "bc":"1",
    "ca":"1"
}

X,Y coordinates of triangle vertices:
https://triangle-back.herokuapp.com/points

Example JSON:
{
    "a":{"x":"0", "y":"0"},
    "b":{"x":"10", "y":"1"},
    "c":{"x":"5", "y":"1"}
}

Or you can use the UI of the deployed frontend React app:
Open [https://triangle-front-react.herokuapp.com/](https://triangle-front-react.herokuapp.com/) to view it in the browser.
The Heroku deployment might take up to 10 sec to load.

