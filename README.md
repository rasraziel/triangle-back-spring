# To run this Project you will need to have Java 1.8 or later installed and Maven v.3+

In the project directory, you will need to run:

### `mvn spring-boot:run` on the terminal. Make sure you are in the directory of the pom.xml file.

Runs the app at:
Open [http://localhost:8080](http://localhost:8080) to view it in the browser.

Also deployed on Render:
Open [https://triangle-back.onrender.com](https://triangle-back.onrender.com) to view it in the browser.
The Render deployment might take up to 10 sec to load (free tier).

You can send POST requests using Postman to these endpoints and see the responses:

Sides of triangle:
https://triangle-back.onrender.com/sides

Example JSON:
{
    "ab":"1",
    "bc":"1",
    "ca":"1"
}

X,Y coordinates of triangle vertices:
https://triangle-back.onrender.com/points

Example JSON:
{
    "a":{"x":"0", "y":"0"},
    "b":{"x":"10", "y":"1"},
    "c":{"x":"5", "y":"1"}
}

Or you can use the UI of the deployed frontend React app:
Open [https://triangle-front.onrender.com](https://triangle-front.onrender.com) to view it in the browser.
The Render deployment might take up to 10 sec to load.

